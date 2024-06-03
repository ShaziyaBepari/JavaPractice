public class Lab_087 {
    public static void main (String[] args) {
       int itemCode =02;
       switch(itemCode){
           case 01 -> System.out.println("its a laptop");
           case 02 -> System.out.println("its a desktop");
           case 03,04 -> System.out.println("its a mobile phone!");
           default -> System.out.println("Hallooo");
       }// -> this sign works instead of Break functionality

    }
}
