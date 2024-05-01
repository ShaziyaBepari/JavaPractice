package ex_20042024;

public class Lab053 {
    public static void main(String[] args) {
        // two ways pf assigning string
        //1st way
        String name = "Shaziya"; // assignment operator

        // 2nd way
        String name1= new String("Shaziya") ; // new operator

        System.out.println(name);
        System.out.println(" your name is ->" + name);
        System.out.printf(" your name is ->%s" , name);

        System.out.println(name1);
        System.out.println("\n --- all the function available in String---\n ");
        System.out.println(name.length());
// both are actually store the value in different ways in JVM

    }
}
