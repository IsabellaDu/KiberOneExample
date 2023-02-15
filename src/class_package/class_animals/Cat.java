package class_package.class_animals;

public class Cat extends Animals {

    public Cat(String family, String genus, String species, Boolean doesHaveLimbs) {
        super(family, genus, species, doesHaveLimbs);
    }

    @Override
    public String voice() {
        return super.voice() + ": мяу";
    }
}
