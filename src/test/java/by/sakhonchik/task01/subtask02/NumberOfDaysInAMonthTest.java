package by.sakhonchik.task01.subtask02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class NumberOfDaysInAMonthTest {
    private NumberOfDaysInAMonth numberOfDaysInAMonth;
    private final String yyyy;
    private final String mm;
    private final int expected;

    public NumberOfDaysInAMonthTest(String yyyy, String mm, int expected) {
        this.yyyy = yyyy;
        this.mm = mm;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"1999", "02", 28},
                {"2000", "02", 29}};
        return Arrays.asList(data);
    }

    @Before
    public void setUp() {
        numberOfDaysInAMonth = new NumberOfDaysInAMonth();
    }

    @Test
    public void testGetAmountOfDays() {
        int actual = numberOfDaysInAMonth.getAmountOfDays(yyyy, mm);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsCorrectMonthDigit() {
        boolean actual;
        actual = numberOfDaysInAMonth.isCorrectMonthDigit("06");
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsNotCorrectMonthDigit() {
        boolean actual;
        actual = numberOfDaysInAMonth.isCorrectMonthDigit("066");
        Assert.assertFalse(actual);
    }

    @Test
    public void testIsCorrectYearDigit() {
        boolean actual;
        actual = numberOfDaysInAMonth.isCorrectYearDigit("1990");
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsNotCorrectYearDigit() {
        boolean actual;
        actual = numberOfDaysInAMonth.isCorrectYearDigit("Year");
        Assert.assertFalse(actual);
    }
}