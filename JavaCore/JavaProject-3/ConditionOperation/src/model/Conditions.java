package model;

import java.util.Scanner;


public class Conditions {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // step - 1 . Simple conditions


        System.out.println("Enter number ");
        int num = scanner.nextInt();

        if (num > 0) {System.out.println("+ number");}
        else if (num == 0) {System.out.println("0 number");}
        else  {System.out.println("- number");}

        //System.out.println(" you entered " + num);


    }
}
