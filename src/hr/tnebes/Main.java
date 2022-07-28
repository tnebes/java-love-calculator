package hr.tnebes;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        final String name1 = "Marta";
        final String name2 = "Manuel";
        System.out.println(new LoveCalculator(name1, name2).getLovePercent());
    }
}
