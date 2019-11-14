package day2;
//Aggregation
public class TestAggregation {
    public static void main(String[] args) {
        Address address=new Address("Mumbai","Maharashtra","India");
        Date date=new Date(10,11,2019);
        Employee emp=new Employee(1,"Prasad",address,date);
        emp.display();
    }
}
class Address {
    String city,state,country;
    public Address(String city, String state, String country){
        this.city= city;
        this.state= state;
        this.country= country;
    } 
}
class Date{
    int day,month,year;
    public Date(int day, int month, int year) {
        this.day=day;
        this.month=month;
        this.year=year;
    }
}
class Employee {
    int id; 
    String name; 
    Address address;
    Date doj;
    public Employee(int id, String name,Address address, Date doj){
        this.id = id;
        this.name = name;
        this.address=address;
        this.doj=doj;
    }
    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
        System.out.println(doj.day+"-"+doj.month);
    }
}