package entity;

public class Booking {

    private Movie movie;
    private Showtime showtime;
    private int numberOfTickets;


    public Booking(Movie movie, Showtime showtime, int numberOfTickets) {
        this.movie = movie;
        this.showtime = showtime;
        this.numberOfTickets = numberOfTickets;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "movie=" + movie +
                ", showtime=" + showtime +
                ", numberOfTickets=" + numberOfTickets +
                '}';
    }
}
