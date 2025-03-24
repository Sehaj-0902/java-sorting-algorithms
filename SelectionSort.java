import java.util.Arrays;

public class SelectionSort {
    // Method to perform selection sort
    public static void selectionSort(int[] examScores) {
        for (int i = 0; i < examScores.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < examScores.length; j++) {
                if (examScores[j] < examScores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = examScores[i];
            examScores[i] = examScores[minIndex];
            examScores[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {78, 65, 43, 27, 88, 12};
        selectionSort(examScores);

        System.out.println("Exam scores after performing selection sort:");
        System.out.println(Arrays.toString(examScores));
    }
}

/*
Input:
    int[] examScores = {78, 65, 43, 27, 88, 12};
Output:
    Exam scores after performing selection sort:
    [12, 27, 43, 65, 78, 88]
 */