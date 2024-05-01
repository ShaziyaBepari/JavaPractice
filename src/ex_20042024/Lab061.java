package ex_20042024;

public class Lab061 {
    public static void main(String[] args) {


        String s1 ="Shaziya";
        char c = s1.charAt(1); // charAt index starts from 0
     //   char d = s1.charAt(8); // will give error
        System.out.println(c);
        boolean result = s1.contains("a");
      //  s1.concat("Qureshi"); // it will only concat not store and print
        s1 = s1.concat("Qureshi");
        System.out.println(s1);




    }
}
