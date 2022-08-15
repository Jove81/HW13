package factoryPattern;

import java.util.Random;

public class humanFactory implements Factory {
    Random rnd = new Random();
    int HumanID = rnd.nextInt(10);
    int HumanHp = rnd.nextInt(80,100);
    int HumanArmor = rnd.nextInt(20);
    int HumanPower = rnd.nextInt(5,15);

    @Override
    public void makeHeroes() {
        Human human = new Human("Human_"+HumanID, HumanHp, HumanArmor, HumanPower);
        System.out.println("Создан человек:");
        System.out.println("Имя: "+human.name + " Здоровье: "+HumanHp + " Броня: "+HumanArmor+ " Сила: "+HumanPower);
    }
}