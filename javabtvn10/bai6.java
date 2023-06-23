import java.util.Arrays;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        System.out.println("Nhập câu không quá 20 từ :");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();

        String[] s2 = s1.split(" ");
        Arrays.sort(s2);
        System.out.println("Các từ theo thứ tự amphab là :");
        for (String s :  s2) {
            System.out.println(s);
        }
    }
}
