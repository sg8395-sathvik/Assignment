import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double s1 = sc.nextDouble();

        System.out.print("Enter side2: ");
        double s2 = sc.nextDouble();

        System.out.print("Enter side3: ");
        double s3 = sc.nextDouble();

        double perimeter = s1 + s2 + s3;
        double distance = 5000; // meters

        double rounds = distance / perimeter;

        System.out.println("Number of rounds = " + rounds);
    }
}