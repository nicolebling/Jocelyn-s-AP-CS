import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Scanner myName = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//
//        String name = myName.nextLine();
//
//        int value = 3, mean = 2, num = 5;
//        double somthing = 0.2;
//        double deviation = (value-mean) / num;
//        double devia = (double) (value-mean) / num;
//        System.out.println(deviation);
//        System.out.println(devia);

//        1. double isRaining = false; //should use boolean
//        2. String gradeOnTest = "a";
//        3. int balance = 30;
//        4. char grade_on_test = 'A';
        //Cannot be a datatype double
//        1. "60"; //putting a quotation mark
//        2. 5;
//        3. 6.7;
//        4. -0.2;
        int num3 = 5;
        System.out.println(num3); //5
        System.out.println(5); //5
        System.out.println(true);//boolean
        System.out.println("fdgtyuik,mnbvfgtyuik");
        double num1 = 5;
        System.out.println(num1);  //5.0
        System.out.println(5+2+3);
        double num2 = (double) (78-70) / num3;
        System.out.println(num2);

        //Which of the following declares the variable bestProgrammingLanguage and initializes it to be "Java"?
//        1. String bestProgrammingLanguage = "Java";
//        2. bestProgrammingLanguage = String "Java;";
//        3. string bestProgrammingLanguage = "Java";
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        int minValue = Math.min(5, 10);
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random()); //0.0(inclusive) to 1.0(exclusively)

        int w = 1;
//        int x = w/2;
//        System.out.println(x);

        double x = 4.5;
        System.out.println((int)x);

        int a = 3;
        int b = 4;
        int sum = a + b;
        double average = (double) (sum / 2);
        System.out.println(average);
        double num5 = (double) 9 / 4;
        int num6 = 9/4;
        System.out.println((double) num5);
        System.out.println(num6);
        System.out.println(num5);
        double num7 = 7;
        System.out.println(num7); //7.0

        double val = -.7;
        int roundedval = (int)( val +0.5);
        System.out.println(roundedval);

        System.out.println( 9 + 10 % 12);







        String ourSchool = "KangChiao";
        // The string has the length of 9
        // but its total index is 8
        // someString.charAt(index = where computer knows its location);
        char letterK = ourSchool.charAt(0);
        char letterO = ourSchool.charAt(8);
        System.out.println(letterK); //K
        System.out.println(ourSchool.charAt(0)); //K

        System.out.println(letterO); //o
        System.out.println(ourSchool.charAt(8)); //o
        //someString.length();
        int lengthOfOurSchool = ourSchool.length();
        System.out.println(lengthOfOurSchool); //9
        System.out.println(ourSchool.length()); //9

        final int p = 3;
//        p--;
//        p += 2;
//        p = 2;
//        p *= 3;
        System.out.println(p);

    }

}