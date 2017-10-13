package com.algorithms;

/**
 * Created by developer on 10/10/17.
 */
public class NoDublicatedCharactersChecker {
    public boolean check(String words){
        if (words == null || words.isEmpty()) {
            return true;
        }
        int checker = 0;
        for (int i = 0; i < words.length(); i++){
            int val = words.charAt(i) - 'a';
            if((checker & 1 << val) > 0) {
                return false;
            }
            checker |= 1 << val;
        }
        return true;
    }

}
