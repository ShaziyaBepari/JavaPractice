import java.util.Scanner;

public class Lab_091 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double sal = sc.nextDouble();


        System.out.println("Your details are " + name);
        System.out.println("Your age"+ age);
        System.out.println("your salary"+sal);
        sc.close();


    }
}
