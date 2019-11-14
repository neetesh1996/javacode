interface I1
{void f1();}
interface I2
{void f2();}
class A implements I1,I2
{   
	public void f1(){System.out.println("f1");}
  public void f2(){System.out.println("f2");}
   public void f3(){System.out.println("f3");}

}
class Interface{
	public static void main(String[] args){
		I1 obj=new A();
		obj.f1();
		obj.f2();//error
		obj.f3();// error
	}
}

