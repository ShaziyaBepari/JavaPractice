package ex_23042024;

import java.util.Scanner;

public class Lab074 {
    public static void main(String[] args) {
        // Max number out of two
        System.out.println("Enter first number.");
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();

        System.out.println("Enter Second number. ");
       // Scanner sc = new Scanner(System.in);
        int num2= sc.nextInt();
        int max = Math.max(num1, num2);
        System.out.println(" Max by Math.max func() " + max);

        if (num1>num2)
        {
            System.out.println("Max is ->" +num1);
        }
        else{
            System.out.println("Max is -> "+num2);
        }
sc.close();


    }
}
