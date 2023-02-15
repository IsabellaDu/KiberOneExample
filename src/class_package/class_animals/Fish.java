package class_package.class_animals;

import java.util.Objects;

public class Fish extends Animals{
    private Boolean isMammal;

    public Fish(String family, String genus, String species, Boolean doesHaveLimbs, Boolean isMammal) {
        super(family, genus, species, doesHaveLimbs);
        this.isMammal = isMammal;
    }

    public Boolean getMammal() {
        return isMammal;
    }

    public void setMammal(Boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public String voice() {
        return super.voice() + ": буль-буль";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fish fish = (Fish) o;
        return Objects.equals(isMammal, fish.isMammal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isMammal);
    }
}
