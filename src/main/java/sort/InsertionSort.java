package sort;

public class InsertionSort implements IntSorter {
    @Override
    public int[] sortIncreasing(int[] A) {
        if (A.length > 1) {
            for (int j = 1 ; j < A.length ; j++) {
                int key = A[j];
                int i = j - 1;
                while (i >= 0 && A[i] > key) {
                    A[i + 1] = A[i];
                    i = i - 1;
                }
                A[i + 1] = key;
            }
        }
        return A;
    }
}
