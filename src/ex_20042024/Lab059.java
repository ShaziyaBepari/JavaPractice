package ex_20042024;

public class Lab059 {
    public static void main(String[] args) {

        String name = "My Projects";
        String name1 = "my Projects";
        String name2 =new String("my Projects");

        System.out.println(name == name1);
        System.out.println(name.equals( name1));
        System.out.println(name1 == name2);

        // (name==name1) this checks the reference (contents)
        // name.equals(name1) check the value
    }
}
