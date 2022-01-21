import java.io.*;
public class Student2 {

	public static void main(String[] args)throws Exception
	{
		FileInputStream fin1 = new FileInputStream("file1.txt");
		FileInputStream fin2 = new FileInputStream("file2.txt");
		
		FileOutputStream fo = new FileOutputStream("destination.txt");
		
		SequenceInputStream s = new SequenceInputStream(fin1,fin2);
		int b;
		while((b=s.read())!=-1)
		{
			fo.write(b);
		}
		fin1.close();
		fin2.close();
		fo.close();
		s.close();
	}

}
