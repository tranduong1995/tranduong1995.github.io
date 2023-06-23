public class bai1 {
    public static void main(String[] args){

        System.out.println("Các số thuận nghịch có 6 chữ số:");
        for (int i = 100000; i <= 999999; i++) {
            if (sTN(i)) {
                System.out.println(i);
            }
        }
    }


    public static boolean sTN(int num) {
        String str = String.valueOf(num);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
}

