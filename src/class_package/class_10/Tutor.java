package class_package.class_10;

public class Tutor extends Person implements Callable {
    private int amountOfClassesPerWeek;

    public Tutor(String name, String surname, int age, String eyeColor, String phoneNumber, int amountOfClassesPerWeek) {
        super(name, surname, age, eyeColor, phoneNumber);
        this.amountOfClassesPerWeek = amountOfClassesPerWeek;
    }

    public int getAmountOfClassesPerWeek() {
        return amountOfClassesPerWeek;
    }

    public void setAmountOfClassesPerWeek(int amountOfClassesPerWeek) {
        this.amountOfClassesPerWeek = amountOfClassesPerWeek;
    }

    @Override
    public String call() {
        return "Позвонить тьютору " + getName() + " можно по номеру " + getPhoneNumber();
    }

    public String call(Tutor anotherTutor) {
        if (this.getPhoneNumber().equals(anotherTutor.getPhoneNumber())) {
            return "Невозможно позвонить самому себе (номера совпадают)";
        } else {
            return "Тьютор " + this.getName()
                    + " " + this.getSurname()
                    + " звонит тьютору "
                    + anotherTutor.getName()
                    + " " + anotherTutor.getSurname();
        }
    }

}
