package prøving;

public class InsertionSortTest {
	
    public static void main(String[] args) {
    	
        int n = 100_000; // Antall elementer
        int[] array1 = TestDataGenerator.generateRandomArray(n);
        int[] array2 = array1.clone();

        // Mål tid for original insertion sort
        long start = System.nanoTime();
        OriginalInsertionSort.insertionSort(array1);
        long end = System.nanoTime();
        System.out.println("Original Insertion Sort tok " + (end - start) / 1_000_000.0 + " ms");

        // Mål tid for modifisert insertion sort
        start = System.nanoTime();
        ModifiedInsertionSort.insertionSort(array2);
        end = System.nanoTime();
        System.out.println("Modified Insertion Sort tok " + (end - start) / 1_000_000.0 + " ms");
    }
}
