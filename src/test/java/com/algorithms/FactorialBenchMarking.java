package com.algorithms;

import com.algorithms.util.SortAlgorithmsUtil;
import com.google.common.collect.Ordering;
import org.junit.Ignore;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by developer on 10/4/17.
 */
public class FactorialBenchMarking {
    private static final int NUMBERS_TO_GENERATE = 10000;
    private List<Factorial> factorials;


    @org.junit.Before
    public void setUp() throws Exception {
        factorials = new ArrayList<>();
        factorials.add(new SimpleFactorial());
        factorials.add(new FactorialImproved());
    }

    @org.junit.After
    public void tearDown() throws Exception {
        if(factorials != null) {
            factorials.clear();
        }
    }

    @org.junit.Test
    @Ignore
    public void execute() throws Exception {
        for(Factorial concreteImplementation: factorials) {
            Instant start = Instant.now();
            for(int i=0; i<NUMBERS_TO_GENERATE; i++){
                concreteImplementation.execute(i);
            }
            Instant finish = Instant.now();
            long duration = Duration.between(start, finish).toMillis();

            System.out.format("%20s took %5d milliseconds to execute.\n", concreteImplementation.getClass().getSimpleName(), duration);
        }

    }
}
