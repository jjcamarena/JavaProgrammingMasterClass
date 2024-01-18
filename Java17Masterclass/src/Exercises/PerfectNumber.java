package Exercises;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(0));
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number < 0) {
            return false;
        } else if (number == 0) {
            return false;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return (sum == number);
    }
}