//Polymorphism
//1)Create a base class Animal with a method makeSound(). Create two derived classes Dog and Cat that override the makeSound() method. Illustrate runtime polymorphism by creating objects of both derived classes and invoking the method.

class Animal
{
    public void makesound()
    {
        System.out.println("Barking");
    }
}
class Dog extends Animal{
    public void makesound()
    {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    public void makesound()
    {
        System.out.println("Cat Meow");
    }
}
class Main
{
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        dog.makesound();
        cat.makesound();
    }
}
