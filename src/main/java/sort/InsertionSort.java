package sort;

public class InsertionSort {
    public static int [] sortNonDecreasing(int [] A) {
        for (int j = 0 ; j < A.length ; j++) {
            int key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
        }
        return A;
    }

    public static int [] sortNonIncreasing(int [] A) {
        for (int j = 0 ; j < A.length ; j++) {
            int key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] <= key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
        }
        return A;
    }
}
