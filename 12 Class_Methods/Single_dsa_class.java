// To Print Class Methods in Single parameter with data dirct assign
import java.util.Scanner;
class Single_dsa
{
	void car(int value)
	{ 
	}
}
class Single_dsa_class
{
	public static void main(String args[])
	{
		
		Scanner soft=new Scanner(System.in);
		System.out.println(" Enter the car value : ");
		int values=soft.nextInt();
		System.out.println(" car value is : " +values);
		Single_dsa sd=new Single_dsa();
		sd.car(values=soft.nextInt());
	}
}