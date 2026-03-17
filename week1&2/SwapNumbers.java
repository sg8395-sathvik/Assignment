import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int a = sc.nextInt();

        System.out.print("Enter number2: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: " + a + " , " + b);
    }
}