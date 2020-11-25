package by.sakhonchik.task01.subtask04;

public class TwoEvenNumbers {

    private void getCountEvenNumbers(String a, String b, String c, String d) {

        int countEvenNumbers = 0;

        if (getNumberEnteredByUser(a) % 2 == 0) countEvenNumbers++;
        if (getNumberEnteredByUser(b) % 2 == 0) countEvenNumbers++;
        if (getNumberEnteredByUser(c) % 2 == 0) countEvenNumbers++;
        if (getNumberEnteredByUser(d) % 2 == 0) countEvenNumbers++;

        System.out.println(countEvenNumbers >= 2);
    }

    public int getNumberEnteredByUser(String number) {
        if (isCorrectDigit(number)) {
            return Integer.parseInt(number);
        } else return 0;


    }

    public  boolean isCorrectDigit(String numberEnteredByUser) {
        try {
            int number = Integer.parseInt(numberEnteredByUser);
            return number > 0;

        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
