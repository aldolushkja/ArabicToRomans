
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RomanNumeralsTest {

    @Test
    public void one() {

        assertEquals("1", "I", RomanNumerals.arabicToRoman(1));

    }

    @Test
    public void oneTwo() {

        assertEquals("1", "I", RomanNumerals.arabicToRoman(1));
        assertEquals("2", "II", RomanNumerals.arabicToRoman(2));
    }

    @Test
    public void oneTwoThreeRepeatIt() {

        assertEquals("1", "I", RomanNumerals.arabicToRoman(1));
        assertEquals("2", "II", RomanNumerals.arabicToRoman(2));
        assertEquals("3", "III", RomanNumerals.arabicToRoman(3));
    }

    @Test
    public void four() {

        assertEquals("4", "IV", RomanNumerals.arabicToRoman(4));
    }

    @Test
    public void five() {

        assertEquals("5", "V", RomanNumerals.arabicToRoman(5));
    }

    @Test
    public void six() {

        assertEquals("6", "VI", RomanNumerals.arabicToRoman(6));
    }

    @Test
    public void seven() {
        assertEquals("7", "VII", RomanNumerals.arabicToRoman(7));
    }

    @Test
    public void nineIsXPrefixedByI() {

        assertEquals("9", "IX", RomanNumerals.arabicToRoman(9));
    }

    @Test
    public void ten() {

        assertEquals("10", "X", RomanNumerals.arabicToRoman(10));
    }

    @Test
    public void _40_and_50() {
        assertEquals("40 ", "XL", RomanNumerals.arabicToRoman(40));
        assertEquals("50", "L", RomanNumerals.arabicToRoman(50));
    }

    @Test
    public void _100_and_400() {
        assertEquals("100", "C", RomanNumerals.arabicToRoman(100));
        assertEquals("400", "CD", RomanNumerals.arabicToRoman(400));
    }

    @Test
    public void _1000_and_900() {
        assertEquals("1000", "M", RomanNumerals.arabicToRoman(1000));
        assertEquals("900", "CM", RomanNumerals.arabicToRoman(900));

    }

    @Test
    public void randomNumber_2019() {
        assertEquals("2019", "MMXIX", RomanNumerals.arabicToRoman(2019));

    }
}
