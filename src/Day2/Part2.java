package Day2;

import java.io.IOException;
import java.util.ArrayList;

public class Part2 {

    public static void main(String[] args) {
        InputReader reader = new InputReader();
        ArrayList<String> input = null;

        try {
            input = reader.readInputFile("C:\\Users\\helle\\IdeaProjects\\AdventOfCode2020\\src\\Day2\\input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int validPw = 0;
        for(String inputLine : input) {
            String pw = inputLine.split(":")[1].replaceAll("\\s","");
            int firstChar = Integer.parseInt(inputLine.split(":")[0].split("-")[0]);
            int secondChar = Integer.parseInt(inputLine.split(":")[0].split("-")[1].split(" ")[0]);
            char c = inputLine.split(":")[0].split("-")[1].split(" ")[1].toCharArray()[0];

            int charCount = 0;
            if(pw.charAt(firstChar-1) == c) charCount++;
            if(pw.charAt(secondChar-1) == c) charCount++;

            if(charCount == 1) validPw++;
        }
        System.out.println(validPw);
    }

}
