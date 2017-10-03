package com.algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by developer on 10/3/17.
 */
@RunWith(value= Parameterized.class)
public class FactorialTest {
    private int input;
    private int output;

    public FactorialTest(int input, int output){
        this.input = input;
        this.output = output;
    }

    @Parameters(name = "{index}: testExecute({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24}
        });
    }

    @Test
    public void execute() throws Exception {
        Assert.assertThat(Factorial.execute(this.input), is(this.output));
    }

}