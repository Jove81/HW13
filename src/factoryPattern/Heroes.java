package factoryPattern;

public abstract class Heroes {
    public String name;
    int hp;
    int armor;
    int power;

    protected Heroes(String name, int hp, int armor, int power){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.power = power;

    }
}
