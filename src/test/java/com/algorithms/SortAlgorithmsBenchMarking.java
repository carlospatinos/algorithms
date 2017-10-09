package com.algorithms;

import com.algorithms.util.SortAlgorithmsUtil;
import com.google.common.collect.Ordering;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by developer on 10/4/17.
 */
public class SortAlgorithmsBenchMarking {
    private static final int SIZE_OF_ARRAY = 6000;
    private List<SortAlgorithm> algortigms;


    @org.junit.Before
    public void setUp() throws Exception {
        algortigms = new ArrayList<>();
        algortigms.add(new BubbleSort());
        algortigms.add(new BubbleSortOptimized());
        algortigms.add(new InsertionSort());
        algortigms.add(new MergeSort());
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

        for(SortAlgorithm concreteImplementation: algortigms) {
            Integer [] unsortedCopy = Arrays.copyOf(unsortedArray, unsortedArray.length);

            Instant start = Instant.now();
            Integer sortedArray[] = unsortedCopy.clone();
            concreteImplementation.sort(sortedArray);
            Instant finish = Instant.now();

            assertTrue(Ordering.natural().isOrdered(Arrays.asList(sortedArray)));

            long duration = Duration.between(start, finish).toMillis();

            System.out.format("%20s took %5d milliseconds to sort %6d elements. Complexity is %s.\n", concreteImplementation.getName(), duration, sizeOfTheUnsortedArray, concreteImplementation.getBigOTimeComplexity());
        }




    }
}
