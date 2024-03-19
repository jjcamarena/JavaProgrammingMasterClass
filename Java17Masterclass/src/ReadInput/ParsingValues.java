package ReadInput;

public class ParsingValues {
    public static void main(String[] args) {
        int currentYear = 2024;
        String userDateOfBirth = "1977";

        int dateOfBirth = Integer.parseInt(userDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));

        ///////////////////////////////////////////////////////////
        String userAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
        System.out.println("The user says he's " + ageWithPartialYear);

    }
}
