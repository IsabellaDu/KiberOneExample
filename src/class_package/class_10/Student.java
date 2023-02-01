package class_package.class_10;

public class Student extends Person{
    private int grade;

    public Student(String name, String surname, int age, String eyeColor, int grade) {
        super(name, surname, age, eyeColor);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
