package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {

    static double foodCoeff = 0.05;

    Cow() {
        super(AnimalKind.COW, FoodKind.HAY, 0d, foodCoeff);
    }

    Cow(double weight) {
        super(AnimalKind.COW, FoodKind.HAY, weight, foodCoeff);
    }

    //public AnimalKind getKind()
    //    //public FoodKind getFoodKind()


    public static void main(String[] args) {
        Cow animal = new Cow(250);
        System.out.println(animal);
    }

}