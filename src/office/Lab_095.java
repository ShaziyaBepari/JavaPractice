import java.util.Scanner;

public class Lab_095 {
    public static void main(String[] args) {
        System.out.println("enter any alphabet   \n");
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);

        if(character=='a' || character == 'e' || character=='o' || character=='u' || character=='v' || character=='A' || character == 'E' || character=='O' || character=='U' || character=='V')
        {
            System.out.println("Its a Vowel");
        }
        else
            System.out.println("Its a Consonant");
    }
}
