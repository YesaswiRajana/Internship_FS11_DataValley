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
        System.out.println("Barking");
    }
}
class Cat extends Animal{
    public void makesound()
    {
        System.out.println("Barking");
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
