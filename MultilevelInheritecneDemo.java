// MultilevelInheritecneDemo.java
import java.io.*;
class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog can bark");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("BabyDog can weep");
    }
}
public class MultilevelInheritecneDemo{
    public static void main(String[] args){
        BabyDog bd=new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
