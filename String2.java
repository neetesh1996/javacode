public class String2
{
	public static void main(String[] args){
		String s1=new String("Computer");
		String s4=new String("computer");
		//System.out.println(s1);
		//String s2=s1.toUpperCase();
		//System.out.println(s2);
		//int i=s1.lastIndexOf("mp",1);// start from last searching result -1
		//int i=s1.indexOf("ute",1);// strat to searchind index 1
		//  System.out.println("index is "+i);
		//if (s1.equals(s4)) // case sensitive coparision
		//if(s1.equalsIgnoreCase(s4))// not case sensitive coparision
		/*int i=s1.compareTo(s4);
		if(i==0)

			System.out.println("strings are same");
		else if(i>0)
			System.out.println("opposite to dictionary order");
			else
            System.out.println(" dictionary order");*/
           String i=s1.substring(2,3);
		
              System.out.println(i);
	}
}