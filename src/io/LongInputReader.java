package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LongInputReader {

    public static ArrayList<Long> readInputFile(String location) throws IOException {
        ArrayList<Long> output = new ArrayList<Long>();

        BufferedReader br = new BufferedReader(new FileReader(location));
        String nextString;
        while((nextString = br.readLine()) != null) output.add(Long.parseLong(nextString));
        return output;
    }

}
