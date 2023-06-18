package entity;

import statics.TeacherLevel;

import java.util.Scanner;

public class Teacher extends ConNguoi  {
    private static int AUTO_ID =100;
    private int id ;
    private TeacherLevel level ;

    public Teacher() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TeacherLevel getLevel() {
        return level;
    }

    public void setLevel(TeacherLevel level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    @Override
    public void inputInfo(){
       super.inputInfo();
        System.out.println("Trình độ :");
        System.out.println("1. GS-TS");
        System.out.println("2. PGS-TS");
        System.out.println("3.  Giảng viên chính ");
        System.out.println("4. Thạc sỹ");
        System.out.println("Mời chọn");
        int levelchoice ;

        do {
            levelchoice = new Scanner(System.in).nextInt();
            if (levelchoice >= 1 || levelchoice <= 4  ){
                break;
            }
            System.out.println("Nhập sai, mời chọn lại:");
        }while (true);
        switch (levelchoice) {
            case 1:
                this.setLevel(TeacherLevel.GS_TS);
                break;
            case 2:
                this.setLevel(TeacherLevel.PGS_TS);
                break;
            case 3:
                this.setLevel(TeacherLevel.GIẢNG_VIÊN_CHÍNH);
                break;
            case 4:
                this.setLevel(TeacherLevel.THẠC_SỸ);
                break;
        }

    }
}
