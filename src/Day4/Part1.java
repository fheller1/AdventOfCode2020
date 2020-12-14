package Day4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Part1 {

    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> data = null;
        try {
            data = PassportInputReader.readInputFile("src/Day4/input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        int validPassports = 0;
        for(HashMap<String, String> passport : data) {
            if(     passport.get("byr") != null &&
                    passport.get("iyr") != null &&
                    passport.get("eyr") != null &&
                    passport.get("hgt") != null &&
                    passport.get("hcl") != null &&
                    passport.get("ecl") != null &&
                    passport.get("pid") != null     ) {
                validPassports++;
            }
        }
        System.out.print(validPassports);
    }

}
