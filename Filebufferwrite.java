import java.io.*;
public class Filebufferwrite{
	public static void main(String[]args) throws IOException{
		FileWriter fw=new FileWriter("name1.txt");
		BufferedWriter bf= new BufferedWriter(fw);
		bf.write("hello i am");
		bf.close();
	}
}