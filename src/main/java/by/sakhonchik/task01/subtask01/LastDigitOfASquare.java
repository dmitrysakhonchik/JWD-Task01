package by.sakhonchik.task01.subtask01;

import java.util.Scanner;

/**
 * @author Dmitry Sakhonchik
 */
public class LastDigitOfASquare {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getAnswer();
    }

    public static void getAnswer() {
        String numberEnteredByUser;
        System.out.println("Enter number:");
        while (!isCorrectDigit(numberEnteredByUser = scanner.nextLine())) {
            System.out.println("Incorrect value");
            System.out.println("Enter number:");
        }
        int lastDigitOfNumber = Integer.parseInt(numberEnteredByUser) % 10;
        System.out.println("answer is  : " + lastDigitOfNumber * lastDigitOfNumber % 10);

    }

    public static boolean isCorrectDigit(String numberEnteredByUser) {
        try {
            int number = Integer.parseInt(numberEnteredByUser);
            return number != 0;

        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
