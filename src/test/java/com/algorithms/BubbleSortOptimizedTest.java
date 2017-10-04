package com.algorithms;

import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by developer on 10/4/17.
 */
@RunWith(value = Parameterized.class)
public class BubbleSortOptimizedTest {

    private SortAlgorithm algorithm;

    private Integer[] inputList;
    private Integer[] expectedList;

    public BubbleSortOptimizedTest(Integer[] input, Integer[] output) {
        this.inputList = input;
        this.expectedList = output;
    }

    @Parameterized.Parameters(name = "Test {index}: testSort({0}) = {1}")
    public static Collection testCases() {
        return Arrays.asList(new Integer[][][] {
                {{1,3,6,2, 2, 3}, {1, 2, 2, 3, 3, 6}}
        });
    }

    @org.junit.Before
    public void setUp() throws Exception {
        algorithm = new BubbleSortOptimized();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        algorithm = null;
    }

    @org.junit.Test
    @Ignore
    public void sort() throws Exception {
        Integer [] sortedArray = algorithm.sort(this.inputList);
        algorithm.print(sortedArray);
        System.out.println();
        algorithm.print(expectedList);

        Assert.assertArrayEquals(sortedArray, expectedList);
    }

    @org.junit.Test
    public void sortRandom() throws Exception {
        Integer array[] = algorithm.generateValues(3000, -1000, 1000);
        Instant start = Instant.now();
        array = algorithm.sort(array);
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis());
        assertTrue(Ordering.natural().isOrdered(Arrays.asList(array)));
    }


}