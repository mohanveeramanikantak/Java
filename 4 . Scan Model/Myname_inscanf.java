// to print a name
import java.util.Scanner;
class Myname_inscanf
{
	public static void main(String args[])
	{
		Scanner idenity=new Scanner(System.in);
		System.out.println("enter a name");
		String name = idenity.next();
		System.out.println(" name is:"+name);
	}
}