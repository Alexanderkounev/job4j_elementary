package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5element() {
        int[] data = new int[] {50, 30, 40, 10, 20};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 20, 30, 40, 50};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {-3, -4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-4, -3, 1};
        Assert.assertArrayEquals(expected, result);
    }
}