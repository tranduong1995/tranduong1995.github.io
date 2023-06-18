package main;


import entity.Teacher;
import entity.Subject;
import statics.TeacherLevel;


import java.util.Scanner;

public class Main {
    private static Teacher[] teachers = new Teacher[100];
    private static Subject[] subjects = new Subject[100];




    public static void main(String[] args){
        menu();

       }

       private static void menu(){
           while (true) {
               showMenuContent();
               int choice ;
               do{
                   choice = new Scanner(System.in).nextInt();
                   if (choice >= 1 || choice <= 9  ){
                       break;
                   }
                   System.out.println("Nhập sai, mời chọn lại:");
               }while (true);



               switch (choice) {
                   case 1:
                       inputNewTeacher();
                       break;
                   case 2:
                       showTeacher();
                       break;
                   case 3:
                       System.out.println("Bạn muốn thêm mơi bao nhiêu môn học:");
                       int subjectnumber = new Scanner(System.in).nextInt();
                       for (int i = 0; i < subjectnumber; i++) {
                           System.out.println("Nhập thông tin môn học" +(i+1));
                           System.out.println("Nhập mã môn học:" );
                           int id = new Scanner(System.in).nextInt();

                           Subject subject = new Subject();
                           System.out.println("Nhập môn học:");
                           subject.setName(new Scanner(System.in).nextLine());


                           System.out.println("Nhập tổng số tiết : ");
                           int totalLesson = new Scanner(System.in).nextInt();

                           System.out.println("Nhập số tiết lý thuyết:");
                           int theoryLesson = new Scanner(System.in).nextInt();

                           System.out.println("Nhập mức kinh phí:");
                           double price = new Scanner(System.in).nextDouble();




                           for (int j = 0; j < subjects.length ; j++) {
                               if (subjects[j] == null){
                                   subjects[j] = subject;
                                   break;

                               }

                           }

                       }



                       break;
                   case 4:
                       showSubject();

                       break;
                   case 5:
                       break;
                   case 6:
                       break;
                   case 7:
                       break;
                   case 8:
                       break;
                   case 9:
                       return;
               }
           }

       }

    private static void showMenuContent(){
           System.out.println("=============PHẦN MỀM TÍNH LƯƠNG CHO GIẢNG VIÊN==============");
           System.out.println("1. Thêm mới giảng viên.");
           System.out.println("2. In danh sách giảng viên.");
           System.out.println("3. Thêm mới môn học.");
           System.out.println("4. In danh sách môn học.");
           System.out.println("5. Lập bảng kê khai giảng dạy.");
           System.out.println("6. In bảng kê khai giảng viên.");
           System.out.println("7. Sắp xếp bảng kê khai giảng viên.");
           System.out.println("8. Tính lương giảng viên.");
           System.out.println("9. Thoát.");
           System.out.println(" Mời chọn");
       }

    private static void showTeacher(){
           for (int i = 0; i < teachers.length; i++) {
               if (teachers[i] != null){
                   System.out.println(teachers[i]);

               }
           }
       }

    private static void showSubject(){
        for (int k = 0; k < subjects.length; k++) {
            if (subjects[k] != null){
                System.out.println(subjects[k]);
            }



            }
    }


    private static void inputNewTeacher() {
           System.out.println("Bạn muốn thêm mơi bao nhiêu giảng viên:");
           int teachernumber = new Scanner(System.in).nextInt();
           for (int i = 0; i < teachernumber; i++) {
               System.out.println("Nhập thông tin ông giảng viên thứ " +(i+1));
               Teacher teacher = new Teacher();
               teacher.inputInfo();

               for (int j = 0; j < teachers.length ; j++) {
                   if (teachers[j] == null){
                       teachers[j] = teacher;
                       break;

                   }

               }

           }

    }


}


