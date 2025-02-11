package models;

public class Animal {
    private final String nom;
    private final  TypeAnimal animal;
    
    public Animal(String nom, TypeAnimal animal) {
        this.nom = nom;
        this.animal = animal;
    }
    public String getNom() {
        return nom;
    }
    public TypeAnimal getAnimal() {
        return animal;
    }


}
