package Exercises;

public class HasSameLastDigit {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (22, 33, 42));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            num1 = num1 % 10;
            num2 = num2 % 10;
            num3 = num3 % 10;
            if (num1 == num2) {
                return true;
            } else if (num1 == num3) {
                return true;
            } else if (num2 == num3) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(int num) {
        if (num < 10 || num > 1000) {
            return false;
        } else {
            return true;
        }
    }
}
