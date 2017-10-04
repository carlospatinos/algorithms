package com.algorithms.com.algorithms.util;

import java.util.Random;

/**
 * Created by developer on 10/4/17.
 */
public class SortAlgorithmsUtil {
    public static Integer[] generateValues(int numberOfElements, int min, int max){
        Random random = new Random();
        Integer[] array = new Integer[numberOfElements];
        for(int i=0; i< numberOfElements; i++) {
            array[i] = random.nextInt(max + 1 - min) + min;
        }

        return array;
    }


    public static void print(int[] array){
        for (int current: array) {
            System.out.print(current + "," );
        }
        System.out.println();
    }

    public static void print(Integer[] array){
        for (int current: array) {
            System.out.print(current + "," );
        }
        System.out.println();
    }
}
