import Animal.Animal;
import Human.Human;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Animal";
        animal.setLifeWhere("Earth");
        Human human = new Human();
        human.setId("1");
    }
}
