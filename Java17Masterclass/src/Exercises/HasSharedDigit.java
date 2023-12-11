package Exercises;

public class HasSharedDigit {
    public static void main(String[] args) {
        System.out.println("Result: " + hasSharedDigit(9, 99));
    }

    public static boolean hasSharedDigit(int first, int second) {
        if((first < 10 || first > 99) || (second < 10 || second > 99)) {
            return false;
        } else {
            return (first % 10 == second % 10 || first % 10 == second / 10 ||
                    first / 10 == second % 10 || first / 10 == second / 10);
        }
    }
}
