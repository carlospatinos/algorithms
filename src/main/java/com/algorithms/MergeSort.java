package com.algorithms;

/**
 * Created by developer on 10/3/17.
 */
public class MergeSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        return mergeSort(array, 0, array.length);
    }

    public int[] mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = (low + high) /2 ;
            mergeSort(array, low, middle);
            mergeSort(array, middle+1, high);
            return merge(array, low, middle, high);
        }
        return null;
    }

    private int[] merge(int[] array, int low, int middle, int high) {
        int[] helper = new int[array.length];
        System.arraycopy(array, 0, helper, 0, array.length);

        int helperLeft = low;
        int helperRight = middle+1;
        int current = low;

        while(helperLeft <= middle && helperRight <= high){
            if(helper[helperLeft] <= helper[helperRight]){
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for(int i = 0; i<= remaining; i++){
            array[current+i] = helper[helperLeft+i];
        }
        return array;
    }
}
