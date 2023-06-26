package Main;

import Entity.MatHang;
import Entity.NhanVien;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class  Main {
    private static MatHang[] matHangs = new MatHang[100];
    private static NhanVien[] nhanViens = new NhanVien[100];


    public static void main(String[] args) {
        while (true) {
            showMenuContent();


            int choice;
            do {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 || choice <= 9) {
                    break;
                }
                System.out.println("Nhập sai, mời chọn lại:");
            } while (true);


            switch (choice) {
                case 1:
                    inputNhomHang();

                    break;
                case 2:
                    showMatHang();

                    break;
                case 3:
                    inputNhanVien();


                    break;

                case 4:
                    showNhanVien();
                    break;

                case 5:


                    break;
                case 6:

                    break;

                case 7:

                    break;

                case 8:
                    break;
                case 9:

                    return;


            }


        }



    }


    private static void showMenuContent () {

        System.out.println("=============PHẦN MỀM KÊ KHAI DOANH THU NHÂN VIÊN ==============");
        System.out.println("1. Thêm mới mặt hàng mới.");
        System.out.println("2. In danh sách mặt hàng.");
        System.out.println("3. Thêm mới nhân viên.");
        System.out.println("4. In danh sách nhân viên .");
        System.out.println("5. Bảng kê khai nhân viên .");
        System.out.println("6. In bảng kê khai nhân viên ");
        System.out.println("7. Sắp xếp danh sách   .");
        System.out.println("8. Bảng doanh thu nhân viên.");
        System.out.println("9. Thoát.");
        System.out.println(" Mời chọn");



    }


    private static void inputNhomHang () {

        System.out.println("Bạn muốn thêm mới bao nhiêu mặt hàng :");
        int soMatHang = new Scanner(System.in).nextInt();
        for (int i = 0; i <soMatHang; i++) {
            System.out.println("Nhập thông tin mặt thứ : " + (i + 1));


            MatHang matHang = new MatHang();
            System.out.println("Nhập tên mặt hàng:");
            matHang.setTenHang(new Scanner(System.in).nextLine());

            System.out.println("Nhập thông tin nhóm hàng");
            matHang.inputInfo();



            System.out.println("Nhập giá :");
            matHang.setGiaBan(new Scanner(System.in).nextInt());

            System.out.println("Nhập số lượng");
            matHang.setSoLuong(new Scanner(System.in).nextInt());



            for (int j = 0; j < matHangs.length; j++) {
                if (matHangs[j] == null) {
                    matHangs[j] = matHang;
                    break;

                }

            }

        }
    }


    private static void showMatHang() {
        for (int i = 0; i < matHangs.length; i++) {
            if (matHangs[i] != null) {
                System.out.println(matHangs[i]);

            }
        }

    }

    private static void inputNhanVien() {
        System.out.println("Bạn muốn thêm mới bao nhiêu nhân viên:");
        int soNhanVien = new Scanner(System.in).nextInt();





        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhập thông tin nhân viên thứ: " + (i + 1));

            Scanner scanner = new Scanner(System.in);
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("Nhập ngày kí hợp đồng:");
            String input = scanner.nextLine();
            LocalDate date = LocalDate.parse(input, dateFormat);
            System.out.println("Ngày tháng đã nhập: " + dateFormat.format(date));

            NhanVien nhanVien = new NhanVien();
            nhanVien.inputInfo();




            for (int j = 0; j < nhanViens.length; j++) {
                if (nhanViens[j] == null) {
                    nhanViens[j] = nhanVien;
                    break;

                }

            }


        }
    }


    private static void showNhanVien() {
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i] != null) {
                System.out.println(nhanViens[i]);

            }
        }
    }




}