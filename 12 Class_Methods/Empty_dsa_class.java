// to print class method in empty data direct assign
import java.util.Scanner;
class pen_value
{
	void rate()
	{
		String Car;
		Scanner cost=new Scanner(System.in);
		System.out.println(" enter the car value ");
		String car=cost.next();
		System.out.println(" car Value is : " +car);
	}
}
class Empty_dsa_class
{
	public static void main(String args[])
	{
		pen_value pv=new pen_value();
		pv.rate();
