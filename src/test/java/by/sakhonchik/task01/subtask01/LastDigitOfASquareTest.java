package by.sakhonchik.task01.subtask01;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class LastDigitOfASquareTest extends TestCase {


    @Test
    public void testGetLastDigitOfASquare() {
        int x = 222;
        int actual;
        int expected = 4;

        LastDigitOfASquare.getLastDigitOfASquare();
        Assert.assertEquals(expected,actual);
    }

}