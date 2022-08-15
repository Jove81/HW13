package factoryPattern;

import java.util.Random;

public class elfFactory implements Factory{
    Random rnd = new Random();
    int ElfID = rnd.nextInt(10);
    int ElfHp = rnd.nextInt(80,100);
    int ElfArmor = rnd.nextInt(20);
    int ElfPower = rnd.nextInt(5,15);
    int ElfAttack = rnd.nextInt(50,100);
    @Override
    public void makeHeroes() {
        Elf elf = new Elf("Elf_"+ElfID, ElfHp, ElfArmor, ElfPower, ElfAttack);
        System.out.println("Создан эльф: ");
        System.out.println("Имя: "+elf.name + " Здоровье: "+ElfHp + " Броня: "+ElfArmor+ " Сила: "+ElfPower+ " Уровень атаки: "+ElfAttack);
    }
}
