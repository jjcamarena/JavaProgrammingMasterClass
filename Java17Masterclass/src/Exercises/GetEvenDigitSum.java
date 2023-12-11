package Exercises;

public class GetEvenDigitSum {

    public static void main(String[] args) {
        System.out.println("Sum: " + getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sum = 0;

        while (number > 9) {
            int temp = number % 10;
            if(temp % 2 == 0) {
                sum += temp;
            }
            number /= 10;
        }
        if(number % 2 == 0) {
            sum += number;
        }
        return sum;
    }
}
