package class_package.class_animals;

public class Main {
    public static void main(String[] args) {
        Fish firstFish = new Fish("Помацентровые", "Рыбы-клоуны", "Рыба-клоун", false, false);
        Fish secondFish = new Fish("Помацентровые", "Рыбы-клоуны", "Рыба-клоун", false, false);


        Cat secondCat = new Cat("Помацентровые", "Рыбы-клоуны", "Рыба-клоун", false);

        System.out.println(firstFish.equals(secondFish));

        System.out.println("cat".equals("cat"));
    }
}
