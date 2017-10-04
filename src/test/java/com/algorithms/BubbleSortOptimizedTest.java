package com.algorithms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

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
                {{1,3,6,2, 2, 3, 9, 10}, {1, 2, 2, 3, 3, 6, 9, 10}},
                {{1,3}, {1, 3}},
                {{1}, {1}}
        });
    }

    @Before
    public void setUp() throws Exception {
        algorithm = new BubbleSortOptimized();
    }

    @After
    public void tearDown() throws Exception {
        algorithm = null;
    }

    @Test
    public void sort() throws Exception {
        Integer [] sortedArray = algorithm.sort(this.inputList);
        Assert.assertArrayEquals(sortedArray, expectedList);
    }

}