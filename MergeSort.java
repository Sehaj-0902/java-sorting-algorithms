import java.util.Arrays;

public class MergeSort {
    // Method to perform merge sort
    public static void mergeSort(int[] bookPrices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(bookPrices, left, mid);
            mergeSort(bookPrices, mid + 1, right);
            merge(bookPrices, left, mid, right);
        }
    }

    // Method to divide the array into two halves, sort them and merge them into a single array
    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            }
            else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < n1) array[k++] = leftArray[i++];
        while (j < n2) array[k++] = rightArray[j++];
    }

    public static void main(String[] args) {
        int[] bookPrices = {149, 299, 549, 399, 449};
        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Book prices after performing merge sort");
        System.out.println(Arrays.toString(bookPrices));
    }
}

/*
Input:
    int[] bookPrices = {149, 299, 549, 399, 449};
Output:
    Book prices after performing merge sort
    [149, 299, 399, 449, 549]
 */