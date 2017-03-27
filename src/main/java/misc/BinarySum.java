package misc;

public class BinarySum {
    public boolean [] sum (boolean [] A, boolean [] B) {
        if (A.length != B.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        boolean [] C = new boolean[A.length + 1];
        boolean [] extraSum = new boolean[A.length + 1];

        for (int i = 0 ; i < A.length ; i++) {
            if (A[i]) {
                if (B[i]) {
                    C[i] = false;
                    
                }
            }
        }
    }
}
