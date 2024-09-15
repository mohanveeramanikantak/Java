// to cheak Seniour citizen by using if-else
import java.util.Scanner;
class Seniour_citizen
{
	public static void main(String args[])
	{
		int age;
		Scanner book=new Scanner(System.in);
		System.out.println("enter the age");
		int a=book.nextInt();
		if(a>=60)
			System.out.println("mani");
			System.out.println("eligible");
			System.out.println("because age is less than 60");
		else
			System.out.println("kumar");
			System.out.println(" ineligible");
			System.out.println("because age is grater than 60");
	}
}