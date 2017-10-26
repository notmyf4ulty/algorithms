package sort;

import org.junit.Before;
import org.junit.Test;
import util.DataPreparer;
import util.DataPrinter;

public class InsertionSortTest {

    int [] intData;

    @Before
    public void prepareData() {
        DataPreparer dataPreparer = new DataPreparer();
        intData = dataPreparer.getRandomIntThousandRangeArray(10);
    }

    @Test
    public void test() {
        System.out.println("Before sort:");
        DataPrinter dataPrinter = new DataPrinter();
        dataPrinter.printIntArray(intData);
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sortIncreasing(intData);
        System.out.println("After sort:");
        dataPrinter.printIntArray(intData);
    }
}
