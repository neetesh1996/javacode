package day2;
//Demo of setters/getters (encapsulation)
public class DemoEncapsulation {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setId(1);
        emp.setName("Tom");
        emp.setSalary(12345);
        System.out.println("ID: "+emp.getId());
        System.out.println("Name: "+emp.getName());
        System.out.println("Salary: $"+emp.getSalary());
    }
}
class Employee{
    private int id;
    private String name;
    private float salary;
    
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }
    public float getSalary(){
        return salary;
    }
}
