package com.algorithms;

import java.util.Random;

/**
 * Created by developer on 10/1/17.
 */
public interface SortAlgorithm {

    Integer[] sort(Integer[] array);

    default Integer[] generateValues(int numberOfElements, int min, int max){
        Random random = new Random();
        Integer[] array = new Integer[numberOfElements];
        for(int i=0; i< numberOfElements; i++) {
            array[i] = random.nextInt(max + 1 - min) + min;
        }

        return array;
    }

    default void print(int[] array){
        for (int current: array) {
            System.out.print(current + "," );
        }
        System.out.println();
    }

    default void print(Integer[] array){
        for (int current: array) {
            System.out.print(current + "," );
        }
        System.out.println();
    }
}
