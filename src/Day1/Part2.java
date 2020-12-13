package Day1;

import java.util.ArrayList;

public class Part2 {

    public static void main(String[] args) {
        InputReader abc = new InputReader();
        ArrayList<Integer> input = new ArrayList<Integer>();
        try {
            input = abc.readInputFile("C:\\Users\\helle\\IdeaProjects\\AoC13\\src\\Day1\\input.txt");
        } catch(Exception e) {
            System.err.println(e.toString());
        }

        for(Integer i : input) {
            for(Integer j : input) {
                for(Integer k : input) {
                    if((i.intValue()+j.intValue()+k.intValue() == 2020) && i!=j && j!=k && k!=i) {
                        System.out.print(i.intValue()*j.intValue()*k.intValue());
                        return;
                    }
                }

            }
        }
    }

}
