import java.util.Arrays;

public class HeapSort {
    // Method to perform heap sort
    public static void heapSort(int[] salaryDemands) {
        int n = salaryDemands.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaryDemands, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = salaryDemands[0];
            salaryDemands[0] = salaryDemands[i];
            salaryDemands[i] = temp;

            heapify(salaryDemands, i, 0);
        }
    }

    // Method to extract largest element (root) and place it at the end
    public static void heapify(int[] salaryDemands, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && salaryDemands[left] > salaryDemands[largest]) {
            largest = left;
        }

        if (right < n && salaryDemands[right] > salaryDemands[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = salaryDemands[i];
            salaryDemands[i] = salaryDemands[largest];
            salaryDemands[largest] = swap;

            heapify(salaryDemands, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaryDemands = {15000, 30000, 21000, 45000, 10000};
        heapSort(salaryDemands);

        System.out.println("Salary demands after performing heap sort:");
        System.out.println(Arrays.toString(salaryDemands));
    }
}

/*
Input:
    int[] salaryDemands = {15000, 30000, 21000, 45000, 10000};
Output:
    Salary demands after performing heap sort:
    [10000, 15000, 21000, 30000, 45000]
 */