package com.algorithms;

import java.util.Arrays;

/**
 * Created by developer on 10/4/17.
 */
public class BubbleSort implements SortAlgorithm {
    @Override
    public String getBigOTimeComplexity() {
        return "O(n2)";
    }

    @Override
    public void sort(Integer[] array) {
        int length = array.length;
        for(int i=0; i< length -1; i++) {
            for(int j=0; j< length - 1; j++){
                int tmp = 0;
                if(array[j] > array[j+1]){
                    tmp = array[j+1];
                    array[j+1]=array[j];
                    array[j]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        Integer[] array = new Integer[]{10,2,3,4,1,6,7};
        b.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
