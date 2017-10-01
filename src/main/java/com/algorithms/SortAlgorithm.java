package com.algorithms;

import java.util.Random;

/**
 * Created by developer on 10/1/17.
 */
public interface SortAlgorithm {

    int[] sort(int[] array);

    default int[] generateValues(int numberOfElements, int min, int max){
        Random random = new Random();
        int[] array = new int[numberOfElements];
        for(int i=0; i< numberOfElements; i++) {
            array[i] = random.nextInt(max + 1 - min) + min;
        }

        return array;
    }

    default void print(int[] array){
        for (int current: array) {
            System.out.print(current + "," );
        }
    }
}
