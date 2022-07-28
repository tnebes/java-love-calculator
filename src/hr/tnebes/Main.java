package hr.tnebes;

import java.util.Scanner;

public class Main {

    final String name1;
    final String name2;

    public Main(final String name1, final String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public static void main(String[] args) {
        final String name1;
        final String name2;
        try (final Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first lover's name: ");
            name1 = scanner.nextLine();
            System.out.print("Enter the second lover's name: ");
            name2 = scanner.nextLine();
        } catch (final Exception e) {
            System.out.println("Names must not be null or empty");
            return;
        }
        System.out.printf("%s and %s's love is at %s!", name1, name2, new Main(name1, name2).calculateLove());
    }

    public String calculateLove() {
        return new LoveCalculator(this.name1, this.name2).getLovePercent() + "%";
    }
}