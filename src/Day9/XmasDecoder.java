package Day9;

import io.LongInputReader;

import java.io.IOException;
import java.util.ArrayList;

public class XmasDecoder {

    private ArrayList<Long> data;

    public XmasDecoder(String dataLoc) {
        data = new ArrayList<Long>();
        try {
            data = LongInputReader.readInputFile(dataLoc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int findFirstNumberNotSum() {
        for(int i=25; i<data.size(); i++) {
            if(!isSum(i)) return i;
        }
        return -1;
    }
    public boolean isSum(int index) {
        ArrayList<Long> prev25 = new ArrayList<Long>(data.subList(index-25, index-1));
        for(Long i : prev25) {
            for(Long j : prev25) {
                if (i.equals(j)) continue;
                if(i+j == data.get(index)) return true;
            }
        }
        return false;
    }
}
