package ex_23042024;
import java.util.Scanner;
public class Lab073 {
    public static void main(String[] args) {
        //even and odd number
        //
        System.out.println("Enter your number");
               Scanner sc= new Scanner( System.in);
               int num = sc.nextInt();
        //int num =11;
        if(num % 2 == 0)
        {
            System.out.println(" its an even number.");
        }
        else{
            System.out.println("Its an Odd number.");
        }

    }
}
