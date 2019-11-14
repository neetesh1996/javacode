class A
{
public A()
{System.out.println("A 1");}
}
class B extends A
{
public B()
{ this(3);// call same class constructor
	System.out.println("B 1");}
public B(int x)
{
	System.out.println("B 2");}

}
public class Constructerchaining
{
	public static void main(String[] args){
		B obj= new B();
	}
}