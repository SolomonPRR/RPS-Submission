public class RPS {
    public static void main(String args[]){
        System.out.println(Config.printRules());
        Player pc = new Player();
        Player npc = new Player();
        pc.setPcChoice();
        npc.setNpcChoice();
        System.out.println(Config.printOutcome(Config.calculateWinner(pc.getChoice(), npc.getChoice())));
    }
}
