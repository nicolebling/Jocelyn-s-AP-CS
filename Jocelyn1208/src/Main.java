class Animal {
    String name; // Attribute
    int age;

    //Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Method
    public static void makeSound() {
        // return the animal's sound
        System.out.println(" Meow!!!!!");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Dog", 10);
        animal.makeSound();

        //If want to call a method in another class
        //classNameVariable.method();
    }
}
