package Day3;

public class Part1 {

    public static void main(String[] args) {
        TreeMap trees = new TreeMap("src/Day3/input.txt");
        int numberOfTrees = 0;
        for(int i = 0, j = 0; i < trees.getHeight();) {
            if(trees.getCharAt(i, j) == '#') numberOfTrees++;
            i++; j+=3;
        }
        System.out.print(numberOfTrees);
    }

}
