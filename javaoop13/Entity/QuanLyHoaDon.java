package Entity;

public class QuanLyHoaDon {
    private DichVu dichVu;
    private int soLanDichVu;


    public QuanLyHoaDon(DichVu dichVu, int soLanDichVu) {
        this.dichVu = dichVu;
        this.soLanDichVu = soLanDichVu;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public int getSoLanDichVu() {
        return soLanDichVu;
    }

    public void setSoLanDichVu(int soLanDichVu) {
        this.soLanDichVu = soLanDichVu;
    }

    @Override
    public String toString() {
        return "QuanLyHoaDon{" +
                "dichVu=" + dichVu +
                ", soLanDichVu=" + soLanDichVu +
                '}';
    }
}
