/**
 * @purpose : Twelve Days Problem,Where I Want To Get The Lyrics Of Whole Rhyme As An Output
 * @author : Akshay kumar
 */
class TwelveDays {

    /**
     * @purose To Get The Desired Lyrics Of The Rhyme, I Created A Method For Describing Rhyme By Using Switch Case
     * @param rhymeNumber
     * @return Answer That Gives The Lyrics Of Rhyme
     */
    static String rhyme(int rhymeNumber) {
        switch(rhymeNumber){
            case 1:
                return "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n";
            case 2:
                return "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 3:
                return "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 4:
                return "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 5:
                return "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 6:
                return "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 7:
                return "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 8:
                return "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 9:
                return "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 10:
                return "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 11:
                return "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 12:
                return "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        }
        return "";
    }

    /**
     * @purpose To Loop The Rhyme From Start To End By Using "For" Loop In The Method And Also Check For The Answer
     * @param startRhyme
     * @param endRhyme
     * @return Answer That Gives The Lyrics Of Rhyme
     */
    static String rhymes(int startRhyme, int endRhyme) {
        String ans = "";

        for(int rhyme=startRhyme; rhyme<=endRhyme; rhyme++){
            ans += rhyme(rhyme);
            if(rhyme != endRhyme)
                ans += '\n';
        }

        return ans;
    }

    /**
     * @purpose To Get The Lyrics Of The Rhyme
     * @return Rhyme 1 To Rhyme 12
     */

    static String sing() {
        return rhymes(1,12);
    }

    /**
     * @purpose To Print The Lyrics Of The Whole Rhyme As Desired
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(TwelveDays.sing());
    }
}
