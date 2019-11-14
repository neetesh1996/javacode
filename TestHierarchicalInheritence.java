package day2;
//Hierarchical inheritance
public class TestHierarchicalInheritence {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.bark();
        
        Cat cat=new Cat();
        cat.eat();
        cat.meow();
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
class Cat extends Animal{
    void meow(){
        System.out.println("meowing...");
    }
}