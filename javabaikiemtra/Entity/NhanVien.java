package Entity;

import java.time.LocalDate;

public class NhanVien extends ConNguoi {
    private static int AUTO_ID =1000;
    private int idnv;
    private LocalDate date;

    public NhanVien(int idnv, String date, String name, String address, String phone) {
        this.idnv = idnv;
        this.date = LocalDate.parse(date);
        this.name = name;
        this.address = address;
        this.phone = phone;
    }


    public NhanVien() {
        this.idnv = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getIdnv() {
        return idnv;
    }

    public void setIdnv(int idnv) {
        this.idnv = idnv;
    }



    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "idnv=" + idnv +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


}
