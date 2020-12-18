package Day7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class BagList {

    public HashMap<String, ArrayList<String>> bags;

    public BagList(String location) throws IOException {
        bags = BagsInputReader.readInputFile(location);
    }

    public boolean bagContains(String bag, String searchFor) {
        System.out.println("Checking bag " + bag + " for " + searchFor);
        ArrayList<String> bagContents = bags.get(bag);
        if(bagContents.isEmpty()) return false;
        for(String b : bagContents) if(b.equals(searchFor)) return true;
        for(String b : bagContents) if(bagContains(b, searchFor)) return true;
        return false;
    }

}
