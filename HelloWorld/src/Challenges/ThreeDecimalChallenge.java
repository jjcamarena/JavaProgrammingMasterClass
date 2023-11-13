package Challenges;

public class ThreeDecimalChallenge {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756,3.1757));
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        long uno = (long)(one * 1000);
        long dos = (long)(two * 1000);

        return uno == dos;
    }
}
