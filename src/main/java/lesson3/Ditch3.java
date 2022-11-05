package lesson3;

import java.util.Random;

public class Ditch3 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(3);
        int num2 = random.nextInt(10);
        int num3 = random.nextInt(10);
        System.out.println(num+" "+num2+" "+num3);
        switch (num){
            case 1 :
                System.out.println("sum "+(num2+num3));
                break;
            case 2 :
                System.out.println("minus "+(num2-num3));
                break;
            case 3 :
                System.out.println("multiply "+(num2*num3));
                break;
            default:
                System.out.println("error");
                break;
        }

    }
}
