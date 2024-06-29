package ikmtest;

import java.util.Arrays;

public class Codingame {

    public static void main(String[] args) {
        // Returns the distance between the two closest numbers.
        int[] numbers = {3, 9, 50, 15, 99, 7, 98, 65};
        System.out.println(Arrays.toString(numbers));
        numbers = Arrays.stream(numbers).sorted().toArray();
        int min = numbers[1] - numbers[0];
        System.out.println(Arrays.toString(numbers));
        System.out.println(min);

        for (int i = 0; i < numbers.length - 1; i++) {
            if ((numbers[i+1] - numbers[i]) < min) {
                min = numbers[i+1] - numbers[i];
            }
        }
        System.out.println("La distancia mas corta es: " + min);
    }
}
