package Day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class BagsInputReader {

    public static HashMap<String, ArrayList<String>> readInputFile(String location) throws IOException {
        HashMap<String, ArrayList<String>> output = new HashMap<String, ArrayList<String>>();

        BufferedReader br = new BufferedReader(new FileReader(location));
        String nextString;
        while((nextString = br.readLine()) != null) {
            ArrayList<String> contents = new ArrayList<>();
            if(nextString.split(" bags contain ")[1].contains(" no other bags.")) {
                output.put(nextString.split(" bags contain ")[0].replaceAll(" ", ""), new ArrayList<String>());
                System.out.println("Added new bag " + nextString.split(" bags contain ")[0].replaceAll(" ", "") + " with no further content.");
                continue;
            }
            String contentsStr = nextString.split(" bags contain ")[1].replaceAll("bags", "").replaceAll("[0-9]", "").replaceAll(" ", "").replace(".", "");
            String[] contentsStrSplit = contentsStr.split(",");
            for(String s :contentsStrSplit) contents.add(s);
            output.put(nextString.split(" bags contain ")[0].replaceAll(" ", ""), contents);
            /*
            System.out.print("A new bag \"" + nextString.split(" bags contain ")[0].replaceAll(" ", "") + "\" was added. It contains ");
            for(String c : contents) {
                System.out.print(c + ", ");
            }
            System.out.print("\n");
            */
        }

        return output;
    }

}
