package Challenges;

public class SumDigitChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digits 123456789 is " + sumDigits(123456789));
        System.out.println("The sum of the digits -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits 123456789 is " + sumDigitsTeacher(123456789));
        System.out.println("The sum of the digits -125 is " + sumDigitsTeacher(-125));
        System.out.println("The sum of the digits 1234 is " + sumDigitsTeacher(1234));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        int a = 0;
        if(number < 0 ) {
            return -1;
        } else {
            do {
                a = number % 10;
                number = number / 10;
                if (number > 9) { sum = sum + a; }
                    else { sum = sum + a + number; }
            } while (number >= 10);
            return sum;
        }
    }

    public static int sumDigitsTeacher(int number) {
        int sum = 0;
        if(number < 0) {
            return -1;
        }
        while(number > 9) {
            sum += (number % 10);
            number = number / 10;
        }
        sum += number;
        return sum;
    }
}
