package Main;

import entity.CongNhan;
import entity.DSChamCong;
import entity.QLDSChamCong;
import entity.XuongSanXuat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<CongNhan> congNhans = new ArrayList<>();
    private static List<XuongSanXuat> xuongSanXuats = new ArrayList<>();
    private static List<DSChamCong> dsChamCongs = new ArrayList<>();

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
                    inputCongNhan();

                    break;
                case 2:

                    showCongNhan();

                    break;
                case 3:
                    inputXuongSanXuat();



                    break;

                case 4:
                    showXuongSanXuat();
                    break;

                case 5:
                inputChamCong();

                    break;
                case 6:
                    showChamCong();
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

            System.out.println("=============PHẦN MỀM KÊ KHAI THU NHẬP CÔNG NHÂN==============");
            System.out.println("1. Thêm mới công nhân.");
            System.out.println("2. In danh sách công nhân.");
            System.out.println("3. Thêm mới xưởng sản xuất.");
            System.out.println("4. In danh sách xưởng sản xuất .");
            System.out.println("5. Nhập bảng danh sách chấm công .");
            System.out.println("6. In bảng danh sách   ");
            System.out.println("7. Sắp xếp danh sách   .");
            System.out.println("8. Số tiền phải trả cho công nhân.");
            System.out.println("9. Thoát.");
            System.out.println(" Mời chọn");


    }

    private static void inputCongNhan() {
        System.out.println("Bạn muốn thêm mới bao nhiêu công nhân:");
        int soCongNhan = new Scanner(System.in).nextInt();
        for (int i = 0; i < soCongNhan; i++) {
            System.out.println("Nhập thông tin công nhân thứ: " + (i + 1));
            CongNhan congNhan = new CongNhan();

            congNhan.inputInfo();
             congNhans.add(congNhan);


        }
    }

    private static void showCongNhan() {
        System.out.println(congNhans);

    }

    private static void inputXuongSanXuat(){

            System.out.println("Bạn muốn thêm mới bao nhiêu xưởng :");
            int soXuong = new Scanner(System.in).nextInt();
            for (int i = 0; i < soXuong; i++) {
                System.out.println("Nhập thông tin xưởng thứ : " + (i + 1));
                XuongSanXuat xuongSanXuat = new XuongSanXuat();

                xuongSanXuat.inputInfo();

                 xuongSanXuats.add(xuongSanXuat);

            }

    }

    private static void showXuongSanXuat(){
        System.out.println(xuongSanXuats);

    }

    private static void inputChamCong(){
        if(!congNhanIsNotEmpty() || !xuongSanXuatIsNotEmpty()){
            System.out.println("Không có dữ liệu về công nhân và xưởng  ");
            return;
        }
        System.out.println("Nhập số công nhân: ");
        int soCongNhan = new Scanner(System.in).nextInt();
        for (int i = 0; i < soCongNhan  ; i++) {
            System.out.println("Nhập thông tin cho công nhân thứ " + (i + 1) + " .");
            System.out.println("Nhập ID công nhân: ");
            int congNhanId;
            CongNhan congNhan= null;
            do {
                congNhanId = new Scanner(System.in).nextInt();
                for (int j = 0; j < congNhans.size(); j++) {
                    if (   congNhans.get(j).getIdcn() == congNhanId)  {
                        congNhan = congNhans.get(j);
                        break;
                    }
                }
                if (congNhan != null) {

                    break;
                }
                System.out.println("Không tồn tại ID công nhân vừa nhập, xin vui lòng nhập lại: ");
            } while (true);




            System.out.println("Số xưởng sản xuât mà công nhân làm : ");
            int soXuongSX = new Scanner(System.in).nextInt(); ;

             List<QLDSChamCong> details = new ArrayList<>();

            for (int j = 0; j < soXuongSX ; j++) {
                System.out.println("Xưởng sản xuất thứ " + (j + 1) + " mà  công nhân làm ( nhập id XSX): ");
                int xuongSXId;
                XuongSanXuat xuongSanXuat = null;
                do {
                   xuongSXId = new Scanner(System.in).nextInt();
                    for (int k = 0; k <xuongSanXuats.size(); k++) {
                        if (   xuongSanXuats.get(k).getIdXSX() == xuongSXId) {
                            xuongSanXuat = xuongSanXuats.get(k);
                            break;
                        }
                    }
                    if (xuongSanXuat != null) {

                        break;
                    }
                    System.out.println("Không tồn tại xưởng sản xuất  có ID vừa nhập, vui lòng nhập lại: ");
                } while (true);


                System.out.println("Xưởng này làm số ngày là : ");
                int soNgayLam = new Scanner(System.in).nextInt();



                QLDSChamCong qldsChamCong = new QLDSChamCong(xuongSanXuat, soNgayLam);
                details.add(qldsChamCong);


            }


            DSChamCong dsChamCong = new DSChamCong(congNhan ,details);

            dsChamCongs.add(dsChamCong);


        }

    }



    private static void showChamCong(){

        System.out.println(dsChamCongs);
    }



    public static boolean congNhanIsNotEmpty() {
        return congNhans != null && !congNhans.isEmpty();
    }
    public static boolean xuongSanXuatIsNotEmpty() {
         return xuongSanXuats != null && !xuongSanXuats.isEmpty();
    }

    }








