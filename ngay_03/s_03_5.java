package ngay_03;

import java.util.Scanner;

public class s_03_5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number;
            do {
                System.out.print("Nhập một số nguyên dương: ");
                number = scanner.nextInt();
            } while (number <= 0);
            scanner.close();

            System.out.println("Số ban đầu: " + number);

            // Sử dụng vòng lặp while
            int reversedNumber = 0;
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            System.out.println("Số sau khi đảo ngược (sử dụng while): " + reversedNumber);
        }
    }
