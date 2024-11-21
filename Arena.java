public class Arena {
    private Player[] players;
    private Dice dice;
    private int attackerIndex;
    private int defenderIndex;

    // constructor
    public Arena(Player player1,Player player2){
        this.players = new Player[]{player1,player2};
        this.dice = new Dice();
        this.attackerIndex = 0;
        this.defenderIndex = 0;
    }

    // check player health to continue game to next round
    public boolean GameOver(){
        return players[0].getPlayerHealth()<=0 || players[1].getPlayerHealth()<=0;
    }

    // start the game
    public void playGame(){
        System.out.println("\n--- The Battle Begins! ---");
        while (!GameOver()) {
            System.out.println("Continue battle");
        }
    }
}
