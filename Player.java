public class Player {
    // Declaring private variables for player attributes
    private String playerName;
    private int playerHealth;
    private int playerStrength;
    private int playerAttack;

    // Constructor
    public Player(String name,int health,int strength,int attack){
        this.playerName = name;
        this.playerHealth = health;
        this.playerStrength = strength;
        this.playerAttack = attack;
    }

    // getters of player attributes
    public String getPlayerName(){
        return  this.playerName;
    }

    public int getPlayerHealth(){
        return this.playerHealth;
    }

    public int getPlayerStrength(){
        return this.playerStrength;
    }

    public int getPlayerAttack(){
        return this.playerAttack;
    }

    // Setters for player attributes
    public void setPlayerHealth(int health){
        this.playerHealth = health;
    }

    public void setPlayerStrength(int strength){
        this.playerStrength = strength;
    }

    public void setPlayerAttack(int attack){
        this.playerAttack = attack;
    }
}
