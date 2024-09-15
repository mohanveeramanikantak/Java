// cheak account savings/current by using if condintion
import java.util.Scanner;
class Account_cheak
{
	public static void main(String args[])		
	{
		int ammount;
		Scanner cheak= new Scanner(System.in);
		System.out.println("enter the ammount");
		int money=cheak.nextInt();
		if(money<=70000)
			System.out.println("Savings");
			System.out.println("current");
	}
}