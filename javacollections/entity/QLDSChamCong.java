package entity;

public class QLDSChamCong {
    private XuongSanXuat xuongSanXuat;
    private int soNgayLam ;

    public QLDSChamCong(XuongSanXuat xuongSanXuat, int soNgayLam) {
        this.xuongSanXuat = xuongSanXuat;
        this.soNgayLam = soNgayLam;
    }

    public XuongSanXuat getXuongSanXuat() {
        return xuongSanXuat;
    }

    public void setXuongSanXuat(XuongSanXuat xuongSanXuat) {
        this.xuongSanXuat = xuongSanXuat;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    @Override
    public String toString() {
        return "QLDSChamCong{" +
                "xuongSanXuat=" + xuongSanXuat +
                ", soNgayLam=" + soNgayLam +
                '}';
    }

}
