import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();

        double total = salary + bonus;

        System.out.println("Total Income = INR " + total);
    }
}