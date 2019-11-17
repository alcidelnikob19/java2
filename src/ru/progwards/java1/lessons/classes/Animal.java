package ru.progwards.java1.lessons.classes;
enum AnimalKind {
    ANIMAL,
    COW,
    HAMSTER,
    DUCK
}
class Animal {

    public void getKind() {
        AnimalKind a = AnimalKind.ANIMAL;
        System.out.println(a);
    }
    public static void main(String[] args) {
        Animal a=new Animal();
        a.getKind();

    }


}
