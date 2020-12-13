package Day1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class InputReader {

    public ArrayList<Integer> readInputFile(String location) throws IOException {
        ArrayList<Integer> output = new ArrayList<Integer>();

        BufferedReader br = new BufferedReader(new FileReader(location));
        String nextString;
        while((nextString = br.readLine()) != null) output.add(Integer.parseInt(nextString));
        return output;
    }

}
