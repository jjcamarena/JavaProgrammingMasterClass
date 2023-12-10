package Challenges;

public class ForOddChallenge {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 11));
    }

    public static boolean isOdd(int number) {
        if (number <= 0) return false;
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        if (end < start || start < 0 || end < 0) {
            System.out.println("Invalid input");
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
