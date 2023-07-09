package entity;

public class Movie {
    private String name;
    private int duration;
    private double price;

    public Movie(String name, int duration, double price) {
        this.name = name;
        this.duration = duration;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }
}



