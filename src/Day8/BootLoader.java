package Day8;

import io.StringInputReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BootLoader {

    private ArrayList<String> code;
    private int acc;
    private int currentLine;
    private LinkedList<Integer> executedLines;

    public BootLoader(String codeLoc) {
        acc = 0;
        currentLine = 1;
        executedLines = new LinkedList<Integer>();

        code = new ArrayList<String>();
        try {
            code = StringInputReader.readInputFile(codeLoc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * If the current line exists and has never been executed yet, the line will be executed and true be returned, else false will be returned.
     * @return
     */
    public boolean executeNextLine(int corruptedLine) {
        if(executedLines.contains(currentLine)) {
            return false;
        }
        executedLines.add(currentLine);
        String command = code.get(currentLine).split(" ")[0];
        String number = code.get(currentLine).split(" ")[1];

        if(currentLine == corruptedLine) {
            if(command.equals("nop")) command = "jmp";
            if(command.equals("jmp")) command = "nop";
        }

        if(command.equals("nop")) {
            //System.out.println("Line " + currentLine + " had no operation.");
            if(currentLine == corruptedLine) currentLine += Integer.parseInt(number);
            else currentLine++;
        }
        else if(command.equals("acc")) {
            //System.out.println("Line " + currentLine + " increased acc by " + Integer.parseInt(number) + ". The new value of acc is " + acc + ".");
            currentLine++;
            acc += Integer.parseInt(number);
        }
        else if(command.equals("jmp")) {
            //System.out.println("Line " + currentLine + " made a jump to line " + (currentLine+Integer.parseInt(number)) + ".");
            if(currentLine == corruptedLine) currentLine++;
            else currentLine += Integer.parseInt(number);
        }
        else return false;

        return true;
    }

    public void reset() {
        executedLines.clear();
        currentLine = 0;
        acc = 0;
    }
    public int executeUntilLoop() {
        while(executeNextLine(-1));
        return acc;
    }
    public boolean executesWithoutLoop(int supposedlyCorruptedLine) {
        while(executeNextLine(supposedlyCorruptedLine));
        if(currentLine != code.size()) return false;
        else return true;
    }
    public int getAccWithFixedCorruptedLine() {
        int supposedlyCorruptedLine = 0;
        for(; supposedlyCorruptedLine<code.size(); supposedlyCorruptedLine++) {
            reset();
            System.out.println("Checking if line " + supposedlyCorruptedLine + " is the corrupted line.");
            try {
                if(executesWithoutLoop(supposedlyCorruptedLine)) return acc;
            } catch(IndexOutOfBoundsException e) {
                //if the altered line makes the program jump to an index out of bounds, it just does not need to be considered
            }
        }
        if(supposedlyCorruptedLine == code.size()) throw new RuntimeException("The code could not be fixed with altering a single line.");
        return 0;
    }

}
