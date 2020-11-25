package by.sakhonchik.task01.subtask02;

import java.time.YearMonth;
import java.util.Scanner;

/**
 * @author Dmitry Sakhonchik
 */
public class NumberOfDaysInAMonth {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getAnswer();
    }

    public static void getAnswer() {
        int month = getMonth();
        int year = getYear();
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.println("Number of days " + daysInMonth);
    }


    public static boolean isCorrectMonthDigit(String numberEnteredByUser) {
        try {
            int number = Integer.parseInt(numberEnteredByUser);
            return number > 0 && number <= 12;

        } catch (NumberFormatException exception) {
            return false;
        }
    }

    public static boolean isCorrectYearDigit(String numberEnteredByUser) {
        try {
            int number = Integer.parseInt(numberEnteredByUser);
            return number > 0;

        } catch (NumberFormatException exception) {
            return false;
        }
    }

    public static int getMonth() {
        String numberEnteredByUser;
        System.out.println("Enter number of month:");
        while (!isCorrectMonthDigit(numberEnteredByUser = scanner.nextLine())) {
            System.out.println("Incorrect value");
            System.out.println("Enter number of month:");
        }
        return Integer.parseInt(numberEnteredByUser);
    }

    public static int getYear() {
        String numberEnteredByUser;
        System.out.println("Enter number of year:");
        while (!isCorrectYearDigit(numberEnteredByUser = scanner.nextLine())) {
            System.out.println("Incorrect value");
            System.out.println("Enter number of year:");
        }
        return Integer.parseInt(numberEnteredByUser);
    }


}
