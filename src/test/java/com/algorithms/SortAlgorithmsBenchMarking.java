package com.algorithms;

import com.algorithms.com.algorithms.util.SortAlgorithmsUtil;
import com.google.common.collect.Ordering;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by developer on 10/4/17.
 */
public class SortAlgorithmsBenchMarking {
    private static final int SIZE_OF_ARRAY = 3000;
    private Map<String, SortAlgorithm> algortigms;


    @org.junit.Before
    public void setUp() throws Exception {
        algortigms = new HashMap<>();
        algortigms.put("InsertionSort", new InsertionSort());
        algortigms.put("MergeSort", new MergeSort());
        algortigms.put("BubbleSortOptimized", new BubbleSortOptimized());
    }

    @org.junit.After
    public void tearDown() throws Exception {
        if(algortigms != null) {
            algortigms.clear();
        }
    }

    @org.junit.Test
    public void sortRandom() throws Exception {
        Integer unsortedArray[] = SortAlgorithmsUtil.generateValues(SIZE_OF_ARRAY, -3000, 3000);
        int sizeOfTheUnsortedArray = unsortedArray.length;
        Iterator it = algortigms.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            SortAlgorithm algorithm = (SortAlgorithm) pair.getValue();

            Instant start = Instant.now();
            Integer sortedArray[] = algorithm.sort(unsortedArray);
            Instant finish = Instant.now();

            assertTrue(Ordering.natural().isOrdered(Arrays.asList(sortedArray)));

            long duration = Duration.between(start, finish).toMillis();

            System.out.format("%s took %d milliseconds to sort %d elements. \n", pair.getKey(), duration, sizeOfTheUnsortedArray);
            it.remove();
        }



    }
}
