package class_package.class_10;

public class Main {
    public static void main(String[] args) {


        Person firstPerson = new Person(
                "Anna",
                "James",
                12,
                "blue",
                "0987651111"
        );
        //System.out.println(firstPerson.getPhoneNumber());

        Person secondPerson = new Person(
                "Ivan",
                "Ivanov",
                20,
                "grey",
                "0991234555"
        );
        secondPerson.setEyeColor("brown");
        //System.out.println(secondPerson.getEyeColor());


        // DRY - don't repeat yourself

        Student firstStudent = new Student("Ruslan", "Ruslanov", 15, "blue", "0971112222", 10);
        //System.out.println(firstStudent.getName());
        //System.out.println(firstStudent.getGrade());

        // class Tutor
        // новый тьютор Избелла преподает 5 уроков в неделю

        Tutor tutor = new Tutor("Izabella", "Dudaryk", 25, "brown", "0962223333", 3);
        //System.out.println("новый тьютор " + tutor.getName() + " преподает " + tutor.getAmountOfClassesPerWeek() + " занятий в неделю.");

        Tutor tutor2 = new Tutor("Anna", "Ivanova", 35, "brown", "0962223333", 3);
        //System.out.println(tutor.call(tutor2));

        //System.out.println(firstStudent.call(tutor2));

        //System.out.println(firstStudent.print());
        //System.out.println(firstPerson.print());
        System.out.println(tutor.print());

    }
}


