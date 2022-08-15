package strategyPattern;

import java.util.Random;

public class strongUnit implements power {

    Random random = new Random();

    int id = random.nextInt(10,20);//id нужен для того чтобы имена отличались
    int hp = random.nextInt(10,20);
    int speed = random.nextInt(10,20);
    int power = random.nextInt(10,20);
    int armor = random.nextInt(10,20);

    @Override
    public void PowerMeter() {
        unit unit = new unit("Unit"+id, hp, speed, power, armor);
        System.out.println("Создан сильный персонаж с данными: ");
        System.out.println("Имя: Unit"+id +" " + "HP: "+hp+" "+"Speed: "+speed+" "+"Power: "+power+" "+"Armor: "+armor);
    }
}