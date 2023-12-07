package Challenges;

public class SwitchEnhanced {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        printDayOfWeekv2(0);
        printDayOfWeekv2(1);
        printDayOfWeekv2(2);
        printDayOfWeekv2(3);
        printDayOfWeekv2(4);
        printDayOfWeekv2(5);
        printDayOfWeekv2(6);
        printDayOfWeekv2(7);
        printDayOfWeekv2(8);
        printDayOfWeekv2(150);

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0 -> System.out.println(day + " is Sunday");
            case 1 -> System.out.println(day + " is Monday");
            case 2 -> System.out.println(day + " is Tuesday");
            case 3 -> System.out.println(day + " is Wednesday");
            case 4 -> System.out.println(day + " is Thursday");
            case 5 -> System.out.println(day + " is Friday");
            case 6 -> System.out.println(day + " is Saturday");
            default -> System.out.println("Invalid day");
        }
    }

    public static void printDayOfWeekv2(int day) {
        String dayOfWeek = switch(day) {
            case 0 -> {yield "Sunday";}
            case 1 -> {yield "Monday";}
            case 2 -> {yield "Tuesday";}
            case 3 -> {yield "Wednesday";}
            case 4 -> {yield "Thursday";}
            case 5 -> {yield "Friday";}
            case 6 -> {yield "Saturday";}
            default -> "Invalid day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay(int day) {
        if (day == 0) {
            System.out.println(day + " is Sunday");
        } else if (day == 1) {
            System.out.println(day + " is Monday");
        } else if (day == 2) {
            System.out.println(day + " is Tuesday");
        } else if (day == 3) {
            System.out.println(day + " is Wednesday");
        } else if (day == 4) {
            System.out.println(day + " is Thursday");
        } else if (day == 5) {
            System.out.println(day + " is Friday");
        } else if (day == 6) {
            System.out.println(day + " is Saturday");
        } else if (day < 0 || day > 6) {
            System.out.println("Invalid day");
        }
    }
}
