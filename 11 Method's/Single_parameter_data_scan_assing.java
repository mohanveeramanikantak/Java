// to print java methos in single parameter with dara scan assign
import java.util.Scanner;
class Single_parameter_data_scan_assing
{
	void Car(int a)
	{	
				
	}
	public static void main(String args[])
	{
		Scanner amut=new Scanner(System.in);
		System.out.println("enter the a value");
		int a = amut.nextInt();
		System.out.println(" A Value is : " +a);
		Single_parameter_data_scan_assing sps=new Single_parameter_data_scan_assing();
		sps.Car(a=amut.nextInt());
		
	}
}