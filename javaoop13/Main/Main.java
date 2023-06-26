package Main;

import Entity.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static KhachHang[] khachHangs = new KhachHang[100];
    private static DichVu[] dichVus = new DichVu[100];
    private static HoaDon[]  hoaDons = new HoaDon[100];


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
                    inputKhachHang();

                    break;
                case 2:

                    showKhachHang();

                    break;
                case 3:

                    inputNewDichVu();

                    break;

                case 4:
                    showDichVu();
                    break;

                case 5:

                    inputHoaDon();
                    break;
                case 6:
                      showHoaDon();
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


    private static void showMenuContent() {
        try {
            System.out.println("=============PHẦN MỀM HÓA ĐƠN CHO KHÁCH HÀNG==============");
            System.out.println("1. Thêm mới khách hàng.");
            System.out.println("2. In danh sách khách hàng.");
            System.out.println("3. Thêm mới dịch vụ.");
            System.out.println("4. In danh sách dịch vụ .");
            System.out.println("5. Nhập hóa đơn cho khách hàng .");
            System.out.println("6. In hóa đơn ");
            System.out.println("7. Sắp xếp danh sách hóa đơn .");
            System.out.println("8. Số tiền phải trả cho khách.");
            System.out.println("9. Thoát.");
            System.out.println(" Mời chọn");
        } catch (InputMismatchException  e){
            System.out.println("Nhập số không đúng định dạng hoặc không đúng kiểu dữ liệu ");

        }

    }

    private static void inputKhachHang() {
        try {
            System.out.println("Bạn muốn thêm mới bao nhiêu khách hàng:");
            int soKhachHang = new Scanner(System.in).nextInt();
            for (int i = 0; i < soKhachHang; i++) {
                System.out.println("Nhập thông tin khách hàng thứ: " + (i + 1));
                KhachHang khachHang = new KhachHang();

                khachHang.inputInfo();

                for (int j = 0; j < khachHangs.length; j++) {
                    if (khachHangs[j] == null) {
                        khachHangs[j] = khachHang;
                        break;

                    }
                }

            }

        }catch (InputMismatchException e){
            System.out.println("Nhập số không đúng định dạng hoặc không đúng kiểu dữ liệu ");

        }



    }

    private static void showKhachHang() {
        for (int i = 0; i < khachHangs.length; i++) {
            if (khachHangs[i] != null) {
                System.out.println(khachHangs[i]);

            }
        }

    }

    private static void inputNewDichVu() {
        System.out.println("Bạn muốn thêm mới bao nhiêu dịch vụ :");
        int postsnumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < postsnumber; i++) {
            System.out.println("Nhập thông tin dịch vụ thứ : " + (i + 1));


            DichVu dichVu = new DichVu();
            System.out.println("Nhập tên dịch vụ:");
            dichVu.setName(new Scanner(System.in).nextLine());


            System.out.println("Nhập giá dịch vụ:");
            dichVu.setPrice(new Scanner(System.in).nextDouble());

            System.out.println("Nhập đơn vị tính");
            dichVu.setInit(new Scanner(System.in).nextLine());


            for (int j = 0; j < dichVus.length; j++) {
                if (dichVus[j] == null) {
                    dichVus[j] = dichVu;
                    break;

                }

            }

        }

    }

    private static void showDichVu() {
        for (int k = 0; k < dichVus.length; k++) {
            if (dichVus[k] != null) {
                System.out.println(dichVus[k]);
            }

        }


    }


    private static void inputHoaDon() {
        if(!khachHangIsNotEmpty() || !dichVuIsNotEmpty()){
            System.out.println("Không có dữ liệu về khách hàng và dịch vụ ");
            return;
        }
        System.out.println("Nhập số khách hàng: ");
        int soKhachHang = new Scanner(System.in).nextInt();
        for (int i = 0; i < soKhachHang  ; i++) {
            System.out.println("Nhập thông tin cho khách hàng thứ " + (i + 1) + " .");
            System.out.println("Nhập ID khách hàng: ");
            int khachHangId;
            KhachHang khachHang = null;
            do {
                khachHangId = new Scanner(System.in).nextInt();
                for (int j = 0; j < khachHangs.length; j++) {
                    if (khachHangs[j] != null && khachHangs[j].getIdkh() == khachHangId) {
                        khachHang = khachHangs[j];
                        break;
                    }
                }
                if (khachHang == null) {
                    break;
                }
                System.out.println("Không tồn tại ID khách hàng vừa nhập, xin vui lòng nhập lại: ");
            } while (true);




            System.out.println("Số dịch vụ mà khách hàng sử dụng : ");
            int soDichVu  ;
            do {
                soDichVu = new Scanner(System.in).nextInt();
                if (soDichVu < 1 || soDichVu > 5) {
                    System.out.println("Số lớp phải là số dương và nhỏ hơn 5.");
                    continue;
                }
                break;
            } while (true);

            QuanLyHoaDon[] details = new QuanLyHoaDon[soDichVu];
            int count = 0;
            for (int j = 0; j < soDichVu ; j++) {
                System.out.println("Dịch vụ thứ " + (j + 1) + " mà  khách hàng sử dụng ( nhập id dịch vụ): ");
                int dichVuId;
                DichVu dichVu = null;
                do {
                    dichVuId = new Scanner(System.in).nextInt();
                    for (int k = 0; k <dichVus.length; k++) {
                        if (dichVus[k] !=null && dichVus[k].getId() == dichVuId) {
                            dichVu = dichVus[k];
                            break;
                        }
                    }
                    if (dichVu == null) {
                        break;
                    }
                    System.out.println("Không tồn tại dịch vụ có ID vừa nhập, vui lòng nhập lại: ");
                } while (true);




                System.out.println("Dịch vụ này dùng số lần là : ");
                int soLanDichVu = new Scanner(System.in).nextInt();


                QuanLyHoaDon quanLyHoaDon = new QuanLyHoaDon(dichVu, soLanDichVu);
                QuanLyHoaDon QuanLyHoaDon =  null;
                details[count] = QuanLyHoaDon;
                count++;
            }

           HoaDon hoaDon = new HoaDon(khachHang , details);

            saveHoaDon(hoaDon);


        }

    }

    private static void showHoaDon(){

        for( int i = 0 ; i < hoaDons.length; i++) {
            if(hoaDons[i] != null){
                System.out.println(hoaDons[i]);
            }
        }
    }

    private static void saveHoaDon(HoaDon hoaDon){
        for(int i = 0; i < hoaDons.length ; i++){
            if(hoaDons[i] == null){
                hoaDons[i] =hoaDon;
                break;
            }
        }
    }

    public static boolean khachHangIsNotEmpty() {
        for (int i = 0 ; i < khachHangs.length; i++){
            if(khachHangs[i] != null){
                return true;
            }
        }
        return false;
    }
    public static boolean dichVuIsNotEmpty() {
        for (int i = 0 ; i < dichVus.length; i++){
            if(dichVus[i] != null){
                return true;
            }
        }
        return false;
    }
}