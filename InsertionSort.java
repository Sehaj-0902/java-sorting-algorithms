import java.util.Arrays;

public class InsertionSort {
    // Method to perform insertion sort
    public static void insertionSort(int[] employeeIDs) {
        for (int i = 1; i < employeeIDs.length; i++) {
            int key = employeeIDs[i];
            int j = i - 1;
            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j--;
            }
            employeeIDs[j +  1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {101, 104, 102, 105, 107, 106, 103};
        insertionSort(employeeIDs);

        System.out.println("Employee IDs after performing insertion sort:");
        System.out.println(Arrays.toString(employeeIDs));
    }
}

/*
Input:
    int[] employeeIDs = {101, 104, 102, 105, 107, 106, 103};
Output:
    Employee IDs after performing insertion sort:
    [101, 102, 103, 104, 105, 106, 107]
 */