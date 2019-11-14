package pak3;
public class Example1
{
	public static void main(String[] args)
	{
		Student1 s1=new Student1();
		s1.setRollno(100);
		s1.setName("Neetesh");
		s1.setAge(19);
		
		System.out.println("Rollno:"+s1.getRollno());
		System.out.println("Name:"+s1.getName());
		System.out.println("Age:"+s1.getAge());
	}
}