import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwelveDaysTest {
    private TwelveDays twelveDays;

    @Before
    public void setup() {
        twelveDays = new TwelveDays();
    }

    @Test
    public void testRhymeOne() {
        String expectedRhymeOne = "On the first day of Christmas my true love gave to me: " +
                "a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeOne, twelveDays.rhyme(1));
    }

    @Ignore("Remove to run test")
    @Test
    public void testRhymeTwo() {
        String expectedRhymeTwo = "On the second day of Christmas my true love gave to me: two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeTwo, twelveDays.rhyme(2));
    }

    @Ignore("Remove to run test")
    @Test
    public void testRhymeThree() {
        String expectedRhymeThree = "On the third day of Christmas my true love gave to me: three French Hens, " +
                "two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeThree, twelveDays.rhyme(3));
    }

    @Ignore("Remove to run test")
    @Test
    public void testRhymeFour() {
        String expectedRhymeFour = "On the fourth day of Christmas my true love gave to me: four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeFour, twelveDays.rhyme(4));
    }

    @Ignore("Remove to run test")
    @Test
    public void testRhymeFive() {
        String expectedRhymeFive = "On the fifth day of Christmas my true love gave to me: five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeFive, twelveDays.rhyme(5));
    }

    @Ignore("Remove to run test")
    @Test
    public void testRhymeSix() {
        String expectedRhymeSix = "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, " +
                "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeSix, twelveDays.rhyme(6));
    }

    @Ignore("Remove to run test")
    @Test
    public void testRhymeSeven() {
        String expectedRhymeSeven = "On the seventh day of Christmas my true love gave to me: " +
                "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, " +
                "two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeSeven, twelveDays.rhyme(7));
    }

    @Ignore("Remove to run test")
    @Test
    public void testRhymeEight() {
        String expectedRhymeEight = "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking," +
                " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeEight, twelveDays.rhyme(8));
    }

    @Ignore("Remove to run test")
    @Test
    public void testRhymeNine() {
        String expectedRhymeNine = "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, " +
                "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeNine, twelveDays.rhyme(9));
    }

    @Ignore("Remove to run test")
    @Test
    public void testRhymeTen() {
        String expectedRhymeTen = "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, " +
                "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, " +
                "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                "and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeTen, twelveDays.rhyme(10));
    }

    @Ignore("Remove to run test")
    @Test
    public void testRhymeEleven() {
        String expectedRhymeEleven = "On the eleventh day of Christmas my true love gave to me: " +
                "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
                "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeEleven, twelveDays.rhyme(11));
    }

    @Ignore("Remove to run test")
    @Test
    public void testRhymeTwelve() {
        String expectedRhymeTwelve = "On the twelfth day of Christmas my true love gave to me: " +
                "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, " +
                "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedRhymeTwelve, twelveDays.rhyme(12));
    }

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