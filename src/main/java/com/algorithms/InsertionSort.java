package com.algorithms;

/**
 * Created by developer on 10/1/17.
 */
public class InsertionSort implements SortAlgorithm{
    @Override
    public String getBigOTimeComplexity() {
        return "O(n2)";
    }
    // 3, 4, 1
    @Override
    public void sort(Integer[] array) {
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
    }

}
