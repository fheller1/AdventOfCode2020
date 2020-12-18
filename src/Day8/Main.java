package Day8;

public class Main {

    public static void main(String[] args) {

        System.out.println(new BootLoader("src/Day8/input.txt").executeUntilLoop());
        System.out.println(new BootLoader("src/Day8/input.txt").getAccWithFixedCorruptedLine());

    }

}
