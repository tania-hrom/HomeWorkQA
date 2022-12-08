package lesson9;

import java.util.*;

public class HM_Collections {
    public static void main(String[] args) {
        printMyList("масло,хліб, вода.цукор,масло. ковбаса, молоко. вода . сіль, сіль, сіль");
    }
    public static void printMyList(String mystr){
        List <String> listComma = new ArrayList (Arrays.asList(mystr.split(",")));
        System.out.println("Список без ком "+listComma);
        List <String> listDot = new ArrayList ();
        Set <String> set = new HashSet<>();
        for (String s:listComma) {
            String [] mass = s.trim().split("\\.");
            int l = mass.length;
            if (l>0) {
            for (String i: mass) {
                listDot.add(i.trim());
                set.add(i.trim());
            }
            }
        }
        System.out.println("Список без крапок та пробілів "+listDot);
        System.out.println("Список без повторень "+set);
        System.out.println("---------------");
        for (String s: set) {
            System.out.println(s.substring(0, 1).toUpperCase()+s.substring(1));
        }
    }
}
