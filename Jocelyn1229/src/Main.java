import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void weatherRecords() {
        Scanner scanner = new Scanner(System.in);

        // 1. Input the number of days
        System.out.print("How many days' temperatures? ");
        int numDays = scanner.nextInt();

        int[] temperatures = new int[numDays];
        int total = 0;

        // 2. Input temperature values for each day
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temperatures[i] = scanner.nextInt();
            total += temperatures[i];
        }

        // 3. Calculate the average temperature
        double averageTemp = (double) total / numDays;

        // 4. Count the number of days with temperatures higher than the average
        int countAboveAverage = 0;
        for (int temp : temperatures) {
            if (temp > averageTemp) {
                countAboveAverage++;
            }
        }

        // 5. Find the highest temperature
        int highestTemp = temperatures[0];
        for (int temp : temperatures) {
            if (temp > highestTemp) {
                highestTemp = temp;
            }
        }

        // 6. Find the lowest temperature
        int lowestTemp = temperatures[0];
        for (int temp : temperatures) {
            if (temp < lowestTemp) {
                lowestTemp = temp;
            }
        }

        // Display the results
        System.out.print("You entered: ");
        for (int temp : temperatures) {
            System.out.print(temp + " ");
        }
        System.out.println();

        System.out.printf("Average temp = %.2f\n", averageTemp);
        System.out.println(countAboveAverage + " days were above average.");
        System.out.println("Highest temp = " + highestTemp);
        System.out.println("Lowest temp = " + lowestTemp);
    }

    public static void main(String[] args) {
        weatherRecords();
        printNums(5, 4);
        printNums(3, 3);
        printNums(5, 6);
    }
    public static void printNums(int value, int numRounds){
        Random randomvalue = new Random();

        for(int round = 0; round < numRounds; round++){
            int randomNumber; //generate a random value from 0 - 9
            while ((randomNumber = randomvalue.nextInt(10)) != value){
                System.out.print(randomNumber);
            }
            System.out.print(value);
            System.out.println();
        }
    }
}