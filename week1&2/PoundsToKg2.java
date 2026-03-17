import java.util.Scanner;

public class PoundsToKg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        double kg = pounds / 2.2;

        System.out.println("Weight in kg = " + kg);
    }
}