import java.util.Scanner;
class Account{
	private int bal;
	public Account(int bal)
	{this.bal=bal;}
	public boolean isSufficientBalance(int w){
		if(bal>w)
			return(true);
		else
			return(false);
	}
	public void withdraw(int amt){
		bal=bal-amt;
		System.out.println("withdraw money is "+amt);
		System.out.println("Your current balance is "+bal);
	}
}
class Custometr implements Runnable
{
	private String name;
	private Account account;
	public Custometr(Account account,String n)
	{this.account=account;
	 name=n;}
	public void run(){
		Scanner kb=new Scanner(System.in);
		
		//String name=kb.nextLine();
         synchronized(account){
         	System.out.println( name+",Enter ammount to withdraw");
		    int amt=kb.nextInt();
		if (account.isSufficientBalance(amt))
		{
			
			System.out.println(name);
			account.withdraw(amt);
		}
		else{
           System.out.println("Insufficient balance");
		}
		}  
	}
}
public class Threadsychronizing
{
	public static void main(String[] args){
		Account a1=new Account(1000);
		Custometr c1=new Custometr(a1,"ram"),c2=new Custometr(a1,"vimal");
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();
	}
}