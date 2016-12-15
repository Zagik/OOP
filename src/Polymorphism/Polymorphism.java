package Polymorphism;

/**
 * Created by Zahakaylo on 10.12.2016.
 */
class Animal {
    String voice;
    Animal(String v)
    {
        voice = v;
    }

}

class Dog extends Animal {
    Dog (String voice)
    {
        super(voice);
    }


}

class Cat extends Animal{
    Cat (String voice)
    {
        super(voice);
    }
}

class Frog extends Animal{
    Frog (String voice)
    {
        super(voice);
    }
}

public class Polymorphism
{


    public static void main(String[] args) {
        Animal dog = new Dog("Гав");
        System.out.println(dog.voice);
        Animal cat = new Cat("Мяв");
        System.out.println(cat.voice);
        Animal frog = new Frog("Ква");
        System.out.println(frog.voice);

    }
}
