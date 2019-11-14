import java.util.*;
import java.lang.*;
import java.io.*;
class Array1
{
public static void main(String[] args)  {
	int []arr=new int[5];
	 Scanner sc= new Scanner(System.in);
	System.out.print("Enter 5 numbers");
	for (int i=0;i<5 ;i++ ) 
		arr[i]=sc.nextInt();
try{
	for (int i=4;i>=0 ;i--) 
		System.out.print(+arr[i]" ");
	
}
catch(ArrayIndexOutOfBoundsException e){
	
System.out.println("Exception:"+e.getMessage());
}
//System.out.print(+arr[i]);
}
}