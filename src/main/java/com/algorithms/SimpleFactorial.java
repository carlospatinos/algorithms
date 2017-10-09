package com.algorithms;

/**
 * Created by developer on 10/3/17.
 */
public class SimpleFactorial implements Factorial {
    @Override
    public int execute(int source){
        if(source <2) {
            return 1;
        }
        return source * execute(source - 1);
    }
}
