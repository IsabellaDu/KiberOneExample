package class_package.class_10;

public class Main {
    public static void main(String[] args) {


        Person firstPerson = new Person("Anna", "James", 12, "blue");
        System.out.println(firstPerson.getName());

        Person secondPerson = new Person("Ivan", "Ivanov", 20, "grey");
        secondPerson.setEyeColor("brown");
        System.out.println(secondPerson.getEyeColor());


        // DRY - don't repeat yourself

        Student firstStudent = new Student("Ruslan", "Ruslanov", 15, "blue", 10);
        System.out.println(firstStudent.getName());
        System.out.println(firstStudent.getGrade());

        // class Tutor
        // новый тьютор Избелла преподает 5 уроков в неделю

        Tutor tutor = new Tutor("Izabella", "Dudaryk", 25, "brown", 3);
        System.out.println("новый тьютор " + tutor.getName() + " преподает " + tutor.getAmountOfClassesPerWeek() + " занятий в неделю.");

    }
}
