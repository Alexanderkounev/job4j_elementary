package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To3Then10() {
        int left = 10;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To12Then12() {
        int left = 4;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To3To2Then3() {
        int maxmax = Max.max(2, 4, 3);
        int expected = 4;
        Assert.assertEquals(expected, maxmax);
    }

    @Test
    public void whenMax11To33To22To34Then34() {
        int maxmax = Max.max(11, 33, 22, 34);
        int expected = 34;
        Assert.assertEquals(expected, maxmax);
    }
}