package ex_20042024;

public class Lab064 {
    public static void main(String[] args) {
        String s1 ="Shaziya";
        String password="Qureshi@123";
        String pass_you= password.toLowerCase();

        System.out.println(pass_you);
        System.out.println (pass_you == password);

        System.out.println(pass_you.equals(password));

        System.out.println(pass_you.equalsIgnoreCase(password));

        System.out.println(password.substring(0,6));
        System.out.println(s1.substring(3,7));
        System.out.println(pass_you.indexOf('q'));


    }
}
