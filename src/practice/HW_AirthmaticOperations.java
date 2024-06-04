package practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW_AirthmaticOperations {
    public static void main(String[] args) {
        // perform airthmatic operations
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number as whole number");
        int input1 = sc.nextInt();
        System.out.println("Enter 2nd number as whole number");
        int input2 = sc.nextInt();
        System.out.println("Enter opertions +,-,/,* ");
        int operator = sc.next().charAt(0);


        switch (operator){
            case '+'->
                System.out.println("Result: "+(input1 + input2) );
            case '-'->
                    System.out.println("Result: "+(input1 - input2));
            case '*' ->
                    System.out.println("Result: "+(input1 * input2));
            case '/' ->
                    System.out.println("Result: "+(input1 / input2) );
        default -> System.out.println("Invalid ");

        }
sc.close();


    }
}
