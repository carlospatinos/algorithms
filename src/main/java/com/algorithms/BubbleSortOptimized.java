package com.algorithms;

/**
 * Created by developer on 10/4/17.
 */
public class BubbleSortOptimized implements SortAlgorithm {
    @Override
    public Integer[] sort(Integer[] array) {
        while(sort1(array));
        return array;
    }


    public boolean sort1(Integer [] array) {
        boolean flag  = false;
        int length = array.length - 1;

        for (int i = 0; i < length; i++) {
            if(array[i] > array[i+1]) {
                int tmp = array[i];
                array[i] = array[i+1];
                array[i+1] = tmp;
                flag = true;
            }
        }
        return flag;
    }
}
