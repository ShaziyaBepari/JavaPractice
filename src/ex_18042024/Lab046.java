package ex_18042024;

public class Lab046 {
    public static void main(String[] args) {
        // increment operator
        //a= a+1;
        int a =10;
        // result a
        System.out.println(a);
        a++; // result  will be 10
        //after this line a -> 11
// we can not see reult till now as we haven't store the value of till now
        System.out.println(a);
        a++;
        int result= a++; // now see the updated result

        System.out.println(result);

    }
}
