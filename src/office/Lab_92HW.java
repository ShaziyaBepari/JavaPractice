import java.util.Scanner;

public class Lab_92HW {
    public static void main(String[] args) {
        // program for  checking leap year
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year in numbers: ");
        int year = sc.nextInt();

        if(year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        System.out.println("Thank you....");
        sc.close();
    }
}
