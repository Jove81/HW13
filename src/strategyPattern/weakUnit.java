package strategyPattern;

import java.util.Random;

public class weakUnit implements power{

    Random random = new Random();
    int id = random.nextInt(1,10);
    int hp = random.nextInt(1,10);
    int speed = random.nextInt(1,10);
    int power = random.nextInt(1,10);
    int armor = random.nextInt(1,10);

    @Override
    public void PowerMeter() {
        unit unit = new unit("Unit"+id, hp, speed, power, armor);
        System.out.println("Создан слабый персонаж с данными: ");
        System.out.println("Имя: Unit"+id +" " + "HP: "+hp+" "+"Speed: "+speed+" "+"Power: "+power+" "+"Armor: "+armor);
    }
}