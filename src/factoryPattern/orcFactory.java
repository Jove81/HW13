package factoryPattern;

import java.util.Random;

public class orcFactory implements Factory{
    Random rnd = new Random();
    int OrcID = rnd.nextInt(10);
    int OrcHp = rnd.nextInt(80,100);
    int OrcArmor = rnd.nextInt(20);
    int OrcPower = rnd.nextInt(5,15);

    @Override
    public void makeHeroes(){
        Orc orc = new Orc("Orc"+OrcID, OrcHp, OrcArmor, OrcPower);
        System.out.println("Создан орк: ");
        System.out.println("Имя: "+orc.name + " Здоровье: "+OrcHp + " Броня:"+OrcArmor+ " Сила: "+OrcPower);
    }
}
