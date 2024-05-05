package ex_23042024;

import java.util.Scanner;

public class Lab076 {

    public static void main(String[] args) {
        /* Grade calculator
        A : 90-100   , B : 80-90  , C : 70-80 , D ; 60-70
        E : 45-60
        F : 0-45     */
        Scanner sc = new Scanner(System.in);  // basic logic

        System.out.println("Enter the student's score: ");
        int score = sc.nextInt();

        char grade = 'F';
        if (score >= 90 && score <= 100) {
            grade = 'A';                //System.out.println();
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score >= 50 && score <= 59) {
            grade = 'E';
        } else if (score <= 0 && score > 100){
            System.out.println("I quess you entered wrong score!!!");
        }
        else{
           grade = 'F';
            System.out.println("Sorry, try next year!!!");
        }
        System.out.println("Your Grade is ->  " + grade);

    }

    }

