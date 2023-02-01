package class_package.class_10;

public class Tutor extends Person {
    private int amountOfClassesPerWeek;

    public Tutor(String name, String surname, int age, String eyeColor, int amountOfClassesPerWeek) {
        super(name, surname, age, eyeColor);
        this.amountOfClassesPerWeek = amountOfClassesPerWeek;
    }

    public int getAmountOfClassesPerWeek() {
        return amountOfClassesPerWeek;
    }

    public void setAmountOfClassesPerWeek(int amountOfClassesPerWeek) {
        this.amountOfClassesPerWeek = amountOfClassesPerWeek;
    }
}
