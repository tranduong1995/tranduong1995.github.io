import java.util.Scanner;

public class bài3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String s = scanner.nextLine();

        String s1 = s.substring(0 , 1 ).toUpperCase();
        String s2 = s.substring(1).toLowerCase();

        String s3 = s1 + s2 ;

        String result = s3.replaceAll(" ", "");
        System.out.println( "Chuỗi mới:" + result);



    }
}
