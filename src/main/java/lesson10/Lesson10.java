package lesson10;

import java.util.*;

public class Lesson10 {
    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap<>();
        map.put(12,"twelve");
        map.put(1,"one");
        map.put(44,"forty four");
        map.put(45,"forty five");
        map.put(46,"forty six");
        map.put(0,"zero");
        map.put(3,"three");
        map.put(22,"twenty two");
        map.put(100,"one hundred");

        System.out.println("My initial map: "+map);
        System.out.println("Sorted map:");
        printMyMap(map);

    }
    public static void printMyMap (Map<Integer, String> map){
        Set <Integer> tempSet = new TreeSet<>(map.keySet());
        for (Integer s: tempSet
             ) {
            System.out.print(s+" = "+map.get(s)+"; ");
        }
    }
}
