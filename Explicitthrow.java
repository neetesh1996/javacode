import java.util.*;
class Explicitthrow
{
	public static void main(String[] args){
		int balance=500;
		System.out.println("withdrawAmount ");
		Scanner s1=new Scanner(System.in);
		int withdrawAmount=s1.nextInt();
		//int withdrawAmount=60;
		try{
		if (balance < withdrawAmount) 
		throw new ArithmeticException("Insuficient balance");

			balance=balance-withdrawAmount;
			System.out.println("Transation has been successfully completed");
			System.out.println("balance remaining "+balance);
		}
		catch(ArithmeticException e){
			System.out.println("Exception"+e.getMessage());
		}
    System.out.println("Program continue....");
		
	}
}