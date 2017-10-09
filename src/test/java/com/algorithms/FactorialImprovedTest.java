package com.algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by developer on 10/3/17.
 */
@RunWith(value= Parameterized.class)
public class FactorialImprovedTest {
    private int input;
    private int output;
    private Factorial factorial;

    public FactorialImprovedTest(int input, int output){
        this.input = input;
        this.output = output;
    }

    @Parameters(name = "{index}: testExecute({0}!) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {9, 362880}
        });
    }

    @Before
    public void init(){
        factorial = new FactorialImproved();
    }

    @Test
    public void execute() throws Exception {
        Assert.assertThat(factorial.execute(this.input), is(this.output));
    }

}