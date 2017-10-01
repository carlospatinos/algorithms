package com.algorithms;

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
        int array[] = algortigm.generateValues(10, 0, 10);
        System.out.println("Before: " );
        algortigm.print(array);
        array = algortigm.sort(array);
        System.out.println("");
        System.out.println("After: " );
        algortigm.print(array);
    }

}