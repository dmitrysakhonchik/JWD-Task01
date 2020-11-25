package by.sakhonchik.task01.subtask04;

import java.util.Scanner;

public class TwoEvenNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getAnswer());
    }

    private static boolean getAnswer() {
        int numberOfInputAttempts;
        int countEvenNumbers = 0;

        for (numberOfInputAttempts = 0; numberOfInputAttempts != 4; numberOfInputAttempts++) {
            int numberEnteredByUser = getNumberEnteredByUser();
            if (numberEnteredByUser % 2 == 0) {
                countEvenNumbers++;
            }
        }
        return countEvenNumbers >= 2;
    }

    public static int getNumberEnteredByUser() {
        String numberEnteredByUser;
        System.out.println("Enter number:");
        while (!isCorrectDigit(numberEnteredByUser = scanner.nextLine())) {
            System.out.println("Incorrect value");
            System.out.println("Enter number:");
        }
        return Integer.parseInt(numberEnteredByUser);
    }

    public static boolean isCorrectDigit(String numberEnteredByUser) {
        try {
            int number = Integer.parseInt(numberEnteredByUser);
            return number > 0;

        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
