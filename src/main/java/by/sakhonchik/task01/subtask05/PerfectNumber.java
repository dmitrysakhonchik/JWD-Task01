package by.sakhonchik.task01.subtask05;

import java.util.Scanner;

public class PerfectNumber {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getAnswer());
    }

    private static boolean getAnswer() {
        int number = getNumberEnteredByUser();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
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
