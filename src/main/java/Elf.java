public class Elf extends Player{
    int speed;
    public Elf(int health, int lives, int strength) {
        super(health, lives, strength);
    }

    public Elf(int health, int lives, int strength, int speed) {
        super(health, lives, strength);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
