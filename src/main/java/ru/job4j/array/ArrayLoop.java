package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] name = new int[5];
        for (int index = 0; index < name.length; index++) {
            name[index] = index * 2 + 3;
            }
        for (int index : name) {
            System.out.println(index);
        }
    }
}
