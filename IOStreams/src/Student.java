import java.io.*;
public class Student {

	public static void main(String[] args)throws Exception
	{
		FileInputStream fin = new FileInputStream("file1.txt");
		FileOutputStream fo = new FileOutputStream("file2.txt");
		
		int b;
		while((b=fin.read())!=-1)
		{
			if(b>=65 && b<=90)
				fo.write(b+32);
			else
				fo.write(b);
		}
		fin.close();
		fo.close();
	}

}
