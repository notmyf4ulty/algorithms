package util;

import org.apache.commons.math3.random.RandomGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class DataPreparer {
    public int [] getRandomIntThousandRangeArray(int size) {
        int [] resultArray = new int [size];
        for (int i = 0 ; i < size ; i++) {
            int nextInt = ThreadLocalRandom.current().nextInt(0, 1001);
            resultArray[i] = nextInt;
        }
        return resultArray;
    }
}
