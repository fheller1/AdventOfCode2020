package Day6;

import java.io.IOException;
import java.util.ArrayList;

public class Part1 {

    public static void main(String[] args) {
        ArrayList<String> cusDecs = null;
        ArrayList<Group> groups = null;
        try {
            cusDecs = CusDecInputReader.readInputFile("src/Day6/input.txt");
            groups = CusDecInputReader.readInputFilePart2("src/Day6/input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(part2(groups));
    }
    public static String part1(ArrayList<String> cusDecs) {
        int output = 0;
        for(String cd : cusDecs) output += cd.chars().distinct().count();
        return Integer.toString(output);
    }
    public static String part2(ArrayList<Group> groups) {
        int output = 0;
        for(Group g : groups) output += g.questionsEveryoneYes();
        return Integer.toString(output);
    }

}
