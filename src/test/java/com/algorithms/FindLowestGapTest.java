package com.algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


/*
This is a demo task.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Assume that:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].

        Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

*/

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