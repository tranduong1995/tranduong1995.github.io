package Entity;

import Statics.LoaiKhachHang;

import java.util.Scanner;

public class KhachHang extends ConNguoi {
    private static int AUTO_ID =10000;
    private int idkh;
    private LoaiKhachHang type;

    public KhachHang() {
        this.idkh = AUTO_ID;
        AUTO_ID++;
    }


    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getIdkh() {
        return idkh;
    }

    public void setIdkh(int idkh) {
        this.idkh = idkh;
    }

    public LoaiKhachHang getType() {
        return type;
    }

    public void setType(LoaiKhachHang type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "idkh=" + idkh +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void inputInfo(){
        super.inputInfo();
        System.out.println("Loại Khách Hàng :");
        System.out.println("1. Cá Nhân ");
        System.out.println("2. Đai diên đơn vị hành chính");
        System.out.println("3.  Đai diên đơn vị kinh doanh ");
        System.out.println("Mời chọn");
        int typechoice ;

        do {
            typechoice = new Scanner(System.in).nextInt();
            if (typechoice >= 1 || typechoice <= 3  ){
                break;
            }
            System.out.println("Nhập sai, mời chọn lại:");
        }while (true);

        switch (typechoice) {
            case 1:
                this.setType(LoaiKhachHang.CÁ_NHÂN);
                break;
            case 2:
                this.setType(LoaiKhachHang.ĐẠI_DIỆN_ĐƠN_VỊ_HÀNH_CHÍNH);
                break;
            case 3:
                this.setType(LoaiKhachHang.ĐẠI_DIỆN_ĐƠN_VỊ_KINH_DOANH);
                break;

        }

    }

}
