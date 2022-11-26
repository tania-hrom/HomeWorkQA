package lesson7;

public class CheckClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Lily");
        Dog dog = new Dog("Jack");
        BigDog bdog = new BigDog("Bill");
        Lion lion = new Lion("Leo");
        Wolf wolf = new Wolf("Black");
        cat.feed();
        dog.greets();
        dog.greets(new Dog("test"));
        bdog.greets(new BigDog ("bdog"));
        bdog.greets(bdog);
        lion.hunting();
        wolf.greets();
        test1(bdog);
        test2(wolf);
    }
    public static void test1(Pet pet){
        pet.play();
        pet.walk();
    }
    public static void test2(WildAnimal wild){
        wild.hunting();
    }

}
