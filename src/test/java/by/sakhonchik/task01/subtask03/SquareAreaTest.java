package by.sakhonchik.task01.subtask03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SquareAreaTest {
    private SquareArea squareArea;

    @Before
    public void setUp() {
        squareArea = new SquareArea();
    }

    @Test
    public void testGetSquareArea() {
        String externalSquareArea = "55";
        double expected = 2.0;
        double actual = squareArea.getSquareArea(externalSquareArea);
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testIsCorrectDigit() {
        boolean actual;
        actual = squareArea.isCorrectDigit("100");
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsNotCorrectDigit() {
        boolean actual;
        actual = squareArea.isCorrectDigit("Qwerty");
        Assert.assertFalse(actual);
    }

    @Test
    public void testGetExternalSquareArea() {
        double expected = 20.0;
        double actual = squareArea.getExternalSquareArea("20.0");
        Assert.assertEquals(expected, actual, 0.1);

    }
}