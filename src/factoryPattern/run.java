package factoryPattern;

public class run {
    public static void main(String[] args) {
        humanFactory hf = new humanFactory();
        orcFactory of = new orcFactory();
        elfFactory ef = new elfFactory();

        hf.makeHeroes();
        System.out.println("-----");
        of.makeHeroes();
        System.out.println("-----");
        ef.makeHeroes();
    }
}