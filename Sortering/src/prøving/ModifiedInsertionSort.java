package prøving;

public class ModifiedInsertionSort {
    public static void insertionSort(int[] a) {
        // Flytt minste element til starten
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        // Bytt minste element med første element
        int temp = a[0];
        a[0] = a[minIndex];
        a[minIndex] = temp;

        // Utfør sortering uten å sjekke j >= 0
        for (int i = 2; i < a.length; i++) {
            temp = a[i];
            int j = i - 1;
            while (a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }
}
