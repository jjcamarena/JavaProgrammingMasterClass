package Challenges;

public class OperatorChallenge {
    public static void main(String[] args) {
        double doubleOne = 20.00d;
        double doubleTwo = 80.00d;

        double result = (doubleOne + doubleTwo) * 100;
        System.out.println("result = " + result);


        double doubleRemainder = result % 40.00d;
        System.out.println("doubleRemainder = " + doubleRemainder);

        boolean isRemainder = (doubleRemainder == 0) ? true : false;
        System.out.println("remainder = " + isRemainder);

        if (!isRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
