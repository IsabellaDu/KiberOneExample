package class_package.class_10;

public class Student extends Person implements Callable {
    private int grade;

    public Student(String name, String surname, int age, String eyeColor, String phoneNumber, int grade) {
        super(name, surname, age, eyeColor, phoneNumber);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String call() {
        return "Позвонить студенту " + getName() + " можно по номеру " + getPhoneNumber();
    }

    public String call(Person person) {
        if (this.getPhoneNumber().equals(person.getPhoneNumber())) {
            return "Невозможно совершить звонок: номера совпадают.";
        } else {
            return "Студент " + this.getName()
                    + " " + this.getSurname()
                    + " звонит "
                    + person.getName()
                    + " " + person.getSurname();
        }
    }

    @Override
    public String print() {
        return super.print() + "\nКласс: " + grade;
    }
}
