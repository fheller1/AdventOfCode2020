package Day6;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Group> groups = null;
        try {
            groups = CusDecInputReader.readInputFilePart2("src/Day6/input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(part1(groups));
        System.out.println(part2(groups));
    }
    public static String part1(ArrayList<Group> groups) {
        int output = 0;
        for(Group g : groups) output += g.questionsYes();
        return Integer.toString(output);
    }
    public static String part2(ArrayList<Group> groups) {
        int output = 0;
        for(Group g : groups) output += g.questionsEveryoneYes();
        return Integer.toString(output);
    }

}
