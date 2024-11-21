public class Arena {
    private Player[] players;
    private Dice dice;
    private int attackerIndex;
    private int defenderIndex;

    public Arena(Player player1,Player player2){
        this.players = new Player[]{player1,player2};
        this.dice = new Dice();
        this.attackerIndex = 0;
        this.defenderIndex = 0;
    }

    public void playGame(){
        System.out.println("\n--- The Battle Begins! ---");
        
    }
}
