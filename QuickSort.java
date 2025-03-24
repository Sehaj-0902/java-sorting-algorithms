import java.util.Arrays;

public class QuickSort {
    // Method to perform quick sort
    public static void quickSort(int[] productPrices, int low, int high) {
        if (low < high) {
            int pi = partition(productPrices, low, high);
            quickSort(productPrices, low, pi - 1);
            quickSort(productPrices, pi + 1, high);
        }
    }

    // Method to set a pivot, partition the array and sort the elements
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] productPrices = {599, 299, 149, 159, 799};
        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Product prices after performing quick sort");
        System.out.println(Arrays.toString(productPrices));
    }
}

/*
Input:
    int[] productPrices = {599, 299, 149, 159, 799};
Output:
    Product prices after performing quick sort
    [149, 159, 299, 599, 799]
 */