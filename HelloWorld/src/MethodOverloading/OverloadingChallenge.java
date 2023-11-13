package MethodOverloading;

public class OverloadingChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5, 8));
    }

    public static double convertToCentimeters(int inchesHeight) {
        return (double) inchesHeight * 2.54F;
    }

    public static double convertToCentimeters(int feetHeight, int inchesHeight) {
        return convertToCentimeters((feetHeight * 12) + inchesHeight);
    }
}
