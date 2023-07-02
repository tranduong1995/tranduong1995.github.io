package entity;

import Statics.BacTho;

import java.util.Scanner;

public class CongNhan extends ConNguoi {
    private static int AUTO_ID =1000;
    private int idcn;
    private BacTho bacTho;

    public CongNhan(int idcn, BacTho bacTho) {
        this.idcn = idcn;
        this.bacTho = bacTho;
    }

    public CongNhan() {
        this.idcn = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getIdcn() {
        return idcn;
    }

    public void setIdcn(int idcn) {
        this.idcn = idcn;
    }

    public BacTho getBacTho() {
        return bacTho;
    }

    public void setBacTho(BacTho bacTho) {
        this.bacTho = bacTho;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "idcn=" + idcn +
                ", bacTho=" + bacTho +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void inputInfo(){
        super.inputInfo();
        System.out.println("Bậc thợ :");
        System.out.println("1. Bâc 1 ");
        System.out.println("2. Bâc 2 ");
        System.out.println("3. Bâc 3 ");
        System.out.println("4. Bâc 4 ");
        System.out.println("5. Bâc 5 ");
        System.out.println("6. Bâc 6 ");
        System.out.println("7. Bâc 7 ");
        System.out.println("Mời chọn");
        int typechoice ;

        do {
            typechoice = new Scanner(System.in).nextInt();
            if (typechoice >= 1 || typechoice <= 7  ){
                break;
            }
            System.out.println("Nhập sai, mời chọn lại:");
        }while (true);

        switch (typechoice) {
            case 1:
                this.setBacTho(BacTho.BẬC_1);
                break;
            case 2:
                this.setBacTho(BacTho.BẬC_2);
                break;
            case 3:
                this.setBacTho(BacTho.BẬC_3);
                break;
            case 4:
                this.setBacTho(BacTho.BẬC_4);
                break;
            case 5:
                this.setBacTho(BacTho.BẬC_5);
                break;
            case 6:
                this.setBacTho(BacTho.BẬC_6);
                break;
            case 7:
                this.setBacTho(BacTho.BẬC_7);
                break;



        }

    }
}
