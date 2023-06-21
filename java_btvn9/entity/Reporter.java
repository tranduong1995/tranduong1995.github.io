package entity;

import statics.Reportertype;

import java.util.Scanner;

public class Reporter extends person   {
    private static int AUTO_ID =10000;
    private int id;
    private Reportertype type;

    public Reporter() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }







    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reportertype getType() {
        return type;
    }

    public void setType(Reportertype type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "id=" + id +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    @Override
    public void inputInfo(){
        super.inputInfo();
        System.out.println("Loại phóng viên :");
        System.out.println("1. Chuyên Nghiệp ");
        System.out.println("2. Nghiệp Dư");
        System.out.println("3.  Cộng tác viên ");
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
                this.setType(Reportertype.CHUYÊN_NGHIỆP);
                break;
            case 2:
                this.setType(Reportertype.NGHIỆP_DƯ);
                break;
            case 3:
                this.setType(Reportertype.CỘNG_TÁC_VIÊN);
                break;

        }

    }
}
