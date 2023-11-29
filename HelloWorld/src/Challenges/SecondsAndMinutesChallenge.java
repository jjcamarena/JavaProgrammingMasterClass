package Challenges;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        // XXh YYm ZZs
        // seconds >= 0
        getDurationString(3945);
    }

    public static void getDurationString(int seconds) {
        //
        if (seconds <= 0) {
            System.out.println("Entered value most be greater than zero");
        } else {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            // System.out.println("minutes = " + minutes);
            // System.out.println("seconds = " + seconds);
            System.out.println(getDurationString(minutes, (seconds % 60)));
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;
        minutes = (minutes % 60);
        return hours + "h " + minutes + "m " + seconds + "s";
    }

}
