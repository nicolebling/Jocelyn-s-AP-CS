import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        multiplicationTable(n);
        printLadder(n);
        printTriangle(n);

    }

    //lab2
    /* n = 4
       *
      ***
     *****
    *******
     */
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = i; j < n; j++){
                System.out.print(" "); //space
            }
            for (int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    // 1-2
    public static void printLadder(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("1"); // 1
            }
            System.out.println();
        }
    }
    // 1-1
    public static void multiplicationTable(int n){
        for(int i = 1; i <= n; i++){
            for (int y = 1; y <= 10; y++){
                System.out.print(y * i + "\t");
            }
            System.out.println();
        }
    }
}