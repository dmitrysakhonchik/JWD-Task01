package by.sakhonchik.task01.subtask08;

import java.util.Scanner;

public class FunctionValue {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double x = getNumberEnteredByUser();
        double fX;
        if (x >= 3) {
            fX = -x * x + 3 * x + 9;
        } else {
            fX = 1 / (Math.pow(x, 3) - 6);
        }
        System.out.println("Answer: " + fX);
    }

    public static double getNumberEnteredByUser() {
        String numberEnteredByUser;
        System.out.println("Enter number:");
        while (!isCorrectDigit(numberEnteredByUser = scanner.nextLine())) {
            System.out.println("Incorrect value");
            System.out.println("Enter number");
        }
        return Double.parseDouble(numberEnteredByUser);
    }

    public static boolean isCorrectDigit(String numberEnteredByUser) {
        try {
            double number = Double.parseDouble(numberEnteredByUser);
            return true;

        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
