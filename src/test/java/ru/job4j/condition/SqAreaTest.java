package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7K3Square2dot29() {
        float expected = 2.29f;
        int p = 7;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP15K7Square6dot15() {
        float expected = 6.15f;
        int p = 15;
        double k = 7;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP34K13Square19dot16() {
        float expected = 19.16f;
        int p = 34;
        double k = 13;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}