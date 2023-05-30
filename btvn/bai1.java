package btvn;

public class bai1 {
    public static void main(String[] args) {

        System.out.print("Nhập chiều dài: ");
        double chieudai = 4 ;

        System.out.print("Nhập chiều rộng: ");
        double chieurong = 7 ;

        // Tính chu vi và diện tích của hình chữ nhật
        double chuvi = 2 * (chieudai + chieurong);
        double dientich = chieudai * chieurong;


        System.out.println("Chu vi của hình chữ nhật là: " + chuvi);
        System.out.println("Diện tích của hình chữ nhật là: " + dientich);
    }

}
