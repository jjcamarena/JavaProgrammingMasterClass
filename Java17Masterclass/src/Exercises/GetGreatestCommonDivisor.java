package Exercises;

public class GetGreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first <10 || second < 10) return -1;
        int div = 0;
        int divisor = 0;
        if (first > second) {
            div = first;
        } else {
            div = second;
        }
        for (int i = div; i >= 1; i--) {
            if (first % i == 0 && second % i == 0) {
                divisor = i;
                break;
            }
        }
        return divisor;
    }
}
