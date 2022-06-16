import java.util.Scanner;

public class TernaryOperation {
    public static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" enter number1");
        int num1 = scanner.nextInt();

        System.out.println("num2");
        int num2 = scanner.nextInt();

        int max = ( num1>num2 ? num1 : num2);
        System.out.println("max  " + max);

    }
}
