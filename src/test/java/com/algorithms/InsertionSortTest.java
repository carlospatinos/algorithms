package com.algorithms;

import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

import java.util.Arrays;

import static org.junit.Assert.*;


/**
 * Created by developer on 10/1/17.
 */
public class InsertionSortTest {
    private SortAlgorithm algortigm;

    @org.junit.Before
    public void setUp() throws Exception {
        algortigm = new InsertionSort();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        algortigm = null;
    }

    @org.junit.Test
    public void sort() throws Exception {
        Integer array[] = algortigm.generateValues(10, 0, 10);
        array = algortigm.sort(array);
        assertTrue(Ordering.natural().isOrdered(Arrays.asList(array)));

        array = algortigm.generateValues(100, -10, 10);
        array = algortigm.sort(array);
        assertTrue(Ordering.natural().isOrdered(Arrays.asList(array)));
    }

}