class Parent 
{
	static int y=5;
}
class Child extends Parent
{
	static int y=10;
}
public class Example2
{
	public static void main(String[] args){
		System.out.println("y="+Child.y);
	}
}