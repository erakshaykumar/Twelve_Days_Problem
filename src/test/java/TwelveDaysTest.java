/**
 * @purpose : Twelve Days Problem,Where I Want To Check The Test Cases For The Lyrics Of Whole Rhyme
 * @author : Akshay kumar
 */

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwelveDaysTest {
    private TwelveDays twelveDays;

    /**
     * @purpose To Set Up Twelve Days Object
     */
    @Before
    public void setup() {
        twelveDays = new TwelveDays();
    }

    /**
     * @purpose To Check the Expected Rhyme One Is Equals to Twelve Days Class Rhyme Method Case 1 Or Not
     */
    @Test
    public void testRhymeOne() {
        String expectedRhymeOne = "On the first day of Christmas my true love gave to me: " +
                "a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeOne, twelveDays.rhyme(1));
    }

    /**
     * @purpose To Check the Expected Rhyme Two Is Equals to Twelve Days Class Rhyme Method Case 2 Or Not
     */
    @Ignore("Remove to run test")
    @Test
    public void testRhymeTwo() {
        String expectedRhymeTwo = "On the second day of Christmas my true love gave to me: two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeTwo, twelveDays.rhyme(2));
    }

    /**
     * @purpose To Check the Expected Rhyme Three Is Equals to Twelve Days Class Rhyme Method Case 3 Or Not
     */
    @Ignore("Remove to run test")
    @Test
    public void testRhymeThree() {
        String expectedRhymeThree = "On the third day of Christmas my true love gave to me: three French Hens, " +
                "two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeThree, twelveDays.rhyme(3));
    }

    /**
     * @purpose To Check the Expected Rhyme Four Is Equals to Twelve Days Class Rhyme Method Case 4 Or Not
     */
    @Ignore("Remove to run test")
    @Test
    public void testRhymeFour() {
        String expectedRhymeFour = "On the fourth day of Christmas my true love gave to me: four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeFour, twelveDays.rhyme(4));
    }

    /**
     * @purpose To Check the Expected Rhyme Five Is Equals to Twelve Days Class Rhyme Method Case 5 Or Not
     */
    @Ignore("Remove to run test")
    @Test
    public void testRhymeFive() {
        String expectedRhymeFive = "On the fifth day of Christmas my true love gave to me: five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeFive, twelveDays.rhyme(5));
    }

    /**
     * @purpose To Check the Expected Rhyme Six Is Equals to Twelve Days Class Rhyme Method Case 6 Or Not
     */
    @Ignore("Remove to run test")
    @Test
    public void testRhymeSix() {
        String expectedRhymeSix = "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, " +
                "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeSix, twelveDays.rhyme(6));
    }

    /**
     * @purpose To Check the Expected Rhyme Seven Is Equals to Twelve Days Class Rhyme Method Case 7 Or Not
     */
    @Ignore("Remove to run test")
    @Test
    public void testRhymeSeven() {
        String expectedRhymeSeven = "On the seventh day of Christmas my true love gave to me: " +
                "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, " +
                "two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeSeven, twelveDays.rhyme(7));
    }

    /**
     * @purpose To Check the Expected Rhyme Eight Is Equals to Twelve Days Class Rhyme Method Case 8 Or Not
     */
    @Ignore("Remove to run test")
    @Test
    public void testRhymeEight() {
        String expectedRhymeEight = "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking," +
                " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeEight, twelveDays.rhyme(8));
    }

    /**
     * @purpose To Check the Expected Rhyme Nine Is Equals to Twelve Days Class Rhyme Method Case 9 Or Not
     */
    @Ignore("Remove to run test")
    @Test
    public void testRhymeNine() {
        String expectedRhymeNine = "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, " +
                "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeNine, twelveDays.rhyme(9));
    }

    /**
     * @purpose To Check the Expected Rhyme Ten Is Equals to Twelve Days Class Rhyme Method Case 10 Or Not
     */
    @Ignore("Remove to run test")
    @Test
    public void testRhymeTen() {
        String expectedRhymeTen = "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, " +
                "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, " +
                "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeTen, twelveDays.rhyme(10));
    }

    /**
     * @purpose To Check the Expected Rhyme Eleven Is Equals to Twelve Days Class Rhyme Method case 11 Or Not
     */
    @Ignore("Remove to run test")
    @Test
    public void testRhymeEleven() {
        String expectedRhymeEleven = "On the eleventh day of Christmas my true love gave to me: " +
                "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
                "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeEleven, twelveDays.rhyme(11));
    }

    /**
     * @purpose To Check the Expected Rhyme Twelve Is Equals to Twelve Days Class Rhyme Method Case 12 Or Not
     */
    @Ignore("Remove to run test")
    @Test
    public void testRhymeTwelve() {
        String expectedRhymeTwelve = "On the twelfth day of Christmas my true love gave to me: " +
                "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, " +
                "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeTwelve, twelveDays.rhyme(12));
    }

    /**
     * @purpose To Check the Expected Whole Song Is Equals to Twelve Days Class Sing Method Or Not
     */
    @Ignore("Remove to run test")
    @Test
    public void testSingWholeSong() {
        String expectedSong = "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the second day of Christmas my true love gave to me: two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, " +
                "two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, " +
                "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, " +
                "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking," +
                " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing," +
                " eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, " +
                "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, " +
                "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, " +
                "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
                "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedSong, twelveDays.sing());
    }
}