package Entity;

import java.util.Scanner;

public class ConNguoi implements inputInfo {
    protected String name ;
    protected String address ;
    protected String phone ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ConNguoi{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


    public void inputInfo(){
        System.out.println("Nhập tên ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập SDT ");
        this.setPhone(new Scanner(System.in).nextLine());
    }

}
