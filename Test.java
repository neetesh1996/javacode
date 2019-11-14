public class Test
{
	/*private int x;
	{System.out.println("Initialization:x="+x);
	x=5;
   }
   public Test()
   {System.out.println("Constructer:x="+x);}
   public static void main(String[] args){
   	Test t1=new Test();
   	Test t2=new Test();
   } */
   private static int x;
   static
   {System.out.println("static:x="+x);
    x=100;
}
 public static void main(String[] args) {
	Test t1=new Test();
	Test t2=new Test();
}
}