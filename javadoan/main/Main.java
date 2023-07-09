package main;

import entity.Movie;
import entity.Showtime;
import entity.Booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<Booking> tickets = new ArrayList<>();
        // Tạo một danh sách các phim
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Avengers: Endgame", 181, 10.5));
        movies.add(new Movie("Joker", 122, 8.5));
        movies.add(new Movie("The Lion King", 118, 9.0));

        // Tạo một bản đồ chứa các suất chiếu của các phim
        HashMap<Movie, ArrayList<Showtime>> showtimes = new HashMap<>();
        ArrayList<Showtime> avengersShowtimes = new ArrayList<>();
        avengersShowtimes.add(new Showtime("10:00 AM"));
        avengersShowtimes.add(new Showtime("1:00 PM"));
        avengersShowtimes.add(new Showtime("4:00 PM"));
        avengersShowtimes.add(new Showtime("7:00 PM"));
        showtimes.put(movies.get(0), avengersShowtimes);

        ArrayList<Showtime> jokerShowtimes = new ArrayList<>();
        jokerShowtimes.add(new Showtime("11:00 AM"));
        jokerShowtimes.add(new Showtime("2:00 PM"));
        jokerShowtimes.add(new Showtime("5:00 PM"));
        jokerShowtimes.add(new Showtime("8:00 PM"));
        showtimes.put(movies.get(1), jokerShowtimes);

        ArrayList<Showtime> lionKingShowtimes = new ArrayList<>();
        lionKingShowtimes.add(new Showtime("12:00 PM"));
        lionKingShowtimes.add(new Showtime("3:00 PM"));
        lionKingShowtimes.add(new Showtime("6:00 PM"));
        lionKingShowtimes.add(new Showtime("9:00 PM"));
        showtimes.put(movies.get(2), lionKingShowtimes);

        // Hiển thị danh sách các phim để người dùng chọn
        System.out.println("Danh sách các phim:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + ". " + movies.get(i).getName());
        }

        // Nhập lựa chọn của người dùng và tìm kiếm phim tương ứng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui lòng nhập số thứ tự của phim bạn muốn xem: ");
        int movieChoice = scanner.nextInt();
        Movie selectedMovie = movies.get(movieChoice - 1);

        // Hiển thị thông tin về phim đã chọn và suất chiếu
        System.out.println("Bạn đã chọn xem phim: " + selectedMovie.getName());
        System.out.println("Thời lượng phim: " + selectedMovie.getDuration() + " phút");
        System.out.println("Giá vé: $" + selectedMovie.getPrice());

        System.out.println("Danh sách các suất chiếu:");
        ArrayList<Showtime> movieShowtimes = showtimes.get(selectedMovie);
        for (int i = 0; i < movieShowtimes.size(); i++) {
            System.out.println((i + 1) + ". " + movieShowtimes.get(i).getTime());
        }

        // Nhập lựa chọn của người dùng và đặt vé
        System.out.print("Vui lòng nhập số thứ tự của suất chiếu bạn muốn xem: ");
        int showtimeChoice = scanner.nextInt();
        Showtime selectedShowtime = movieShowtimes.get(showtimeChoice - 1);

        System.out.print("Vui lòng nhập số lượng vé bạn muốn đặt: ");
        int numberOfTickets = scanner.nextInt();

        System.out.println("Nhập số ghế bạn muốn ngồi: ");
        int soGhe = scanner.nextInt();


        System.out.println("Thông tin vé bạn muốn đặt:"   );
        System.out.println("Tên Phim: " +selectedMovie.getName());
        System.out.println("Thời gian: " + selectedShowtime.getTime()  );
        System.out.println("Số lượng vé: " + numberOfTickets);
        double totalCost = selectedMovie.getPrice() * numberOfTickets;
        System.out.println("Tổng chi phí:  " + totalCost +" đồng");

        System.out.print("Are you sure you want to register? (yes/no) ");
        String confirmChoice = scanner.next();


        // Nếu xác nhận đăng kí, tích điểm và áp mã voucher nếu có đủ điểm
        if (confirmChoice.equals("yes")) {
            System.out.println("Bạn đã đặt thành công vé xem phim, Xin Cảm ơn!");



//            this.point += 10;
//            if (this.points >= 100) {
//                System.out.println("Congratulations! You have earned a $10 voucher.");
//                this.points -= 100;
//                this.hasVoucher = true;
//            }
        } else {
            System.out.println("Registration cancelled.");
        }

//        System.out.println("Bạn đã đặt vé thành công cho suất chiếu: " + selectedShowtime.getTime());
    }


}
