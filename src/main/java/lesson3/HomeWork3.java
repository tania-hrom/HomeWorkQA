package lesson3;

import lesson4.Util;

import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        System.out.println("My array:");
        for (int i=0; i<array.length;i++){
            array[i] = random.nextInt(50+50)-50;
            System.out.print(array[i] + " ");
        }
        System.out.println("\n"+"-----");
        System.out.println("Numbers to be calculated:");
        int i = 0, sum = 0;
        while (i<array.length){
            if (array[i]>5 && array[i]<45) {
                sum = sum + array[i];
                System.out.print(array[i]+" ");
            }
            i++;
        }

        System.out.println("\n"+"Result "+sum);
        System.out.println("-----//---");
        System.out.println(Util.firstMethod(array));
        System.out.println("-----");
        System.out.println("Even positive numbers:");
        for (int a=0; a<array.length;a++){
            int num = array[a] ;
            if (num>0 && MathMethodsForL3.checkIfEven(num)) {
                System.out.print(array[a]+" ");
            }
        }
        System.out.println("\n"+"-----//---");
        Util.secondMethod(array);



    }
}
