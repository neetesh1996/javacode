import java.io.*;
public class File1
{
	public static void main(String[]args) throws IOException
	{
		File f1=new File("e:/coding/java/name.txt");
		f1.createNewFile();
		System.out.println("Is Exist:"+f1.exists());
		System.out.println("length of file:"+f1.length());
		System.out.println("File name:"+f1.getName());
		System.out.println("can file read:"+f1.canWrite());
		//f1.delete();

	}
}