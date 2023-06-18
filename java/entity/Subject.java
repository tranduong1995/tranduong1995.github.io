package entity;

public class Subject implements inputInfo {
    private int id;
    private String name;
    private int totalLesson ;
    private int theoryLesson;
    private double price;

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

    public int getToalLesson() {
        return totalLesson;
    }

    public void setToalLesson(int toalLesson) {
        this.totalLesson = toalLesson;
    }

    public int getTheoryLesson() {
        return theoryLesson;
    }

    public void setTheoryLesson(int theoryLesson) {
        this.theoryLesson = theoryLesson;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", toalLesson=" + totalLesson +
                ", theoryLesson=" + theoryLesson +
                ", price=" + price +
                '}';
    }
    @Override
    public void inputInfo(){



    }
}
