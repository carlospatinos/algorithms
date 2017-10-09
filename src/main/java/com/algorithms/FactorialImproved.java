package com.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by developer on 10/3/17.
 */
public class FactorialImproved implements Factorial {
    private static Map<Integer, Integer> previousData = new HashMap<>();

    public int execute(int source){
        if(source <2) {
            return 1;
        }
        Integer previousVlue = previousData.get(source);
        if(previousVlue == null) {
            previousVlue = source * execute(source - 1);
            previousData.put(source, previousVlue);
        }
        return previousVlue;
    }
}
