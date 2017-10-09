package com.algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by developer on 10/9/17.
 */
@RunWith(value = Parameterized.class)
public class LongWordFinderTest {

    private String input;
    private String output;
    private LongWordFinder finder;

    public LongWordFinderTest(String input, String output){
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters(name = "{index}: testExecute({0}) => longest word is {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"hola amigos como estan", "amigos"},
                {"hello friends how are you", "friends"},
                {"Hallo Freunde, wie geht's euch?", "Freunde"}
        });
    }

    @Before
    public void setup() {
        finder = new LongWordFinder();
    }

    @Test
    public void find() throws Exception {
        Assert.assertThat(finder.find(this.input), is(this.output));
    }

}