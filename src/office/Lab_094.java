import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_094 {
    public static void main(String[] args) {
        //get bigger number out of three
        System.out.println("Enter three numbers.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Enter 3 rd number");
        int num3 = sc.nextInt();


        if (num1 >= num2 && num2 >= num3) {
            System.out.println("Bigger number is '" + num1 +"'");
        } else if (num2 >= num3 && num2 >= num1) {
            System.out.println("Bigger number is '" + num2 + "'");
        } else {
            System.out.println("Bigger number is '" + num3 +"'");
        }
        sc.close();
    }
}
