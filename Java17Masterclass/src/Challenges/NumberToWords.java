package Challenges;

public class NumberToWords {
    public static void main(String[] args) {
        int number = 12500;
        int count = getDigitCount(number);
        int reverse = reverse(number);

        numberToWords(number);

    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            String sNumber = String.valueOf(number);
            for (int i = 0; i <= sNumber.length() - 1; i++) {
                String num = switch (sNumber.charAt(i)) {
                    case 0 -> {
                        yield " ZERO";
                    }
                    case 1 -> {
                        yield " ONE";
                    }
                    case 2 -> {
                        yield " TWO";
                    }
                    case 3 -> {
                        yield " THREE";
                    }
                    case 4 -> {
                        yield " FOUR";
                    }
                    case 5 -> {
                        yield " FIVE";
                    }
                    case 6 -> {
                        yield " SIX";
                    }
                    case 7 -> {
                        yield " SEVEN";
                    }
                    case 8 -> {
                        yield " EIGHT";
                    }
                    case 9 -> {
                        yield " NINE";
                    }
                    default -> {
                        yield " OTHER";
                    }
                };
                System.out.println(num);
            }
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

    public static String stringReverse(String number) {
        String reverse = "";
        for (int i = number.length() - 1; i >= 0  ; i--) {
            reverse = reverse + number.charAt(i);
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int count = 0;
        while (number / 10 > 0) {
            count++;
            number = number / 10;
        }
        count++;
        return count;
    }

}