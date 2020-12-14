package Day3;

import io.StringInputReader;

import java.io.IOException;
import java.util.ArrayList;

public class TreeMap {

    public ArrayList<String> trees;

    public TreeMap(String location) {
        try {
            this.trees = StringInputReader.readInputFile(location);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public char getCharAt(int i, int j) {
        String s = trees.get(i);
        while(j>=s.length()) j -= s.length();
        return s.charAt(j);
    }
    public int getHeight() {
        return trees.size();
    }

}
