package com.algorithms;

import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;


/**
 * Created by developer on 10/1/17.
 */
@RunWith(value= Parameterized.class)
public class MergeSortTest {
    private SortAlgorithm algortigm;

    private Integer[] inputList;
    private Integer[] expectedList;

    public MergeSortTest(Integer[] input, Integer[] output) {
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
        algortigm = new MergeSort();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        algortigm = null;
    }

    @org.junit.Test
    public void sort() throws Exception {
        Integer [] sortedArray = algortigm.sort(this.inputList);
        //algortigm.print(sortedArray);
        //System.out.println();
        //algortigm.print(expectedList);

        Assert.assertArrayEquals(sortedArray, expectedList);
    }

    @org.junit.Test
    public void sortRandom() throws Exception {
        Integer array[] = algortigm.generateValues(3, 0, 10);
        //algortigm.print(array);
        array = algortigm.sort(array);
        //algortigm.print(array);
        assertTrue(Ordering.natural().isOrdered(Arrays.asList(array)));
    }

}