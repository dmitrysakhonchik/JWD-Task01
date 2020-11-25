package by.sakhonchik.task01.subtask10;

import java.util.Scanner;

public class FunctionValueWithStep {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a: ");
        int a = getNumberEnteredByUser();
        System.out.println("Enter b: ");
        int b = getNumberEnteredByUser();
        System.out.println("Enter step h: ");
        int h = getNumberEnteredByUser();

        printAnswer(a, b, h);
    }

    private static void printAnswer(int a, int b, int h) {
        for (double x = a; x <= b; x += h) {
            System.out.println(x + "    " + getValueOfFunction(x));
        }
    }

    private static double getValueOfFunction(double x) {
        return Math.pow(x, 2) - Math.sin(x);
    }

    public static int getNumberEnteredByUser() {
        String numberEnteredByUser;
        while (!isCorrectDigit(numberEnteredByUser = scanner.nextLine())) {
            System.out.println("Incorrect value");
            System.out.println("Enter the number again");
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
