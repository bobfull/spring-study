package com.chap07.spring;

public class ImpeCalculator implements Calculator {
    @Override
    public long factorial(long num) {


        long result = 1;
        for(long i = 1 ; i <= num ; i++){
            result = result * i;
        }
        return result;
    }
}
