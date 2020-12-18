package Day7;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            BagList bagList = new BagList("src/Day7/input.txt");

            System.out.print(bagList.bagContains("dimindigo", "fadedviolet"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
