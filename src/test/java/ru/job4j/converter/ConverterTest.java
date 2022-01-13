package ru.job4j.converter;

import org.junit.Test;

import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblTo2Euro() {
        float in = 140;
        float expected = 2;
        float out =  Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConverter120RblTo2Dollar() {
        float in = 120;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}