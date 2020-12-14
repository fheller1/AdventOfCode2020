package Day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class PassportInputReader {

    public static ArrayList<HashMap<String, String>> readInputFile(String location) throws IOException {
        ArrayList<HashMap<String, String>> output = new ArrayList<HashMap<String, String>>();
        BufferedReader br = new BufferedReader(new FileReader(location));
        String nextString;
        int passportIndex = 0;
        output.add(new HashMap<String, String>());
        while((nextString = br.readLine()) != null) {
            if(nextString.equals("")) {
                passportIndex++;
                output.add(new HashMap<String, String>());
            }
            else {
                String[] entries = nextString.split(" ");
                for(String s : entries) {
                    output.get(passportIndex).put(s.split(":")[0], s.split(":")[1]);
                }
            }

        }
        return output;
    }

}
