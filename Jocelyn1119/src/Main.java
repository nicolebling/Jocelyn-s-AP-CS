public class Main {
    public static void main(String[] args) {
        // Call the fourHeads method
        fourHeads();
    }

    public static void fourHeads() {
        int count = 0;
        while (count < 4) {
            if (Math.random() < 0.5) {
                System.out.print("H ");
                count++;
            } else {
                System.out.print("T ");
                count = 0;
            }
        }
        System.out.println("\nFour heads in a row!");
    }
}