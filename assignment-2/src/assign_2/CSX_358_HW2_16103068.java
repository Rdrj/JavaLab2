package assign_2;
import java.io.*;
import java.util.Scanner;
import java.util.*;
public class CSX_358_HW2_16103068
{
	public static void main(String[] args)throws Exception
	{
		long startTime=System.nanoTime();
		File file=new File("//home//rdrj-hunt//Java Lab//csx-351-hw2-Rdrj-master//HW2-dictionary.txt");
		List<String> dictionary =new ArrayList<String>();
		Scanner sc =new Scanner(file);
		String s;
		while(sc.hasNextLine())
		{
			s=sc.nextLine();
			dictionary.add(s);
		}
		sc.close();
		
		File file1=new File("//home//rdrj-hunt//Java Lab//csx-351-hw2-Rdrj-master//HW2-keywords.txt");
		List<String> keywords =new ArrayList<String>();
		Scanner xc=new Scanner(file1);
		String x;
		while(xc.hasNextLine()) 
		{
			x=xc.nextLine();
			keywords.add(x);
		}
		xc.close();
		Collections.sort(dictionary);
		Collections.sort(keywords);
		//Output file will search a particular keyword in the dictionary file
	    fileoutput fo=new fileoutput();
	    fo.output(dictionary,keywords);
	    long endTime=System.nanoTime();
	    long totalTime=endTime-startTime;
	    System.out.println("Total time taken : "+ totalTime+"ns");
	}
}
