package ru.progwards.java1.lessons.classes;
//enum AnimalKind {
//    ANIMAL,
//    COW,
//    HAMSTER,
//    DUCK
//}
//enum FoodKind {
//    UNKNOWN,
//    HAY,
//    CORN
//}
//
//class Animal {
//
//    public void getKind() {
//        AnimalKind a = AnimalKind.ANIMAL;
//        System.out.println(a);
//    }
//
//class FoodK{
//
//      public void getFoodKind() {
//            FoodKind f = FoodKind.UNKNOWN;
//            System.out.println(f);
//        }
//
//public static void main(String[] args) {
//      Animal a = new Animal();
//      a.getKind();
//
//      FoodK f1 = new FoodK();
//      f1.getFoodKind();
//
//    }
//}
//
//}
public class Animal {

    static enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}
    static enum FoodKind {UNKNOWN, HAY, CORN}

    private AnimalKind animalKind = AnimalKind.ANIMAL;
    private FoodKind foodKind = FoodKind.UNKNOWN;

    private double weight = 1d; // вес животного
    double foodCoeff = 0.02; // коэффициент веса еды к весу тела животного

    Animal() {
    }

    Animal(double weight) { // не нужный объект, когда не задан тип животного
        this.weight = weight;
    }

    Animal(AnimalKind animalKind, FoodKind food, double weight, double foodCoeff) {
        this.animalKind = animalKind;
        this.foodKind = food;
        this.weight = weight;
        this.foodCoeff = foodCoeff;
    }

    public AnimalKind getKind() {
        return animalKind;
    }

    public FoodKind getFoodKind() {
        return foodKind;
    }

    public String toStringFull() {
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }

    public double getWeight() {
        return weight;
    }

    void setFoodCoeff(double foodCoeff) {
        this.foodCoeff = foodCoeff;
    }
    public double getFoodCoeff() {
        return foodCoeff;
    }
    public double getCoeff() {
        return foodCoeff;
    }

    // рассчитывает необходимый вес еды, по формуле - вес-еды = вес-животного * коэффициент веса тела
    public double calculateFoodWeight() {
        return getWeight() * getFoodCoeff();
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);
    }

}