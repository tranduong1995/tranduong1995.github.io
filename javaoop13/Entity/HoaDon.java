package Entity;

import java.util.Arrays;

public class HoaDon {
     private KhachHang khachHang;

    private QuanLyHoaDon[] details;

    public HoaDon(KhachHang khachHang, QuanLyHoaDon[] details) {
        this.khachHang = khachHang;
        this.details = details;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public QuanLyHoaDon[] getDetails() {
        return details;
    }

    public void setDetails(QuanLyHoaDon[] details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "khachHang=" + khachHang +
                ", details=" + Arrays.toString(details) +
                '}';
    }
}
