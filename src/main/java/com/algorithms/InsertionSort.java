package com.algorithms;

/**
 * Created by developer on 10/1/17.
 */
public class InsertionSort implements SortAlgorithm{

    // 3, 4, 1
    @Override
    public int[] sort(int[] array) {
        int valueToMove = 0;
        for(int posToMove = 1; posToMove < array.length; posToMove++) {
            valueToMove = array[posToMove];
            int i=posToMove-1;
            while(i >= 0 && array[i] > valueToMove) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = valueToMove;
        }

        return array;
    }

}