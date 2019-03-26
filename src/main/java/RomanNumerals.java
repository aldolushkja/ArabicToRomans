import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class RomanNumerals {

    private static final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String arabicToRoman(int arabic) {
        StringBuilder result = new StringBuilder();
//
//        if (arabic == 2) {
//            result.append("II");
//        } else result.append("I");
//
        int remaining = arabic;
//
//        if(remaining >= 9){
//            result.append("IX");
//            remaining -= 9;
//        }
//
//        if (remaining >= 5) {
//            result.append("V");
//            remaining -= 5;
//        }
//        if (remaining >= 4) {
//            result.append("IV");
//            remaining -= 4;
//        }
        for (int i = 0; i < VALUES.length; i++) {
            remaining = appendRomanNumerals(remaining, VALUES[i], SYMBOLS[i], result);
        }
//        remaining = appendRomanNumerals(remaining, 9, "IX", result);
//        remaining = appendRomanNumerals(remaining, 5, "V", result);
//        remaining = appendRomanNumerals(remaining, 4, "IV", result);
//        while (remaining >= 1) {
//            result.append("I");
//            remaining -= 1;
//        }

        return result.toString();
    }

    private static int appendRomanNumerals(int arabic, int value, String romanDigits, StringBuilder builder) {
        int result = arabic;
        while (result >= value) {
            builder.append(romanDigits);
            result -= value;
        }
        return result;
    }
}
