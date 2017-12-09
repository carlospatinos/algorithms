package com.algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value= Parameterized.class)
public class FindLowestGapTest {

    private FindLowestGap algorithm;

    private Integer[] inputList;
    private Integer[] expectedList;

    public FindLowestGapTest(Integer[] input, Integer[] output) {
        this.inputList = input;
        this.expectedList = output;
    }

    //name = "Test {index}: Gap({0}) = {1}"
    @Parameterized.Parameters()
    public static Collection testCases() {
        return Arrays.asList(new Integer[][][] {
                {{1}, {2}},
                {{-1}, {1}},
                {{1,2}, {3}},
                {{1, 3, 6, 4, 1, 2}, {5}},
                {{1,2, 3}, {4}},
                {{-1, -3}, {1}}
        });
    }

    @org.junit.Before
    public void setUp() throws Exception {
        algorithm = new FindLowestGap();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        algorithm = null;
    }

    @org.junit.Test
    public void sort() throws Exception {
        Assert.assertEquals(expectedList[0], algorithm.solution(inputList));
    }
}