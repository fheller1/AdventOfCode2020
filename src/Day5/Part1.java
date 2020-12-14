package Day5;

import io.StringInputReader;

import java.io.IOException;
import java.util.ArrayList;

public class Part1 {

    public static void main(String[] args) {
        ArrayList<String> tickets = null;
        try {
            tickets = StringInputReader.readInputFile("src/Day5/input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int highestSeatID = 0;

        for(String s : tickets) {
            int rowLo = 0;
            int rowUp = 127;
            int colLo = 0;
            int colUp = 7;
            for(char c : s.toCharArray()) {
                int rowLen = rowUp-rowLo+1;
                int colLen = colUp-colLo+1;
                switch(c) {
                    case 'F': rowUp -= Math.ceil(rowLen/2.0); break;
                    case 'B': rowLo += Math.floor(rowLen/2.0); break;
                    case 'L': colUp -= Math.ceil(colLen/2.0); break;
                    case 'R': colLo += Math.floor(colLen/2.0); break;
                    default: throw new RuntimeException("A ticket contains illegal characters");
                }
            }
            if(rowUp != rowLo) throw new RuntimeException("A ticket does not reference to an unambiguous row");
            if(colUp != colLo) throw new RuntimeException("A ticket does not reference to an unambiguous column");
            if(highestSeatID < rowLo*8+colLo) highestSeatID = rowLo*8+colLo;
        }
        System.out.println(highestSeatID);
    }

}
