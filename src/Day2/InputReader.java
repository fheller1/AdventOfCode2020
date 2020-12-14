package Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputReader {

    public ArrayList<String> readInputFile(String location) throws IOException {
        ArrayList<String> output = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new FileReader(location));
        String nextString;
        while((nextString = br.readLine()) != null) output.add(nextString);
        return output;
    }

}
