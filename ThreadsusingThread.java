class A extends Thread
{
	public void run(){
		int i;
for(i=0;i<=10; i++)
System.out.println("i="+i+"Thread A");
	}
}
class B extends Thread
{
	public void run(){
		int i;
for(i=0;i<=10; i++)
System.out.println("i="+i+"Thread B");
	}
}
public class ThreadsusingThread{
	public static void main(String[] args){
		A a1= new A();
		B a2= new B();
		a1.start();
		a2.start();
	}
}