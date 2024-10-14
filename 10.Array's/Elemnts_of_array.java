// single dimensioned array example by using scan assign to elements
import java.util.Scanner;
class Elemnts_of_array
{
	public static void main(String args[])
	{
		int i;
		int n;
		Scanner ele=new Scanner(System.in);
		System.out.println("enter the elements");
		int n=ele.next.Int();
		int array=new int[10];
		for(i=0; i<=n; i++)
		{
			array[i]=ele.nextInt();
		}
		System.out.println("array elements are");
		for(i=0; i<=n; i++)
		{
			System.out.println("array[i]");
		}
	}
}	