package Challenges;

public class SwitchTraditional {
    public static void main(String[] args) {
        char charValue = 'G';
        System.out.println(charValue + " is " + natoWord(charValue));
    }

    public static String natoWord(char charValue) {
        switch (charValue) {
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            case 'F':
                return "Fox";
            default:
                return "not found";
        }
    }
}
