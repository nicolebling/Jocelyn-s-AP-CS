//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rectangle one = new Rectangle(3, 4); 
        System.out.println(one);

        Animal cat = new Animal("Cat", true, 3);
        System.out.println(cat);

        Chocolatecake product1 = new Chocolatecake(4, 5, 6, 7);
        System.out.println(product1);
        Chocolatecake product2 = new Chocolatecake(2, 3, 4, 5);
        System.out.println(product2);

        int x = 4 + 2; //object
        x = 7;
        if (x % 2 == 0){
            System.out.println("x is divisible by 2");
        }else {
            System.out.println("x is not divisible by 2");
        }
        /////////////////////////////////////////////////////////
        if (x % 4 == 0){
            System.out.println("x is divisible by 4");
        }else if (x % 4 ==1){
            System.out.println("x is the multiple of 5");
        }else if (x % 4 == 2){
            System.out.println("x is an even number");
        }else{
            System.out.println("x is an odd number");
        }

        final int age = 22;
        System.out.println(age);

        int salt&Pepper = 3;

    }
}