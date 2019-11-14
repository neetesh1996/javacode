package day2;
//Single inheritence
public class TestSingleInheritence {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.bark();
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