package factoryPattern;

public class Elf extends Heroes {

    int Attack;
    public Elf(String name, int hp, int armor, int power, int attack) {
        super(name, hp, armor, power);
        this.Attack = attack;
    }
}