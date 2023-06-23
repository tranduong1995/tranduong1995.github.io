import java.util.Scanner;

public class bai4 {
    public static void main(String[] args){
        System.out.println("Nhập xâu ký tự :");
        Scanner scanner =new Scanner(System.in);
        String str = scanner.nextLine();

        String[] str1 = str.split(" ");
        String longgestStr1 = "" ;
        int longestWordIndex = 0 ;


        for (int i=0; i < str1.length ; i++) {
            if(str1[i].length() > longgestStr1.length()) {
                longgestStr1 = str1[i];
                longestWordIndex = i ;
            }
        }
        System.out.println("Từ dài nhất trong xâu là: " + longgestStr1);
        System.out.println("Từ đó xuất hiện ở vị trí: " + longestWordIndex );
    }

}
