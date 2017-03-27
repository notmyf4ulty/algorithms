package search;

public class LinearSearch {
    public static Integer search(int key, int [] A) {
        Integer result = null;
        for (int i = 0 ; i < A.length ; i++) {
            if (A[i] == key) {
                result = i;
            }
        }
        return result;
    }
}
