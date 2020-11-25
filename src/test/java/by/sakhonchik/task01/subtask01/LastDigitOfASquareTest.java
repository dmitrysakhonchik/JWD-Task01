package by.sakhonchik.task01.subtask01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Dmitry Sakhonchik
 */
public class LastDigitOfASquareTest {
    private LastDigitOfASquare lastDigitOfASquare;

    @Before
    public void setUp() {
        lastDigitOfASquare = new LastDigitOfASquare();
    }


    @Test
    public void testGetLastDigitOfASquare() {

        double actual;
        int expected = 4;

        actual = lastDigitOfASquare.getLastDigitOfASquare("22");
        Assert.assertEquals(expected, actual, 1e-9);
    }

    @Test
    public void thisIsANumber() {
        boolean actual;
        actual = lastDigitOfASquare.isCorrectDigit("22");
        Assert.assertTrue(actual);
    }

    @Test
    public void thisIsNotANumber() {
        boolean actual;
        actual = lastDigitOfASquare.isCorrectDigit("qwe");
        Assert.assertFalse(actual);
    }
}