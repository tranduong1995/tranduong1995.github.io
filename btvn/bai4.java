package btvn;

import java.text.DecimalFormat;

public class bai4 {


    public static void main(String[] args) {
        double a = 5;

        double result = Math.sqrt(a);

        DecimalFormat df = new DecimalFormat("#.###");
        String formattedResult = df.format(result);

        System.out.println("Căn bậc hai của " + a + " là: " + formattedResult);
    }
}
