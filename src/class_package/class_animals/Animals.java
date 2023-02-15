package class_package.class_animals;

import java.util.Objects;

public class Animals implements Voiceable{
    private String family;
    private String genus;
    private String species;
    private Boolean doesHaveLimbs;

    public Animals(String family, String genus, String species, Boolean doesHaveLimbs) {
        this.family = family;
        this.genus = genus;
        this.species = species;
        this.doesHaveLimbs = doesHaveLimbs;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Boolean getDoesHaveLimbs() {
        return doesHaveLimbs;
    }

    public void setDoesHaveLimbs(Boolean doesHaveLimbs) {
        this.doesHaveLimbs = doesHaveLimbs;
    }

    @Override
    public String voice() {
        return "Я умею издавать звуки";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(family, animals.family) && Objects.equals(genus, animals.genus) && Objects.equals(species, animals.species) && Objects.equals(doesHaveLimbs, animals.doesHaveLimbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, genus, species, doesHaveLimbs);
    }
}
