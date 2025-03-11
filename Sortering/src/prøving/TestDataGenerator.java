package prøving;

import java.util.Random;

public class TestDataGenerator {
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); // Tall mellom 0 og 999
        }
        return array;
    }
}