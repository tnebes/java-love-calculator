package hr.tnebes;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoveCalculator {

    private final int lovePercent;

    public LoveCalculator(String name1, String name2) {
        if (!this.validateNames(name1, name2)) {
            throw new IllegalArgumentException("Names must not be null or empty");
        }
        name1 = name1.trim();
        name2 = name2.trim();
        this.lovePercent = this.calculateLovePercent(name1, name2);
    }

    private LoveCalculator() {
        throw new IllegalArgumentException();
    }

    private int calculateLovePercent(final String name1, final String name2) {
        final String letterArrayValues = this.calculateLetterArrayValues((name1 + name2).toLowerCase());
        return this.recursivelyCalculateLovePercent(letterArrayValues);
    }

    private String calculateLetterArrayValues(final String combinedNames) {
        return Stream.of(combinedNames.split(""))
                .map(letter -> (int) (Stream.of(combinedNames.split(""))
                        .filter(letter::equals)
                        .count()))
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }

    private int recursivelyCalculateLovePercent(final String letterArrayValues) {
        return 0;
    }

    public int getLovePercent() {
        return this.lovePercent;
    }

    private boolean validateNames(String name1, String name2) {
        return name1 != null && !name1.isEmpty() && name2 != null && !name2.isEmpty();
    }

}
