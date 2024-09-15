// to cheak voter eligible by using if-else
import java.util.Scanner;
class Voter_eligible
{
	public static void main(String args[])
	{
		int age;
		Scanner info=new Scanner(System.in);
		System.out.println("enter the age");
		int a= info.nextInt();
		if(a>=18)
			
			System.out.println("eligible");
		else
		if(a<=18)
			System.out.println("not eligible");
	}
}
