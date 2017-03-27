import org.apache.commons.math3.random.AbstractRandomGenerator;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import sort.InsertionSort;

public class Application {
    public static void main(String [] args) {
        int amountOfNumbers = 20;
        int [] A = new int[amountOfNumbers];
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();

        for (int i = 0 ; i < amountOfNumbers ; i++) {
            A[i] = randomDataGenerator.nextInt(0,amountOfNumbers);
        }

        System.out.println("Before sort:");

        for (int a : A) {
            System.out.print(a + " ");
        }

        InsertionSort.sort(A);

        System.out.println("\nAfter sort:");

        for (int a : A) {
            System.out.print(a + " ");
        }
    }
}
