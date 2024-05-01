package ex_18042024;

public class Lab043 {
    public static void main(String[] args) {
        float course =100; // this can be int
        float GST = 18.45f;
        double total= course + GST;
        //double total= course + (int) GST; means money loss of .45

        System.out.println();
        System.out.println(total);
    }
}
