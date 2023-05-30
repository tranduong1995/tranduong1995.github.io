package btvn;

public class bai3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        if (d > max) {
            max = d;
        }

        System.out.println("Số lớn nhất là: " + max);
    }
}
