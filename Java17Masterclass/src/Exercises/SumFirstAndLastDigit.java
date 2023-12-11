package Exercises;

public class SumFirstAndLastDigit {
    public static void main(String[] args) {
        // System.out.println("252 = " + sumFirstAndLastDigit(252));
        // System.out.println("257 = " + sumFirstAndLastDigit(257));
        // System.out.println("0 = " + sumFirstAndLastDigit(0));
        System.out.println("-222 = " + sumFirstAndLastDigit(-222));
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = number % 10;
        if (number < 0)  return -1;

        while(number > 9) {
            number = number / 10;
        }

        return sum + number;
    }
}
