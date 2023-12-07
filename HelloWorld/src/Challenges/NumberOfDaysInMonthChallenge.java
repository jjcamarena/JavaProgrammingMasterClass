package Challenges;

public class NumberOfDaysInMonthChallenge {
    public static void main(String[] args) {
        System.out.println(isLeapYear(10000));
        System.out.println(getDaysInMonth(12,10000));
    }

    public static boolean isLeapYear(int year) {
        if (year > 0 && year < 10000) {
            if ((year % 4 == 0) && (year % 100 != 0)) {
                return true;
            } else if ((year % 100 == 0) && (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month > 0 && month < 13) && (year > 0 && year < 10000)) {
            if(month == 1 || month == 3 || month == 5 || month == 7
                    || month == 8 || month == 10 || month == 12){
                return 31;
            } else if (month !=2 ) {
                return 30;
            }
            if(isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return -1;
        }
    }
}
