package com.algorithms;

/**
 * Created by developer on 10/3/17.
 */
public class MergeSort implements SortAlgorithm {

    private Integer[] array;
    private Integer[] tempMergArr;
    private int length;

    @Override
    public void sort(Integer[] array) {
        this.array = array;
        this.length = array.length;
        this.tempMergArr = new Integer[length];
        this.mergeSort(0, length - 1);
    }


    @Override
    public String getBigOTimeComplexity() {
        return "O(n log n)";
    }

    public void mergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            mergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            mergeSort(middle + 1, higherIndex);
            // Now merge both sides
            merge(lowerIndex, middle, higherIndex);
        }
    }

    private void merge(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
    }
}
