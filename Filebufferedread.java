import java.io.*;
class Filebufferedread{
	public static void main(String[] args) throws IOException {
		//int ch;
		
	BufferedReader bf = new BufferedReader(new FileReader("name1.txt"));
		/*String s1;
		while((s1=bf.readLine())!=null)// readline() use
			System.out.println(s1);*/
			char []s= new char[20];
			bf.read(s,1,15);
			System.out.println(s);
		
		bf.close();
	}
}