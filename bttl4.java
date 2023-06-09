package ngay_05;

public class bttl4 {
    public static void main(String[] args) {
        for ( int i = 1 ; i <= 6 ; i++ ) {

            for (int k = 6 ; k >= i ; k-- ) {

                System.out.print(" ");
            }


            for (int j = 1 ; j <= i ; j++ ) {
                   System.out.print("@");
            }


            System.out.println();
        }


        }

    }

