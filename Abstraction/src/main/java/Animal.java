public abstract class Animal implements AnimalInterface {
    public String name;

    public abstract void makeSound();

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
