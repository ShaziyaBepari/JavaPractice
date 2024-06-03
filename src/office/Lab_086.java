public class Lab_086 {
    public static void main(String[] args) {

        int itemcode=002;
        switch(itemcode){
            case 01, 02, 03:

                System.out.println("it is an ELectronic gadget!");
                break;

            case 04, 05, 07:

                System.out.println("it is an Mechanic gadget!");
                break;

            default:
                System.out.println("None");
        }
    }
}
