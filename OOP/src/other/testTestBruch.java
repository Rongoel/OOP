package other;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTestBruch
{

    @Test
    public void test()
    {
        assertTrue(new Bruch(1 ,2) . isLess(new Bruch(1))); // 1/2 < 1
        assertTrue(new Bruch(6,9). equals(new Bruch(60,90))); // 6/9 equals 60/90
        assertTrue(new Bruch(90,98). isGreater(new Bruch(2,14))); // 90/98 > 2/14
    }

}
