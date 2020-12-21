package Day9;

import io.LongInputReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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

    public long findFirstNumberNotSum() {
        for(int i=25; i<data.size(); i++) {
            if(!isSum(i)) return data.get(i);
        }
        return -1;
    }
    public boolean isSum(int index) {
        HashSet<Long> numbers = new HashSet<Long>();
        for(int i=index-25; i<index; i++) numbers.add(data.get(i));

        for(int i=index-25; i<index; i++) {
            if(numbers.contains(data.get(index)-data.get(i))) return true;
        }
        return false;
    }
}
