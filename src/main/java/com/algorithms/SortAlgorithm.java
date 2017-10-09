package com.algorithms;

import java.util.Random;

/**
 * Created by developer on 10/1/17.
 */
public interface SortAlgorithm {

    void sort(Integer[] array);

    default String getName() {
        String name = null;
        Class<?> enclosingClass = getClass().getEnclosingClass();
        if (enclosingClass != null) {
            name = enclosingClass.getSimpleName();
        } else {
            name = getClass().getSimpleName();
        }
        return name;
    }

    String getBigOTimeComplexity();
}
