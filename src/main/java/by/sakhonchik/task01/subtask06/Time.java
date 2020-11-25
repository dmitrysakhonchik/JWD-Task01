package by.sakhonchik.task01.subtask06;

import java.util.Scanner;

public class Time {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        getAnswer();
    }

    public static void getAnswer() {
        int seconds;
        int minutes;
        int hours;
        int numberEnteredByUser = getNumberEnteredByUser();

        hours = numberEnteredByUser / 3600;
        numberEnteredByUser -= hours * 3600;
        minutes = numberEnteredByUser / 60;
        numberEnteredByUser = numberEnteredByUser - minutes * 60;
        seconds = numberEnteredByUser;

        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");

    }


    public static int getNumberEnteredByUser() {
        String numberEnteredByUser;
        System.out.println("Enter number of seconds:");
        while (!isCorrectDigit(numberEnteredByUser = scanner.nextLine())) {
            System.out.println("Incorrect value");
            System.out.println("Enter number of seconds:");
        }
        return Integer.parseInt(numberEnteredByUser);
    }

    public static boolean isCorrectDigit(String numberEnteredByUser) {
        try {
            int number = Integer.parseInt(numberEnteredByUser);
            return number > 0 && number <= 86400;

        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
