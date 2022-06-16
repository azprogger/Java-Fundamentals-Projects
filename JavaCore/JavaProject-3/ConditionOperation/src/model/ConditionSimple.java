package model;

import java.util.Scanner;

public class ConditionSimple {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();

    }
}
