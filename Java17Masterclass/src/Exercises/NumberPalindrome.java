package Exercises;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println("Number 121: " + isPalindrome(121));
        System.out.println("Number -12321: " + isPalindrome(-12321));
        System.out.println("Number 707: " + isPalindrome(707));
        System.out.println("Number 11212: " + isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = (number < 0) ? number *= -1 : number;
        while(number > 9) {
            reverse = reverse * 10;
            reverse = reverse + (number % 10);
            number = number / 10;
        }
        reverse = (reverse * 10) + number;
        return original == reverse;
    }
}
