import java.util.Scanner;

public class Lab_093 {
    public static void main(String[] args) {
        System.out.println("Please enter number.");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>0){
            System.out.println("Positive number");
        } else if (num<0 ) {
            System.out.println("Negative number");
        }
        else{
            System.out.println("its a zero");
        }

        sc.close();
    }

}