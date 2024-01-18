package Exercises;

public class NumberToWords {
    public static void main(String[] args) {
        //numberToWords(1010);
        System.out.println(getDigitCount(12345));
        numberToWords(12345);
    }

    public static void numberToWords(int number) {
        System.out.println(number + " ");
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            do {
                int digit = 0;
                number = reverse(number);
                System.out.println(number);
                digit = number % 10;
                switch (digit) {
                    case 0 -> System.out.print("Zero ");
                    case 1 -> System.out.print("One ");
                    case 2 -> System.out.print("Two ");
                    case 3 -> System.out.print("Three ");
                    case 4 -> System.out.print("Four ");
                    case 5 -> System.out.print("Five ");
                    case 6 -> System.out.print("Six ");
                    case 7 -> System.out.print("Seven ");
                    case 8 -> System.out.print("Eight ");
                    case 9 -> System.out.print("Nine ");
                }
                number = number / 10;
                // System.out.println(number);
            } while (getDigitCount(number) > 1);
        }

    }

    public static int reverse(int number) {
        int reverse = 0;
        int original = (number < 0) ? number *= -1 : number;
        while(number > 9) {
            reverse = reverse * 10;
            reverse = reverse + (number % 10);
            number = number / 10;
        }
        reverse = (reverse * 10) + number;
        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        while (number / 10 > 0) {
            count++;
            number = number / 10;
        }
        count++;
        return count;
    }
}
