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

            /*
            UC _ 3
             */
            // UC 3 Check for option
            int option = random.nextInt(3);
            switch (option) {
                case 0:
                    System.out.println("Your position stays the same");
                    break;
                case 1:
                    int ladder = random.nextInt(100 - playerPosition) + 1;
                    playerPosition += ladder;
                    System.out.println("You climbed a ladder  Your new position is " + playerPosition);
                    break;
                case 2:
                    int snake = random.nextInt(playerPosition) + 1;
                    playerPosition -= snake;
                    System.out.println("You got swallowed by a snake Your new position is " + playerPosition);
                    break;
            }

        }

    }
}
