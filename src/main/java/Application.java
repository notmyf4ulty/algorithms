import org.apache.commons.math3.random.RandomDataGenerator;
import search.LinearSearch;
import sort.InsertionSort;

public class Application {
    public static void main(String [] args) {
        int amountOfNumbers = 20;
        int [] A = new int[amountOfNumbers];
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();

        for (int i = 0 ; i < amountOfNumbers ; i++) {
            A[i] = randomDataGenerator.nextInt(0,amountOfNumbers);
        }

        System.out.println("Before sortNonDecreasing:");

        for (int a : A) {
            System.out.print(a + " ");
        }

        InsertionSort.sortNonIncreasing(A);

        System.out.println("\nAfter sortNonDecreasing:");

        for (int a : A) {
            System.out.print(a + " ");
        }

        System.out.print("Search result of value ");

        int key = randomDataGenerator.nextInt(0,amountOfNumbers);

        System.out.println(key + ": " + LinearSearch.search(key,A));



    }
}
