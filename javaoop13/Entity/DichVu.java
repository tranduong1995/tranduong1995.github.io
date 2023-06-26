package Entity;

import java.util.Scanner;

public class DichVu implements InputInfo {
    private static int AUTO_MA =100;
    private int id;
    private String name;
    private double price;
    private String init;

    public DichVu() {
        this.id = AUTO_MA;
        AUTO_MA++;
    }

    public static int getAutoMa() {
        return AUTO_MA;
    }

    public static void setAutoMa(int autoMa) {
        AUTO_MA = autoMa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }


    @Override
    public String toString() {
        return "DichVu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", init='" + init + '\'' +
                '}';
    }


    public void inputInfo(){
        System.out.println("Nhập tên dịch vụ");
        this.name = new Scanner(System.in).nextLine();

    }
}
