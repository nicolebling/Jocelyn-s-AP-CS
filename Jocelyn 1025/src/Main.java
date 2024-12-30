import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Use a for-loop to print 1 to 10
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        int x = 1;
        while (x <= 10){
            System.out.println(x);
            x++;
        }
        int y = 0;
        while (y <= 10){
            y++;
            System.out.println(y);
        }

        // A for-loop that find even number between 0 to n = 100
        for (int n = 0; n <= 100; n++){
            if (n % 2 == 0){
                System.out.println(n);
            }
        }
        int n = 0;
        while (n <= 100){
            n ++;
            if (n % 2 == 0){
                System.out.println(n);
            }
        }

        double e = 2.5;
        double i = e;
        System.out.println(i); //2.5
        i = (int) e; // i is a double
        int t = (int) e;
        System.out.println(i); //2.0
        System.out.println(t); //2

        System.out.println(true && true); //true
        System.out.println(true && true && false); //false
        System.out.println(true && true || false); //true
        System.out.println(true || true || false); //true
        System.out.println(true && !(true || false)); //false
    }
}