import java.util.Scanner;
public class Player {
    private int choice;

    public void setPcChoice(){
        System.out.println("Choose Rock, Paper, or Scissors, And I'll Do The Same!");
        Scanner askChoice = new Scanner(System.in);
        String pcChoice = askChoice.nextLine();
        if (pcChoice.equalsIgnoreCase("ROCK")){
            choice = 0;
        }
        else if (pcChoice.equalsIgnoreCase("PAPER")){
            choice = 1;
        }
        else if (pcChoice.equalsIgnoreCase("SCISSORS")){
            choice = 2;
        }
        else {
            choice = 3;
        }
    }

    public void setNpcChoice(){
       choice = (int)(Math.random() * 3);
    }

    public int getChoice(){
        return choice;
    }
}

