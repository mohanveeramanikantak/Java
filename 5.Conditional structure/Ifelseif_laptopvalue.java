// to print a is +ve or -ve
import java.util.Scanner;
class Ifelseif_laptopvalue
{
	public static void main(String args[])
	{
		int laptop;
		Scanner company=new Scanner(System.in);
		System.out.println("enter laptop value");
		int laptops=company.nextInt();
		if(laptops>20)
			System.out.println("laptops is +ve integer");
		else
		if(laptops<20)
			System.out.println("laptops is -ve interger");
		else
			System.out.println("zero");
	}
}
		