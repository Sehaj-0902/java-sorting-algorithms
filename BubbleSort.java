import java.util.Arrays;

public class BubbleSort {
    // Method to perform bubble sort
    public static void bubbleSort(int[] studentMarks) {
        boolean swapped;
        for (int i = 0; i < studentMarks.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < studentMarks.length - i - 1; j++) {
                if (studentMarks[j] > studentMarks[j + 1]) {
                    int temp = studentMarks[j];
                    studentMarks[j] = studentMarks[j + 1];
                    studentMarks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        int[] studentMarks = {75, 43, 56, 89, 92};
        bubbleSort(studentMarks);
        System.out.println("Marks after performing bubble sort:");
        System.out.println(Arrays.toString(studentMarks));
    }
}

/*
Input:
    int[] studentMarks = {75, 43, 56, 89, 92};
Output:
    Marks after performing bubble sort:
    [43, 56, 75, 89, 92]
 */