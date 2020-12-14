package Day3;

public class Part2 {

    public static void main(String[] args) {
        TreeMap trees = new TreeMap("src/Day3/input.txt");

        int result = 1;
        for(int i = 1; i < 8; i+=2) {
            result *= treesOnSlope(i, 1, trees);
        }
        result *= treesOnSlope(1,2, trees);
        System.out.print(result);
    }
    public static int treesOnSlope(int r, int d, TreeMap trees) {
        int numberOfTrees = 0;
        for(int i = 0, j = 0; i < trees.getHeight();) {
            if(trees.getCharAt(i, j) == '#') numberOfTrees++;
            i+=d; j+=r;
        }
        return numberOfTrees;
    }

}
