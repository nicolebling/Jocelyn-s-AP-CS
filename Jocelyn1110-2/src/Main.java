class Animal { //Superclass
    // field and method of the parent class
    String name; //instance variable
    public void eat() {
        System.out.println("I can eat");
    }

    public void sleep() {
        System.out.println("I can sleep");
    }
}

// inherit from Animal
class Dog extends Animal { //subclass

    // new method in subclass
    public void display() {
        System.out.println("My name is " + name);
//        System.out.println("My name is A");
//        System.out.println("My name is B");
//        System.out.println("My name is C");

    }
    public void exercise(){
        System.out.println("Dogs need more exercise!");
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

        Rectangle n = new Rectangle();
//        length is 7, width is 5
        n.length = 7;
        n.width = 5;
        System.out.println("--------------------------------------------------");
        System.out.println("The area of rectangle n is" + n.Area());
        n.Perimeter();
        System.out.println("--------------------------------------------------");

        Rectangle m = new Rectangle();
        m.length = 4;
        m.width = 3;
        System.out.println("The area of rectangle m is " + n.Area());
        n.Perimeter();
        System.out.println("--------------------------------------------------");
        Circle c = new Circle();
        c.radius = 9;
        c.Area();
        System.out.println("The circumference of c is " + c.Circumference());
        Circle d = new Circle();
        d.radius = 66;
        d.Area();
        System.out.println("The circumference of d is " + d.Circumference());
        System.out.println("--------------------------------------------------");
        // create an object of the subclass
        Dog labrador = new Dog();
        Cat bluecat = new Cat();
        Dog A = new Dog();
        A.name = "A";
        A.display();
        // access field of superclass
        labrador.name = "Rohu"; //would not print any
        labrador.display();
//        Dog A, b, C
        bluecat.name = "Kuro";
        bluecat.display();
        // call method of superclass
        // using object of subclass
        labrador.eat();

        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Alice", 5000);
        employees[1] = new Employee("Bob", 4500);
        employees[2] = new Manager("Charlie", 6000, 2000);
        employees[3] = new Manager("David", 5500, 1500);

        for (Employee employee : employees) {
            System.out.println(employee.name + "'s Total Salary: $" + employee.calculateSalary());
        }
    }
}

