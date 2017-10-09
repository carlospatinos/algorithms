package com.algorithms;

/**
 * Created by developer on 10/4/17.
 */
public class BubbleSortOptimized implements SortAlgorithm {
    @Override
    public String getBigOTimeComplexity() {
        return "O(n2)";
    }

    @Override
    public void sort(Integer[] array) {
        int length = array.length;
        for(int i=0; i< length -1; i++) {
            for(int j=0; j< length - i - 1; j++){
                int tmp = 0;
                if(array[j] > array[j+1]){
                    tmp = array[j+1];
                    array[j+1]=array[j];
                    array[j]=tmp;
                }
            }
        }
    }



}
