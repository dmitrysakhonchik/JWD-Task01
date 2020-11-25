package by.sakhonchik.task01.subtask02;

import java.time.YearMonth;

/**
 * @author Dmitry Sakhonchik
 */
public class NumberOfDaysInAMonth {


    public int getAmountOfDays(String year, String month) {
        YearMonth yearMonthObject;
        int daysInMonth = 0;

        if (isCorrectYearDigit(year) && isCorrectMonthDigit(month)) {
            int yyyy = Integer.parseInt(year);
            int mm = Integer.parseInt(month);
            yearMonthObject = YearMonth.of(yyyy, mm);
            daysInMonth = yearMonthObject.lengthOfMonth();
        }
        return daysInMonth;
    }


    public boolean isCorrectMonthDigit(String numberEnteredByUser) {
        try {
            int number = Integer.parseInt(numberEnteredByUser);
            return number > 0 && number <= 12;

        } catch (NumberFormatException exception) {
            return false;
        }
    }

    public boolean isCorrectYearDigit(String numberEnteredByUser) {
        try {
            int number = Integer.parseInt(numberEnteredByUser);
            return number > 0;

        } catch (NumberFormatException exception) {
            return false;
        }
    }


}
