package com.algorithms;

/**
 * Created by developer on 10/3/17.
 */
public class Factorial {
    public static int execute(int source){
        if(source <2) {
            return 1;
        }
        return source * Factorial.execute(source - 1);
    }
}
