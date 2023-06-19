package entity;

public class QLKK {
    private Teacher teacher;
    private Subject subject;
    private int numberClasses;
    private int numbertheoryLesson;
     private int numOfPracticalHours;



    public QLKK(Teacher teacher, Subject subject, int numberClasses) {
        this.teacher = teacher;
        this.subject = subject;
        this.numberClasses = numberClasses;
        this.numbertheoryLesson = numberClasses * subject.getTheoryLesson();
        this.numOfPracticalHours = (int) Math.round(numbertheoryLesson   * 0.7);
        teacher.addQLKK(this);
    }
}
