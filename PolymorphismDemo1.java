import java.io.*;
class Animal {
    public void animalSound(){
        System.out.println("An animal can make a sound");
    }
}
class Cow extends Animal{
    public void animalSound(){
        System.out.println("A cow says 'MAA'");
    }
}
class Cat extends Animal{
    public void animalSound(){
        System.out.println("A cat says 'MEOW'");
    }
}
public class PolymorphismDemo1{
    public static void main(String args[]){
        Animal myanimal = new Animal();
        Animal mycow = new Cow();
        Animal mycat = new Cat();
        myanimal.animalSound();
        mycow.animalSound();
        mycat.animalSound();
        
    }
}
