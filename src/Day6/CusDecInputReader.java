package Day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CusDecInputReader {

    public static ArrayList<String> readInputFile(String location) throws IOException {
        ArrayList<String> output = new ArrayList<String>();
        int cusDecIndex = 0;
        output.add("");

        BufferedReader br = new BufferedReader(new FileReader(location));
        String nextString;
        while((nextString = br.readLine()) != null) {
            if(nextString.equals("")) {
                output.add("");
                cusDecIndex++;
            } else {
                output.set(cusDecIndex, output.get(cusDecIndex)+nextString);
            }
        }
        return output;
    }
    public static ArrayList<Group> readInputFilePart2(String location) throws IOException {
        ArrayList<Group> output = new ArrayList<Group>();
        int groupIndex = 0;
        output.add(new Group());

        BufferedReader br = new BufferedReader(new FileReader(location));
        String nextString;
        while((nextString = br.readLine()) != null) {
            if(nextString.equals("")) {
                output.add(new Group());
                groupIndex++;
            } else {
                output.set(groupIndex, output.get(groupIndex).addMember(nextString));
            }
        }
        return output;
    }
}
