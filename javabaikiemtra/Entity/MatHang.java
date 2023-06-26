package Entity;

import Statics.NhomHang;

import javax.swing.*;
import java.util.Scanner;

public class MatHang implements inputInfo {

    private static int AUTO_MA =1000;
    public MatHang() {
        this.id = AUTO_MA;
        AUTO_MA++;
    }
    // mã hàng, Tên hàng, Nhóm hàng, Giá bán, Số lượng
    private int id;
    private String tenHang;
    private NhomHang nhomHang;
    private int giaBan;
    private int soLuong;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public NhomHang getNhomHang() {
        return nhomHang;
    }

    public void setNhomHang(NhomHang nhomHang) {
        this.nhomHang = nhomHang;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "MatHang{" +
                "id=" + id +
                ", tenHang='" + tenHang + '\'' +
                ", nhomHang=" + nhomHang +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                '}';
    }


    public  void inputInfo(){

        System.out.println("Loại Mặt Hàng :");
        System.out.println("1.Điện Tử ");
        System.out.println("2. Điện Lạnh");
        System.out.println("3.  Máy Tính ");
        System.out.println("4.  Thiết Bị Văn Phòng ");
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
                this.setNhomHang(NhomHang.ĐIỆN_TỬ);
                break;
            case 2:
                this.setNhomHang(NhomHang.ĐIỆN_LẠNH);
                break;
            case 3:
                this.setNhomHang(NhomHang.MÁY_TÍNH);
                break;
            case 4:
                this.setNhomHang(NhomHang.THIẾT_BỊ_VĂN_PHÒNG);
                break;

        }

    }

}
