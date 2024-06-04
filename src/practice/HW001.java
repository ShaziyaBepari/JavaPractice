package practice;

import java.util.Scanner;

public class HW001 {
// max in 3 number
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter three numbers to find the max one:" );
            int n = sc.nextInt();
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println("\n");
            int max = n2 > (n>n1 ? n:n1) ? n2 : ((n>n1) ? n:n1);
            System.out.println("Max number is : " + max);

        }
    }


