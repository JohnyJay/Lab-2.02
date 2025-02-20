public class Wizard extends Player{
    int spell;

    public Wizard(int health, int lives, int strength, int spell) {
        super(health, lives, strength);
        this.spell = spell;
    }

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public Elf convertToElf(){
        return new Elf(health,lives,strength);
    }
}
