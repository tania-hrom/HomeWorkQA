package lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal(false,"meat",3);
        System.out.println(animal.getEats());
        System.out.println(animal1.getNoOfLegs());
        Cat cat = new Cat(false,"mouse",4);
        Cat greyCat = new Cat(false, "meat", 4, "grey");
        System.out.println(greyCat.getColor());
        System.out.println(cat.getEats());
    }
}
