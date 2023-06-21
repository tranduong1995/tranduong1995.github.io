package main;

import entity.PostManagement;
import entity.PostManagementDetail;
import entity.PostType;
import entity.Reporter;

import java.util.Scanner;

import statics.Reportertype;

import javax.security.auth.Subject;

public class Main {
    private static Reporter[] reporters = new Reporter[100];
    private static PostType[] postTypes = new PostType[100];
    private static PostManagement[]  postManagements = new PostManagement[100];

    public static void main(String[] args) {
        while (true) {
            showMenuContent();



            int choice;
            do {
                choice = new Scanner(System.in).nextInt();
                if (choice >= 1 || choice <= 9) {
                    break;
                }
                System.out.println("Nhập sai, mời chọn lại:");
            } while (true);


            switch (choice) {
                case 1:
                    inputNewReporter();

                    break;
                case 2:
                    showReporter();


                    break;
                case 3:

                    inputNewPostType();

                    break;

                case 4:
                    showPostType();
                    break;

                case 5:
                    if(!reporterIsNotEmpty() || !postTypeIsNotEmpty()){
                        System.out.println("Không có dữ liệu về phóng viên va bài viết ");
                        return;
                    }
                    System.out.println("Nhập số phóng viên viết bài: ");
                    int reporterNumber = new Scanner(System.in).nextInt();
                    for (int i = 0; i < reporterNumber; i++) {
                        System.out.println("Nhập thông tin cho phóng viên thứ " + (i + 1) + "  viết bài.");
                        System.out.println("Nhập ID phóng viên: ");
                        int reporterId;
                        Reporter reporter = null;
                        do {
                            reporterId = new Scanner(System.in).nextInt();
                            for (int j = 0; j < reporters.length; j++) {
                                if (reporters[j] != null && reporters[j].getId() == reporterId) {
                                   reporter = reporters[j];
                                    break;
                                }
                            }
                            if (reporter != null) {
                                break;
                            }
                            System.out.println("Không tồn tại ID giảng viên vừa nhập, xin vui lòng nhập lại: ");
                        } while (true);

                        System.out.println("Tổng số bài viết của phóng viên: ");
                        int postsNumber = new Scanner(System.in).nextInt();
                        PostManagementDetail[] details = new PostManagementDetail[postsNumber];
                        int count = 0;
                        for (int j = 0; j < postsNumber; j++) {
                            System.out.println("Bài viết thứ " + (j + 1) + " mà ông này viết là kiểu bài gì: ");
                            int posttypeId;
                            PostType postType = null;
                            do {
                                posttypeId = new Scanner(System.in).nextInt();
                                for (int k = 0; k < postTypes.length; k++) {
                                    if (postTypes[k] !=null && postTypes[k].getId() == posttypeId) {
                                        postType = postTypes[k];
                                        break;
                                    }
                                }
                                if (postType != null) {
                                    break;
                                }
                                System.out.println("Không tồn tại môn học có ID vừa nhập, vui lòng nhập lại: ");
                            } while (true);

                            System.out.println("Kiểu bài này ông  viết bao nhiêu bài: ");
                            int postTypeNumber;
                            do {
                                postTypeNumber = new Scanner(System.in).nextInt();
                                if (postTypeNumber < 1 || postTypeNumber > 5) {
                                    System.out.println("Số lớp phải là số dương và nhỏ hơn 5.");
                                    continue;
                                }
                                break;
                            } while (true);
                            PostManagementDetail postManagementDetail = new PostManagementDetail(postType, postTypeNumber);
                            details[count] = postManagementDetail;
                            count++;
                        }

                        PostManagement postManagement = new PostManagement(reporter , details);
                        savePost(postManagement);


                    }
                    break;
                case 6:
                    for( int i = 0 ; i < postManagements.length; i++) {
                        if(postManagements[i] != null){
                            System.out.println(postManagements[i]);
                        }
                    }
                    return;


            }
        }

    }

    private static void showMenuContent(){
        System.out.println("=============PHẦN MỀM TÍNH LƯƠNG CHO PHÓNG VIÊN==============");
        System.out.println("1. Thêm mới  phóng viên.");
        System.out.println("2. In danh sách phóng viên.");
        System.out.println("3. Thêm mới bài viết.");
        System.out.println("4. In danh sách bài viết .");
        System.out.println("5. Lập bảng kê khai .");
        System.out.println("6. In bảng kê khai ");
        System.out.println("7. Sắp xếp bảng kê khai .");
        System.out.println("8. Tính lương phóng viên.");
        System.out.println("9. Thoát.");
        System.out.println(" Mời chọn");
    }
    private static void inputNewReporter (){
        System.out.println("Bạn muốn thêm mới bao nhiêu phóng viên:");
        int reporternumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < reporternumber; i++) {
            System.out.println("Nhập thông tin ông phóng viên thứ: " + (i + 1));
            Reporter reporter = new Reporter();
            reporter.inputInfo();

            for (int j = 0; j < reporters.length; j++) {
                if (reporters[j] == null) {
                    reporters[j] = reporter;
                    break;

                }
            }

        }

    }

    private static void  showReporter(){
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i] != null) {
                System.out.println(reporters[i]);

            }
        }

    }
    private static void  inputNewPostType(){
        System.out.println("Bạn muốn thêm mới bao nhiêu bài viết :");
        int postsnumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < postsnumber; i++) {
            System.out.println("Nhập thông tin kiểu bài viết: " + (i + 1));


            PostType posts = new PostType();
            System.out.println("Nhập kiểu bài viết:");
            posts.setName(new Scanner(System.in).nextLine());


            System.out.println("Nhập mức kinh phí:");
            posts.setPrice(new Scanner(System.in).nextDouble());


            for (int j = 0; j < postTypes.length; j++) {
                if (postTypes[j] == null) {
                    postTypes[j] = posts;
                    break;

                }

            }

        }

    }
    private static void  showPostType(){
        for (int k = 0; k < postTypes.length; k++) {
            if (postTypes[k] != null) {
                System.out.println(postTypes[k]);
            }

        }


    }

    private static void savePost(PostManagement postManagement){
        for(int i = 0; i < postManagements.length ; i++){
            if(postManagements[i] == null){
                postManagements[i] =postManagement;
                break;
            }
        }
    }

    public static boolean reporterIsNotEmpty() {
        for (int i = 0 ; i < reporters.length; i++){
            if(reporters[i] != null){
                return true;
            }
        }
        return false;
    }
    public static boolean postTypeIsNotEmpty() {
        for (int i = 0 ; i < postTypes.length; i++){
            if(postTypes[i] != null){
                return true;
            }
        }
        return false;
    }
}



