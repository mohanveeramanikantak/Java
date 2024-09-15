// to find first second third ranks in if-ele-if
import java.util.Scanner;
class Rank_find
{
	public static void main(String args[])
	{
		int marks;
		Scanner score=new Scanner(System.in);
		System.out.println("first-70");
		System.out.println("second-50");
		System.out.println("third-35");
		System.out.println("enter the marks");
		int total=score.nextInt();
		if(total>=70)
			System.out.println("first");
		else
		if(total>=50)	
			System.out.println("second");
		else
		if(total>=35)
			System.out.println("third");
		else
			System.out.println("fail");
	}
}
			