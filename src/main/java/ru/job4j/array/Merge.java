package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int k = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                rsl[k++] = left[leftIndex++];
            } else {
                rsl[k++] = right[rightIndex++];
            }
        }
        while (leftIndex < left.length) {
            rsl[k++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            rsl[k++] = right[rightIndex++];
        }
        return rsl;
    }
}
