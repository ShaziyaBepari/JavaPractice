package office;

import java.util.Scanner;

public class Lab_112 {
    public static void main(String[] args) {
        // factorial program
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of which u want factorial");

        int num= sc.nextInt();
                            // condition for factorial
        long fact=1;       // 5-> int i=1, 5<5,1
                            // initial - i=1
                            //i<= num
                            //i ++


        for (int i = 1; i < num ; i++) {
             fact = fact*i;
            System.out.println(fact);
            sc.close();

        }
    }
}
