//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First People's Data:");
        System.out.print("weight: ");
        int weight = scanner.nextInt();
        System.out.print("height: ");
        double height = scanner.nextInt();
        height = height / 100;
        double bmi = weight / (height * height);
        System.out.println("Your BMI: " + String.format("%.2f", bmi));
//        System.out.println(Math.round((bmi * 100.0) / 100.0));
        Explanation(bmi, height, weight);

        System.out.println();

        System.out.println("Enter Second People's Data:");
        System.out.print("weight: ");
        weight = scanner.nextInt();
        System.out.print("height: ");
        height = scanner.nextInt();
        height = height / 100;
        bmi = weight / (height * height); // weight = bmi * height * height;
        System.out.println("Your BMI: " + String.format("%.2f", bmi));
        //System.out.printf("Your Bmi: %.2f", bmi , "\n");
        Explanation(bmi, height, weight);
    }

    // weight?
    // height 160 constant
    // ideal bmi 22
    //void is a keyword that use to specify that a method does not return a value (not a string)
    //public static void main(String[] args) option1
    //public static String someClassName(parameters)
    public static void Explanation(double bmi, double height, double weight){
        double idealWeight = 22 * height * height;
        double weightChange = Math.abs(weight - idealWeight);
        if (bmi < 18.5){
            System.out.println("Underweight");
            System.out.println("You should gain " + String.format("%.2f", weightChange) + " kg");
        }else if (18.5 <= bmi && bmi < 24){
            System.out.println("Normal");
        }else if (24 <= bmi && bmi < 27){
            System.out.println("Overweight");
            System.out.println("You should loss " + String.format("%.2f", weightChange) + " kg");
        }else if (27 <= bmi && bmi < 30){
            System.out.println("Slight obesity");
            System.out.println("You should loss " + String.format("%.2f", weightChange) + " kg");
        }else if (30 <= bmi && bmi < 35){
            System.out.println("Middle obesity");
            System.out.println("You should loss " + String.format("%.2f", weightChange) + " kg");
        }else {
            System.out.println("Extreme obesity");
            System.out.println("You should loss " + String.format("%.2f", weightChange) + " kg");
        }
    }
    public static void Car{
        String color; //instance variable or object
        int speed; //instance variable

        System.out.println(color instanceOf Car);
        public void accelerate() { //instance method
            this.speed ++ ;
        }
    }



}