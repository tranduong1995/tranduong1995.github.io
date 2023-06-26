package Statics;

public enum LoaiKhachHang {
    CÁ_NHÂN ("CÁ - NHÂN "),
    ĐẠI_DIỆN_ĐƠN_VỊ_HÀNH_CHÍNH ("Đ_D_Đ_V_H_C"),
    ĐẠI_DIỆN_ĐƠN_VỊ_KINH_DOANH ("Đ_D_Đ_V_K_D");


    public String name;
    LoaiKhachHang (String name) {
        this.name = name;
    }
}
