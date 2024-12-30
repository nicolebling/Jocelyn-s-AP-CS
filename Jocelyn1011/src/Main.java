//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Scanner nicole = new Scanner(System.in);
//        int choice = nicole.nextInt();
//        String text1 = nicole.nextLine();
//        System.out.println(text1);
//        System.out.println(choice);

        System.out.println("Hello World!");
        String text = "Hello World!";
        int length = text.length();
        System.out.println(length); //12
        //!
        System.out.println(text.substring(11));
        String name = "Jocelyn Wu";
        System.out.println(name.substring(3, 4)); //e
        System.out.println(name.substring(3, 7)); //elyn
        int num1 = 2;
        int num2 = 3;
        // if (condition){
        // System.out.println(...)}
        //else{
        // System.out.println(...)}
        num1 = -2;
        if (num1 > 0){
            System.out.println("num1 is greater than 0");
        }else {
            System.out.println("num1 is less than 0");
        }
        int num3 = 25;
        System.out.println(10 % 3); //1
        // write an if-else statement that chekc if a number is even or odd
        if (num3 % 2 == 0){
            System.out.println("num3 is even");
        }else {
            System.out.println("num3 is odd");
        }
        int a = 10, b = 20, c = 30;
        if (a > b){
            System.out.println("a is greater than b");
        }else if (a < b){
            System.out.println("a is less than b"); //will print
        }else if (b > c){
            System.out.println("b is greater than c");
        }else if (b < c){
            System.out.println("b is less than c"); //will print
        }else{
            System.out.println("c is greater than c");
        }
        if (a > b){
            System.out.println("a is greater than b");
        } if (a < b){
            System.out.println("a is less than b"); //will print
        } if (b > c){
            System.out.println("b is greater than c");
        } if (b < c){
            System.out.println("b is less than c"); //will print
        }else{
            System.out.println("c is greater than c");
        }
        //write an grade calculator
        int grade = 88;
        // if grade is greater than 90 print "A"
        // if grade is between 80 to 89 print "B"
        // if grade is between 70 to 79 print "C"
        // if lower than or equals to 69 print "F"
        if (grade > 90){
            System.out.println("A");
        } else if (80 <= grade && grade <= 89){
            System.out.println("B");
        } else if (70 <= grade && grade <= 79){
            System.out.println("C");
        } else {
            System.out.println("F");
        }
        System.out.println("------------------------------------------------------------------------------");
        //Iternation
        for (int x = 0; x < 10; x++){
            System.out.println(x);
        }
        for (int x = 0; x <= 10; x++){
            System.out.println(x);
        }

        for (int x = 0; x < 3; x++){
//            System.out.println(x); // 0, 1 ,2
            System.out.println("Hello world!"); //3 hello world!
            System.out.println(10 * x); // 0, 10, 20
        }
        // write a for loop of i starting from 1 that will run 20 times, within each loop print(2 * i)
        for (int i = 1; i <= 20; i++){
            System.out.println(2 * i);
        }
        int num6 = 10;
        while (num6 > 0){
            System.out.println(num6);
            num6--;
        }

        int num7 = 0;
        // print out 0, 1, 2, 3, 4, 5 by using a while loop
        while (num7 < 6){
            System.out.println(num7);
            num7++;
        }
//        while (password_set != password_enter){
//
//        }
        //using a for loop
//        num7 = 0;
        for (int num8 = 0; num8 < 6; num8++){
            System.out.println(num8);
        }
        //infinite for loop
        System.out.println("______________________________________________________________");
//        for (int i = 0; i < 10; i --){
//            System.out.println(i);
//        }
        // write a for-loop starting from 1 to 100, print out every even number
        for (int num9 = 1; num9 <= 100; num9++){
            if (num9 % 2 == 0){
                System.out.println(num9);
            }
        }
        System.out.println("-------------------------------");
        int num10 = 2;
        while (num10 % 2 == 0 && num10 <= 100){
            System.out.println(num10);
            num10 += 2;
        }
//        *
//        **
//        ***
//        ****
//        *****
        for (int i = 1; i <= 5; i++){
            for(int j  = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}