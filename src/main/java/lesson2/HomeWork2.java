package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        String str = "  some text for test";
        int numberOfSymbols = str.length();
        System.out.println("Number of all symbols "+numberOfSymbols);
        String strWithoutSpaces = str.trim();
        System.out.println("Original string: "+str);
        System.out.println("New string: "+strWithoutSpaces.substring(0, 1).toUpperCase()+strWithoutSpaces.substring(1));
    }
}
