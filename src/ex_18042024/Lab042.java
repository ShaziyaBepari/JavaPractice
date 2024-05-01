package ex_18042024;

public class Lab042 {
    public static void main(String[] args) {
        int a1= 300;
       // byte b1= a1;  not posible
        byte b1 = (byte) a1; // explicit cating
        System.out.println(b1);
        // so with this data will lose because max limit of byte is total 256 (-128 til 128)
        //so 300-256=44 will be the result
        // its my logic for understanding
    }
}
