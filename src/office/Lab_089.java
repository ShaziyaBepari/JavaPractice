public class Lab_089 {
    public static void main(String[] args) {
        char code = 'B';
        int val = switch (code) {
            case 'A':
                yield 60; // return something
               // System.out.println("A");

            case 'B':
                yield 70;
               // System.out.println("B");
            default:
                System.out.println("not able to find");
                 throw new IllegalStateException("error");
        };
    }
}
