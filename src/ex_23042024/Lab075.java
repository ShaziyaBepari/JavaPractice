package ex_23042024;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc= new Scanner( System.in);
        int number = sc.nextInt();
 if (number > 20)
     {
     System.out.println("number > 20");
     }
 else if (number > 10)
 {
     System.out.println("Number is between 10 & 20." );
 }else {
     System.out.println("Num is <20.");
 }
    }
}
