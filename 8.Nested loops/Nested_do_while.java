// to print nested do while
class Nested_do_while
{
	public static void main(String Void[])
	{
		int i,j;
		i=1;
		do	
		{
			j=1;
			do
			{
				System.out.println("i"+j);
				i++;
				j++;
			}while(j<=5);
		}while(i<=5);
	}
}