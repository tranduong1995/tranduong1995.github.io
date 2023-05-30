package btvn;

import java.text.DecimalFormat;

public class bai5 {
    public static void main(String[] args) {
        int a = 20;
        int b = 7;

        double thuong = (double) a / b;

        DecimalFormat df = new DecimalFormat ("#.###");
        String formattedthuong = df.format(thuong);

        System.out.println("Thương của " + a + " và " + b + " là: " + formattedthuong);
    }
}
