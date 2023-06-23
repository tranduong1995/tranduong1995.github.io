import java.util.Scanner;

public class bai2  {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập chuỗi ký tự :");
        String s =scanner.nextLine();
        String s1 = " " ;

        for(int  i=0; i < s.length(); i++) {
            if(i % 2 == 0){
                s1 += Character.toUpperCase(s.charAt(i));

            }else {
                s1 += Character.toLowerCase(s.charAt(i));
            }

        }
        System.out.println(" chuỗi mới sẽ là: " + s1);
    }
}
