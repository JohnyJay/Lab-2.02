public abstract class Player {
    int health;
    int  original_health;
    int lives;
    int strength;

    public Player(int health, int lives, int strength) {
        this.original_health = health;
        this.health = health;
        this.lives = lives;
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void decrementLive(){
        if(lives>0){
            this.lives = lives -1;
            health = original_health;
        }else{
            System.out.println("This character is dead");
        }
    }

    public void attack(Player playerToAttack){
        playerToAttack.health -= this.strength;
    }

    public void checkHealth(){
        if(health<=0) decrementLive();
    }

}
