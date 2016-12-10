package Polymorphism;

/**
 * Created by Zahakaylo on 10.12.2016.
 */
class Animal {
    public void voice() {
        //Пустий
    }

}

class Dog extends Animal {
    public void voice(){
        System.out.println("Гав");
    }
}

class Cat extends Animal{
    public void voice() {
        System.out.println("Мяв");
    }
}

class Frog extends Animal{
    public void voice() {
        System.out.println("Ква");
    }
}

public class Polymorphism
{
    

    public static void main(String[] args) {
        Animal[] a = new Animal[]{new Cat(),
                new Dog(),
                new Frog(),
                new Animal()}; // Пусто

        for(int i = 0; i < a.length; i++) {
            a[i].voice();
        }
    }
}
