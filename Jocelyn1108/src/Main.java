//class Main {
//    public static void main(String[] args) {
//        // create a variable of string type
//        String name = "Programiz";
//
//        // checks if name is instance of String
//        boolean result1 = name instanceof String;
//        System.out.println("name is an instance of String: " + result1);
//
//        // create an object of Main
//        Main obj = new Main();
//
//        // checks if obj is an instance of Main
//        boolean result2 = obj instanceof Main;
//        System.out.println("obj is an instance of Main: " + result2);
//    }
//}
import java.util.scanner;
//inheritance defines a relationship between objects that characteristics.
class Animal {

    // field and method of the parent class
    String name;
    public void eat() {
        System.out.println("I can eat");
    }
}

// inherit from Animal
class Dog extends Animal {

    // new method in subclass
    public void display() {
        System.out.println("My name is " + name);
    }
}
//inherit from Animal
class Cat extends Animal{
    public void display() {
        System.out.println("Meow" + name);
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of the subclass
        Dog labrador = new Dog();
        Cat bluecat = new Cat();

        // access field of superclass
        labrador.name = "Rohu";
        labrador.display();

        // call method of superclass
        // using object of subclass
        labrador.eat();

    }
}