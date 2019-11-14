public class Echo
{
	 public static void main(String[] args) {
	 	int s=0;
	 	for(int i=0; i<args.length; i++)
	 	//System.out.println(args[i]);
	 		s=s+Integer.parseInt(args[i]);
	 	System.out.println("sum is "+s);
		
	}
}