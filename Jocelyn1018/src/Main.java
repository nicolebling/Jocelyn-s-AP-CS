import java.util.Scanner;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Random rand = new Random();
        System.out.println("Create Random Number");
        //-------------------------
        System.out.print("Input min number: ");
        int min = scanner.nextInt();
        System.out.print("Input max number: ");
        int max = scanner.nextInt();
        System.out.println("Number:" + nicolesrandomnumber(min, max));


        // user input a steps
        // min + steps, max + steps
        System.out.println("Input a step: ");
        int steps = scanner.nextInt(); //ask the user for the steps for increment
        min += steps; //redefine the value for minimum  min = min + steps
        System.out.println("new min: " + min);
        max -= steps; //redefine the value for maximum
        System.out.println("new max: " + max);
        System.out.println("Number:" + nicolesrandomnumber(min, max));

        Math.random();//if empty 0.0-1.0
        System.out.println(Math.random(1, 3));


    }

    public static int nicolesrandomnumber(int min, int max) {
        Random rand = new Random();
        return (int) rand.nextInt((max - min) + 1) + min;
    }


}