package strategyPattern;
import java.util.Random;

public class run {
    public static void main(String[] args) {
        createUnitRandom();

    }

    static void createUnitRandom(){
        Random rnd = new Random();
        int num = rnd.nextInt(1,3);
        System.out.println(num);
        if (num == 1){
            strong();
        }
        if (num == 2){
            weak();
        }

    }

    static void strong(){
        strongUnit unit = new strongUnit();
        unit.PowerMeter();
    }

    static void weak(){
        weakUnit unit = new weakUnit();
        unit.PowerMeter();
    }

}