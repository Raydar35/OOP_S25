package week5;

public class PoundsToKilograms {
    public static double pndToKilo(double pounds) {
        return pounds * 0.453592;
    }

    public static void main(String[] args) {
        double userPounds = 165;

        double numKilograms = pndToKilo(userPounds);

        System.out.println(userPounds + " pounds is " + numKilograms + " numKilograms");
    }
}
