package ex_23042024;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {
        // triangle classifier
        // isosceles, equilateral, scalene

        Scanner sc =  new Scanner(System.in);
        System.out.println(" Enter length of sides, & will tell about the triangle: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if ( (side1==side2) && (side1== side3) && (side1 ==side3)) {
            System.out.println(" EQUILATERAL");
        }else if ((side1==side2) || (side1==side3) || (side2==side3))
        {
            System.out.println("ISOSCELES");
        }
        else{
            System.out.println("Scalene");
        }
    }

    }

