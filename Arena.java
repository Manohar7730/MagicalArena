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
        this.defenderIndex = 1;
    }

    // check player health to continue game to next round
    public boolean GameOver(){
        return players[0].getPlayerHealth()<=0 || players[1].getPlayerHealth()<=0;
    }

    // perform a battle round
    public void performBattle(){
        Player attacker = players[attackerIndex];
        Player defender = players[defenderIndex];

        // roll the dice for attack and defend
        int attackRoll = dice.roll();
        int defendRoll = dice.roll();

        // calculate attack and defend power
        int attackPower = attackRoll*attacker.getPlayerAttack();
        int defendPower = defendRoll*defender.getPlayerStrength();

        // calculate damage
        int damage = Math.max(0, attackPower-defendPower);

        // Apply damage to defender
        defender.setPlayerHealth(defender.getPlayerHealth()-damage);

        // Display the round's result
        System.out.println("\n" + attacker.getPlayerName() + " attacks!");
        System.out.println(" - Attack Roll: " + attackRoll + " | Attack Power: " + attackPower);
        System.out.println(defender.getPlayerName() + " defends!");
        System.out.println(" - Defense Roll: " + defendRoll + " | Defense Power: " + defendPower);
        System.out.println("Damage Dealt: " + damage);
        System.out.println(defender.getPlayerName() + "'s Remaining Health: " + defender.getPlayerHealth());
    }

        // Swap attacker and defender for the next round
    public void swapPlayers(){
        int temp = attackerIndex;
        attackerIndex = defenderIndex;
        defenderIndex = temp;
    }

    // Determine the winner
    private Player determineWinner() {
        if (players[0].getPlayerHealth() > 0) {
            return players[0];
        } else if (players[1].getPlayerHealth() > 0) {
            return players[1];
        } else {
            return null; // Draw (unlikely with current logic)
        }
    }

    // start the game
    public void playGame(){
        System.out.println("\n--- The Battle Begins! ---");
        while (!GameOver()) {
            performBattle();
            swapPlayers();
        }

        // Determine and announce the winner
        Player winner = determineWinner();
        if (winner != null) {
        System.out.println("\nGame Over! The winner is: " + winner.getPlayerName());
        } else {
            System.out.println("\nGame Over! It's a draw!");
        }    
    }
}
