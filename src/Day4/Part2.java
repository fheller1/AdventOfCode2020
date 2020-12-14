package Day4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Part2 {

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
                if(     (Integer.getInteger(passport.get("byr"))>1919) && (Integer.getInteger(passport.get("byr"))<2003) &&
                        (Integer.getInteger(passport.get("iyr"))>2009) && (Integer.getInteger(passport.get("iyr"))<2021) &&
                        (Integer.getInteger(passport.get("eyr"))>2019) && (Integer.getInteger(passport.get("eyr"))<2031) &&
                        ((passport.get("hgt").contains("cm") && Integer.getInteger(passport.get("hgt"))>149 && Integer.getInteger(passport.get("hgt"))>194)) || (passport.get("hgt").contains("in") && Integer.getInteger(passport.get("hgt"))>58 && Integer.getInteger(passport.get("hgt"))>77) &&
                        passport.get("hcl").matches("^#([a-fA-F0-9]{6})$") &&
                        (passport.get("ecl").equals("amb") || passport.get("ecl").equals("blu") || passport.get("ecl").equals("brn") || passport.get("ecl").equals("gry") || passport.get("ecl").equals("grn") || passport.get("ecl").equals("hzl") || passport.get("ecl").equals("oth")) &&
                        passport.get("pid").matches("^#([0-9]{6})$")) {
                    validPassports++;
                }
            }
        }
        System.out.print(validPassports);
    }

}
