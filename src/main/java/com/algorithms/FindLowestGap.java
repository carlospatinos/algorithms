package com.algorithms;

import java.util.Arrays;

public class FindLowestGap {
    public Integer solution(Integer[] A) {
        // write your code in Java SE 8
        if(A.length == 1){
            if(A[0] < 1){
                return 1;
            } else {
                return A[0]+1;
            }
        }
        Arrays.sort(A);
        int lastValue = 0;
        for(int i=1; i<A.length; i++){
            int currentPos = A[i];
            int prevPos = A[i-1];
            int difference = currentPos - prevPos;
            if(difference > 1) {
                lastValue = prevPos;
            } else {
                lastValue = currentPos;
            }
        }

        if (lastValue > 0) {
            return lastValue + 1;
        } else {
            return 1;
        }

    }
}
