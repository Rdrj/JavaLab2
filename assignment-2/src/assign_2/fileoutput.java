package assign_2;
import java.io.FileWriter;
import java.util.*;
public class fileoutput
{
	public void output(List<String>dictionary,List<String>keywords)
	{
		try
		{

			FileWriter fw=new FileWriter("//home//rdrj-hunt//Java Lab//csx-351-hw2-Rdrj-master//HW2-output.txt",true);
			int c=0;
			for(String str: keywords)
			{
				if(!dictionary.contains(str))
				{
					c++;
					fw.write("Keyword not found = " + str +"\n");
				}
			}
			fw.write("Number of keywords not found = "+ c+"\n");
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
