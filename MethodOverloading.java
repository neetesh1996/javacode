package day2;
//Method overloading-Compile time polymorphism
public class MethodOverloading {
    public static void main(String[] args) {
        MyArithmetic obj=new MyArithmetic();
        int a=obj.add(100, 200);            //Call to add() with 2 integers
        double b=obj.add(100, 200f,300d);    //Call to add() with int, float & double
        int c=obj.add("be", 200);            //Call to last add()
        float d=obj.add(200,400f);
        System.out.println("Sum: "+a);
        System.out.println("Sum: "+b);
        System.out.println("Sum: "+c);
        System.out.println("Sum: "+d);
    }
}
class MyArithmetic{
    int add(int x, int y) {
        return x+y;
    }
    float add(int x, float y) {
        return x+y;
    }
    
    double add(int x, float y, double z) {
        return x+y+z;
    }
    
    int add(String x, int y) {
        return (Integer.parseInt(x)+y);        //parseInt() method of Integer class is used to convert String to int
    }
}