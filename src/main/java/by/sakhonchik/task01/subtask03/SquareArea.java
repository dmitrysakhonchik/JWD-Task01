package by.sakhonchik.task01.subtask03;

import java.util.Scanner;

public class SquareArea {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getAnswer();
    }

    public static void getAnswer() {
        double answer;
        double sideOfASquare;
        double circleRadius;
        double innerSquareArea;
        double externalSquareArea;

        externalSquareArea = getExternalSquareArea();
        sideOfASquare = Math.sqrt(externalSquareArea);
        circleRadius = sideOfASquare / 2;
        innerSquareArea = 0.5 * circleRadius * circleRadius * 4;
        answer = externalSquareArea / innerSquareArea;
        System.out.println("The area of the inscribed square is "
                + answer + " times less than the specified area");
    }

    public static boolean isCorrectDigit(String numberEnteredByUser) {
        try {
            int number = Integer.parseInt(numberEnteredByUser);
            return number > 0;

        } catch (NumberFormatException exception) {
            return false;
        }
    }

    public static int getExternalSquareArea() {
        String numberEnteredByUser;
        System.out.println("Enter external square area:");
        while (!isCorrectDigit(numberEnteredByUser = scanner.nextLine())) {
            System.out.println("Incorrect value");
            System.out.println("Enter external square area:");
        }
        return Integer.parseInt(numberEnteredByUser);
    }


}
