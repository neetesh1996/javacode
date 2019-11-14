class Uncheckedexception1
{
	public static void main(String[] args){
		try{
			System.out.println("Hello12");
			System.out.println(5/0);
			System.out.println("In try");

		}catch(NullPointerException e){
			System.out.println("Exception:"+e.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println("Exception:"+e.getMessage());
		}
     System.out.println("Hello");
	}
}