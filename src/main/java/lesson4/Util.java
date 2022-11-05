package lesson4;

import java.util.Random;

public class Util {
    public static void main(String[] args) {
        Random random = new Random();
        int elements = random.nextInt(20)+1;
        int [] array = new int[elements];
        System.out.println("My array with "+elements+" elements:");
        for (int i=0; i< array.length;i++){
            array[i]=(random.nextInt(50+50)-50);
            System.out.print(array[i]+" ");
        }
        System.out.println("\n"+"------");
        System.out.println(firstMethod(array));
        System.out.println("------");
        secondMethod(array);
        System.out.println("\n"+"------");
        //тут виведеться те саме що і в secondMethod просто іншим способом
        int[] arr = arr(array);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
    public static int firstMethod (int... num){
        int sum = 0;
        System.out.println("Elements to be counted: ");
        for (int i:
             num) {
            if (i > 5 && i < 45) {
                sum = sum + i;
                System.out.print(i+" ");
            }
        }
        System.out.print("\nResult ");
        return sum;
    }
    public static void secondMethod(int... num){
        System.out.println("Positive even numbers ");
        for (int i:
             num) {
            if (i>0 && i%2==0){
                System.out.print(i+" ");
            }
        }
    }

    //по суті дублюю тут другий метод, спробувала інший варіант - записати результат в новий масив
    public static int[] arr (int... num){
        int count = 0;
        for (int i:
                num) {
            if (i>0 && i%2==0){
               count++;
            }
        }
        int[] arr = new int[count];
        int j = 0;
        for (int i:
                num) {
            if (i>0 && i%2==0){
                arr[j]= i;
                j++;
            }
        }
        return arr;
    }
}
