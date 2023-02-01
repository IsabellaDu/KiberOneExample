package class_package.class_10;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String eyeColor;


    public Person(String name, String surname, int age, String eyeColor) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}




