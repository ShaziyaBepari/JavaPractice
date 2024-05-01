package ex_20042024;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.SortedMap;

public class Lab055 {
    public static void main(String[] args) {
        String s1 ="Shaziya" ; // immutable in nature
        String s2 = s1;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("--------");
    String s3 = "My Projects.";
    s3 = s3.toLowerCase();
        System.out.println(s3);
        String s4 = s3.toUpperCase(Locale.ROOT);
        System.out.println(s4);


    }
}
