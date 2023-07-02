package entity;

import java.util.Scanner;

public class XuongSanXuat implements inputInfo {
    //mã xưởng, tên xưởng, mô tả, Hệ số công việc
    private int idXSX;
    private String tenXuong;
    private String moTa;
    private int heSoCV;

    private static int AUTO_IDXuong =100;

    public XuongSanXuat() {
        this.idXSX = AUTO_IDXuong;
        AUTO_IDXuong++;
    }

    public XuongSanXuat(CongNhan congNhan, QLDSChamCong[] details) {
    }

    public int getIdXSX() {
        return idXSX;
    }

    public void setIdXSX(int idXSX) {
        this.idXSX = idXSX;
    }

    public String getTenXuong() {
        return tenXuong;
    }

    public void setTenXuong(String tenXuong) {
        this.tenXuong = tenXuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHeSoCV() {
        return heSoCV;
    }



    public static int getAUTO_IDXuong() {
        return AUTO_IDXuong;
    }

    public static void setAUTO_IDXuong(int AUTO_IDXuong) {
        XuongSanXuat.AUTO_IDXuong = AUTO_IDXuong;
    }

    @Override
    public String toString() {
        return "XuongSanXuat{" +
                "idXSX=" + idXSX +
                ", tenXuong='" + tenXuong + '\'' +
                ", moTa='" + moTa + '\'' +
                ", heSoCV=" + heSoCV +
                '}';
    }

    public void setHeSoCV(int heSoCV) {
        if (heSoCV >= 1 && heSoCV <= 20) {
            this.heSoCV = heSoCV;
        } else {
            throw new IllegalArgumentException("Hệ số công việc phải nằm trong khoảng từ 1 đến 20");
        }
    }

    @Override
    public void inputInfo(){

        System.out.println("Nhập tên xưởng sản xuất:");
        this.setTenXuong(new Scanner(System.in).nextLine());
        System.out.println("Nhập mô tả:");
        this.setMoTa(new Scanner(System.in).nextLine());
        System.out.println("Nhập hệ số công việc");
        this.setHeSoCV(new Scanner(System.in).nextInt());

    }

}
