package day2;
//Dynamic method dispatch
public class DynamicMethodDespatch {
    public static void main(String[] args) {
        Bike b=new Ducati(); b.run();
    }
}
class Bike{
    void run(){
        System.out.println("running");
    }
}
class Ducati extends Bike{
    void run(){
        System.out.println("running safely with 100km");
    }
}