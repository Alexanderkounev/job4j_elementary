package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int up) {
        return max(left, max(right, up));
    }

    public static int max(int left, int right, int up, int down) {
        return max(left, max(right, max(up, down)));
    }

    public static void main(String[] args) {
        int msg = Max.max(1, 2);
        System.out.println(msg);
    }
}
