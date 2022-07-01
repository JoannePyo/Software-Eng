package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {

        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {

        mycustomstring = null;
    }

    @Test //count the number between characters.
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r pust s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }

    @Test //no number. Write only words
    public void testCountNumbers2() {
        mycustomstring.setString("There is no number.");
        assertEquals(0, mycustomstring.countNumbers());
    }

    @Test //count two numbers in separate position
    public void testCountNumbers4() {
        mycustomstring.setString("My numbers are 11 and 96");
        assertEquals(2, mycustomstring.countNumbers());
    }

    @Test //count treated 1, 3, 6.
    public void testCountNumbers5() {
        mycustomstring.setString("treated these number: 1 3 6");
        assertEquals(3, mycustomstring.countNumbers());
    }

    @Test //count numbers middle of strings
    public void testCountNumbers6() {
        mycustomstring.setString("q 92 382 1 m");
        assertEquals(3, mycustomstring.countNumbers());
    }

    @Test //count number when the number are at the beginning
    public void testCountNumbers7() {
        mycustomstring.setString("123 456 789 are number.");
        assertEquals(3, mycustomstring.countNumbers());
    }
    @Test //count number when the number are at the beginning and end
    public void testCountNumbers8() {
        mycustomstring.setString("123 456 789 and 23 67");
        assertEquals(5, mycustomstring.countNumbers());
    }
    //throws NullPointerException if current string is null
    @Test (expected = NullPointerException.class)
    public void testCountNumbers9() {
        mycustomstring.setString(null);
        mycustomstring.countNumbers();
    }


    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    @Test (expected = NullPointerException.class) //check string is null && n is greater than 0, startFromEnd=false.
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
        mycustomstring.setString(null);
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false);
    }

    @Test (expected = NullPointerException.class) //check string is null && n is greater than 0, startFromEnd=true.
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
        mycustomstring.setString(null);
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, true);
    }

    @Test //check string is empty
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
        mycustomstring.setString("");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, false));
    }

    @Test (expected = IllegalArgumentException.class) //check n less than or equal to zero, startFromEnd=true
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
        mycustomstring.setString("Apple");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, true);
    }

    @Test (expected = IllegalArgumentException.class) //check n less than or equal to zero, startFromEnd=false
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
        mycustomstring.setString("Apple");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, false);
    }

    @Test (expected = IllegalArgumentException.class) //check n less than zero
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
        mycustomstring.setString("Apple");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-5, false);
    }

    @Test //check return string when length is less than n.
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
        mycustomstring.setString("Do it");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(6, false));
    }

    @Test //check string position n is 1 and startFromEnd=true.
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
        mycustomstring.setString("Do it");
        assertEquals("Do it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));
    }

    @Test //check string position n is 4, startFromEnd=false;
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
        mycustomstring.setString("I am doing Assignment3");
        assertEquals("miAgn", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, false));
    }

    @Test //string position n is 4, startFromEnd=true;
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
        mycustomstring.setString("I am doing Assignment3");
        assertEquals("ao ie", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, true));
    }

    @Test //string of characters of position n is 6, startFromEnd=false;
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
        mycustomstring.setString("WhAt 1s y0u naMe?");
        assertEquals("1 ", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(6, false));
    }

    @Test //string position n is 5 and startFromEnd=false.
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
        mycustomstring.setString("D0 y0u want @ build the snowman");
        assertEquals("0nb sa", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, false));
    }

    @Test //string position n is 5 and startFromEnd=true.
    public void testGetEveryNthCharacterFromBeginningOrEnd15() {
        mycustomstring.setString("D0 y0u want @ build the snowman");
        assertEquals("0  iho", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, true));
    }


    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }
    @Test
    public void testConvertDigitsToNamesInSubstring2() { //covert to number of index 2 to 12
        mycustomstring.setString("c0nvert d1g1ts");
        mycustomstring.convertDigitsToNamesInSubstring(2, 12);
        assertEquals("cZeronvert dOnegOnets", mycustomstring.getString());
    }

    @Test //check convert number between numbers.
    public void testConvertDigitsToNamesInSubstring3() {
        mycustomstring.setString("Y0ur ce11ph0ne number is 123-777-9921");
        mycustomstring.convertDigitsToNamesInSubstring(30,34);
        assertEquals("Y0ur ce11ph0ne number is 123-SevenSevenSeven-Nine921", mycustomstring.getString());
    }

    @Test //check numbers are between the strings.
    public void testConvertDigitsToNamesInSubstring4() {
        mycustomstring.setString("2 and 7 are my luck numbers");
        mycustomstring.convertDigitsToNamesInSubstring(1, 7);
        assertEquals("Two and Seven are my luck numbers", mycustomstring.getString());
    }

    @Test //check beginning to end.
    public void testConvertDigitsToNamesInSubstring5() {
        mycustomstring.setString("Today is 2/27/2022");
        mycustomstring.convertDigitsToNamesInSubstring(1, 18);
        assertEquals("Today is Two/TwoSeven/TwoZeroTwoTwo", mycustomstring.getString());
    }

    @Test (expected = IllegalArgumentException.class) //check if "startPosition" > "endPosition"
    public void testConvertDigitsToNamesInSubstring6() {
        mycustomstring.setString("Today is 2/27/2022");
        mycustomstring.convertDigitsToNamesInSubstring(20,9);
    }

    @Test  (expected = MyIndexOutOfBoundsException.class) //check startPosition <= endPosition, but startPosition is out of bounds
    public void testConvertDigitsToNamesInSubstring7() {
        mycustomstring.setString("lunch time");
        mycustomstring.convertDigitsToNamesInSubstring(0,9);
    }

    @Test  (expected = MyIndexOutOfBoundsException.class) //check startPosition <= endPosition, but endPosition is out of bounds
    public void testConvertDigitsToNamesInSubstring8() {
        mycustomstring.setString("lunch time");
        mycustomstring.convertDigitsToNamesInSubstring(2, mycustomstring.getString().length()+1);
    }

    @Test (expected = NullPointerException.class) //check  If "startPosition" > "endPosition". And ((endPosition > 0 && this.currentString == null))
    public void testConvertDigitsToNamesInSubstring9() {
        mycustomstring.setString(null);
        mycustomstring.convertDigitsToNamesInSubstring(1,2);
    }

}
