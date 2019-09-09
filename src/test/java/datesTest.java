import org.junit.Test;


import static org.junit.Assert.*;

public class datesTest {

    @Test
    public void isDateValidTest(){
        assertTrue(dates.isDateValid("2019-08-11"));
    }

    @Test
    public void diffTest(){
        assertEquals(7, dates.diff("2019-07-25", "2019-08-01"));
    }

    @Test
    public void plusTest(){
        assertEquals("2019-09-10", dates.plus("2019-08-11", 30));
    }

}