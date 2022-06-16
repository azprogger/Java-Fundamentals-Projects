import java.util.Scanner;

public class MaxNumber {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" enter number1");
        int num1 = scanner.nextInt();

        System.out.println("num2");
        int num2 = scanner.nextInt();

        System.out.println("num3");
        int num3 = scanner.nextInt();

//        step  Max Variable
        int max = num1;
        if (max>num2){
            max = num2;
        }
        if (max>num3){
            max=num3;
        }
        System.out.println(max);
    }
}
