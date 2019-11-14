package day2;
//Multilevel inheritance
public class TestMultilevelInheritence {
    public static void main(String[] args) {
        BabyDog dog=new BabyDog();
        dog.eat();
        dog.bark();
        dog.weep();
    }
}
class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping...");
    }
}