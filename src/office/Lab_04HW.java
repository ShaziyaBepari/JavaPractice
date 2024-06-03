import java.util.Scanner;

public class Lab_04HW {
    public static void main(String[] args) {
        // bigger number out of three
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Float number = sc.nextFloat();

        if(number > 0) {
            System.out.println(number + " is a positive number.");
        } else
            if(number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
        System.out.println("Great!!!!");
        sc.close();
    }
}
