import java.util.Scanner;

public class Conditions {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" enter number");
        int num1 = scanner.nextInt();

        System.out.println("num2");
        int num2 = scanner.nextInt();

        if (num1>num2) {
            System.out.println("num1 > num2");
        }
        else System.out.println("");
    }
}
