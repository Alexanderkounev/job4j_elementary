package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when34to56then2dot82() {
        Point a = new Point(3, 4);
        Point b = new Point(5, 6);
        double dist = a.distance(b);
        double expected = 2.82;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when111333to222666then351dot01() {
        Point a = new Point(111, 333);
        Point b = new Point(222, 666);
        double dist = a.distance(b);
        double expected = 351.01;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when111333211to222666333then351dot01() {
        Point a = new Point(111, 333, 211);
        Point b = new Point(222, 666, 333);
        double dist = a.distance3d(b);
        double expected = 371.61;
        Assert.assertEquals(expected, dist, 0.01);
    }
}