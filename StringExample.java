public class StringExample 
{
	public static void main(String[] args){
		String s1="computer";
		String s2="computer";
		String s3=new String("computer");
		System.out.println("Result 1:"+(s1==s2));
		System.out.println("Result 2:"+s1.equals(s2));
		System.out.println("Result 3:"+(s1==s3));
		System.out.println("Result 4:"+s1.equals(s2));
	} 
}