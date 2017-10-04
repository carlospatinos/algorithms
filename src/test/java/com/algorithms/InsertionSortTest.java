package com.algorithms;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


/**
 * Created by developer on 10/1/17.
 */
@RunWith(value = Parameterized.class)
public class InsertionSortTest {
    private SortAlgorithm algorithm;

    private Integer[] inputList;
    private Integer[] expectedList;

    public InsertionSortTest(Integer[] input, Integer[] output) {
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

    @org.junit.Before
    public void setUp() throws Exception {
        algorithm = new InsertionSort();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        algorithm = null;
    }

    @org.junit.Test
    public void sort() throws Exception {
        Integer [] sortedArray = algorithm.sort(this.inputList);
        Assert.assertArrayEquals(sortedArray, expectedList);
    }

}