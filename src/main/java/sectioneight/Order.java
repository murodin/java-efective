package sectioneight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Order {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Dünya", "Merhaba", "A");
        String reversedWord = words.stream()
                .sorted(comparing(String::length).reversed())
                .collect(Collectors.joining(" "));

        words.sort(comparing(String::length));

        System.out.println(reversedWord);
        System.out.println(words);
    }
}
