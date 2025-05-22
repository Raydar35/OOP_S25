package week5;

public class FeetToInch {
    public static int ftInToIn(int feet, int inches) {
        int totalInches = (feet * 12) + inches;  // Convert feet to inches
        return totalInches;
    }

    public static void main(String[] args) {
        int userFeet = 5;  // Example input: 5 feet
        int userInches = 8; // Example input: 8 inches

        int totalInches = ftInToIn(userFeet, userInches); // Call method

        System.out.println(userFeet + " feet and " + userInches + " inches is " + totalInches + " inches.");
    }
}

