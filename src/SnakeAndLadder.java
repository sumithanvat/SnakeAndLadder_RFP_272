import java.util.Random;

public class SnakeAndLadder {
    // main method started
    public static void main(String[] args) {

        int playerPosition = 0;
        int diceRolls = 0;

        // taking random value
        Random random = new Random();
        /*
        UC_2
         */

        // using while loop till position is less than 100
        while (playerPosition < 100){
            // storing value of random to roll
            int roll= random.nextInt(6)+1;
            System.out.println("you rolled a "+roll);
            diceRolls++;
        }

    }
}
