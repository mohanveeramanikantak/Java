// to print array in string
class String_array2
{
	public static void main(String args[])
	{
		char[ ] weeks=new char[]{'S','M','T','W','T','F','S'};
		weeks [0]='S';
		weeks [1]='M';
		weeks [2]='T';
		weeks [3]='W';
		weeks [4]='T';
		weeks [5]='F';
		weeks [6]='S';
		for(int i=0; i<7; i++)
		{
			System.out.println("Today is : "+weeks[i]);
		}
	}
} 