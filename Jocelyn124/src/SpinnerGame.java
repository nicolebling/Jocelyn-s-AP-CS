
public class SpinnerGame {
    public static void main(String[] args) {
        SpinnerGame game = new SpinnerGame();
        System.out.println("Starting Spinner Game...");
        game.playRound();
    }
    public int spin(int min, int max){
        int result =  (int) (Math.random() * (max - min + 1)) + min;
        return result;
    }
    public void playRound(){
        int playerSpin1 = spin(1, 10);
        int computerSpin1 = spin(2, 8);
        System.out.println("Player Spin #1: " + playerSpin1);
        System.out.println("Computer Spin #1: " + computerSpin1);

        if (playerSpin1 > computerSpin1){
            System.out.println("You win! " + (playerSpin1 - computerSpin1) + " points");
        } else if (playerSpin1 < computerSpin1){
            System.out.println("You lose! -" + (computerSpin1 - playerSpin1) + " points");
        } else {
            // tie, spin again
            System.out.println("It's a tie! Spinning again..."); //regenerate a random number
            int playerSpin2 = spin(1, 10);
            int computerSpin2 = spin(2, 8);
            System.out.println("Player Spin #2: " + playerSpin2);
            System.out.println("Computer Spin #2: " + computerSpin2);

            int playerTotal = playerSpin1 + playerSpin2;
            int computerTotal = computerSpin1 + computerSpin2;
            if (playerTotal > computerTotal){
                System.out.println("You win! 1 point");
            } else if (playerTotal < computerTotal){
                System.out.println("You lose! -1 point");
            } else {
                System.out.println("Tie. 0 points");
            }

        }
    }
}
