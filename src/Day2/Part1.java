package Day2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Part1 {

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
            int lowerBound = Integer.parseInt(inputLine.split(":")[0].split("-")[0]);
            int upperBound = Integer.parseInt(inputLine.split(":")[0].split("-")[1].split(" ")[0]);
            char c = inputLine.split(":")[0].split("-")[1].split(" ")[1].toCharArray()[0];

            //TODO: do this with regex
            int charCount = 0;
            for(Character ci : pw.toCharArray()) if(ci.equals(c)) charCount++;
            if(charCount >= lowerBound && charCount <= upperBound) validPw++;

            //System.out.println("Password " + pw + " should contain between " + lowerBound + " and " + upperBound + " '" + c + "' characters.");
        }
        System.out.println(validPw);
    }

}
