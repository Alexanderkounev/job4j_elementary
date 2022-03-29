package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int up) {
        int tmp = max(right, up);
        return max(left, tmp);
    }

    public static int max(int left, int right, int up, int down) {
        int tmp2 = max(up, down);
        int tmp3 = max(right, tmp2);
        return max(left, tmp3);
    }

    public static void main(String[] args) {
        int msg = Max.max(1, 2);
        System.out.println(msg);
    }
}
