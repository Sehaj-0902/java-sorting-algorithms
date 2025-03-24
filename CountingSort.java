import java.util.Arrays;

public class CountingSort {
    // Method to perform counting sort
    public static void countingSort(int[] studentAges) {
        int n = studentAges.length;
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        int[] result = new int[n];

        for (int age : studentAges) {
            count[age - minAge]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            result[count[studentAges[i] - minAge] - 1] = studentAges[i];
            count[studentAges[i] - minAge]--;
        }

        System.arraycopy(result, 0, studentAges, 0, n);
    }

    public static void main(String[] args) {
        int[] studentAges = {16, 11, 17, 12, 14, 10, 18};
        countingSort(studentAges);

        System.out.println("Student ages after performing counting sort:");
        System.out.println(Arrays.toString(studentAges));
    }
}

/*
Input:
    int[] studentAges = {19, 21, 17, 22, 24, 20, 18};
Output:
    Student ages after performing counting sort:
    [10, 11, 12, 14, 16, 17, 18]
*/