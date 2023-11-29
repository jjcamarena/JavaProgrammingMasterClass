package Challenges;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        // XXh YYm ZZs
        // seconds >= 0
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
    }

    public static String getDurationString(int seconds) {
        int minutes = 0;
        if (seconds < 0) {
            return "Entered value most be greater than zero";
        } else {
            minutes = seconds / 60;
            seconds = seconds % 60;
        }
        return getDurationString(minutes, (seconds % 60));
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = 0;
        if (minutes < 0 || seconds < 0) {
            return "Entered value most be greater than zero";
        } else {
            hours = minutes / 60;
            minutes = (minutes % 60) + seconds / 60;
            seconds = seconds % 60;
        }
        return hours + "h " + minutes + "m " + seconds + "s";
    }

}
