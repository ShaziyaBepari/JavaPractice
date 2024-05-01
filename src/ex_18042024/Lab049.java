package ex_18042024;

public class Lab049 {
    public static void main(String[] args) {


        System.out.println();
                int a = 10;
        System.out.println(++a + a++ + a++);
// part A = ++a  -> a = 11 but expresion value = 11
// part B = a++  -> a = 12 but expresion value =11
// part C = a++  -> a = 13 but expresion value = 12
        // so the answer will be 34
        // exp1+exp2+exp3 = 34
        System.out.println(a); //now value of a u can check

    }
}
