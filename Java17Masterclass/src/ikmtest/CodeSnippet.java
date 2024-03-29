package ikmtest;

import java.util.Arrays;

public class CodeSnippet {
    public static void main(String[] args) {
        Arrays.asList("red", "green", "blue")
                .stream()
                .filter(s -> !s.startsWith("b"))
                .filter(s -> s.length() != 4)
                .forEach(System.out::println);
    }
}
