public class Config {
    private static final String[] CHOICES = {"ROCK", "PAPER", "SCISSORS"};
    private static final String[] OUTCOMES = {"We Tied!", "Aww, You Win.", "I won! You Lose!", "That's NOT how you're supposed to play the game."};

    public static String printRules(){
        return "Welcome To Rock, Paper, Scissors! The Rules Are Simple, Rock Beats Scissors, Scissors Beats Paper, and Paper Beats Rock!";
    }

    public static int calculateWinner(int pcChoice, int npcChoice){
        if (pcChoice == npcChoice) {
            return 0;
        }
        else if (pcChoice == 0 && npcChoice == 1 || pcChoice == 1 && npcChoice == 2 || pcChoice == 2 && npcChoice == 0){
            return 2;
        }
        else if (pcChoice == 3) {
            return 3;
        }
        else {
            return 1;
        }
    }

    public static String printOutcome(int winner){
        return OUTCOMES[winner];
    }
}

