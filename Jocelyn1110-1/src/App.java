class Animal { //Superclass
    // field and method of the parent class
    String name; //instance variable
    public void eat() {
        System.out.println("I can eat");
    }
}

// inherit from Animal
class Dog extends Animal { //subclass
    // new method in subclass
    public void display() {
        System.out.println("My name is " + name);
    }
}
//inherit from Animal
class Cat extends Animal{ //subclass
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
        labrador.name = "Rohu"; //would not print any
        labrador.display();

        // call method of superclass
        // using object of subclass
        labrador.eat();

    }
}