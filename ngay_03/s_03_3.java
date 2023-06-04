package ngay_03;

import java.util.Scanner;

public class s_03_3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập n: ");
            int n = scanner.nextInt();

            System.out.print("Nhập m: ");
            int m = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

         }




    }

