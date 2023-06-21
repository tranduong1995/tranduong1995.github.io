package entity;

import java.util.Scanner;

public class PostType implements inputInfo {
    private static int AUTO_MA =100;
    private int id;
    private String name;
    private double price;

    public PostType() {
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

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void inputInfo(){
        System.out.println("Nhập kiểu bài viết");
        this.name = new Scanner(System.in).nextLine();

    }


}
