import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeNumberTest {

    @Test
    public void getNumbers_GetNumbers_QuestinMark(){
        DecodeNumber decodeNumber = new DecodeNumber();
        String number = "||  ||__";
        String expected = "?";
        String actual = decodeNumber.convertToNumber(number);

        assertEquals(expected,actual);
    }

    @Test
    public void DecodeNumber_GetNumbers_3(){
        DecodeNumber decodeNumber = new DecodeNumber();
        String number = " _  _| _|";
        String expected = "3";
        String actual = decodeNumber.convertToNumber(number);

        assertEquals(expected,actual);
    }

    @Test
    public void DecodeNumber_GetNumbers_0(){
        DecodeNumber decodeNumber = new DecodeNumber();
        String number = " _ | ||_|";
        String expected = "0";
        String actual = decodeNumber.convertToNumber(number);

        assertEquals(expected,actual);
    }

    @Test
    public void DecodeNumber_GetNumbers_7(){
        DecodeNumber decodeNumber = new DecodeNumber();
        String number = " _   |  |";
        String expected = "7";
        String actual = decodeNumber.convertToNumber(number);

        assertEquals(expected,actual);
    }
}