import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("From city: ");
        String fromCity = sc.nextLine();

        System.out.print("Via city: ");
        String viaCity = sc.nextLine();

        System.out.print("To city: ");
        String toCity = sc.nextLine();

        System.out.print("Distance from " + fromCity + " to " + viaCity + ": ");
        double d1 = sc.nextDouble();

        System.out.print("Distance from " + viaCity + " to " + toCity + ": ");
        double d2 = sc.nextDouble();

        System.out.print("Time from " + fromCity + " to " + viaCity + ": ");
        double t1 = sc.nextDouble();

        System.out.print("Time from " + viaCity + " to " + toCity + ": ");
        double t2 = sc.nextDouble();

        double totalDistance = d1 + d2;
        double totalTime = t1 + t2;

        System.out.println("Total distance travelled by " + name + " is " + totalDistance + " km");
        System.out.println("Total time taken is " + totalTime + " minutes");
    }
}