// to print i,j values by using nested while
class Nestedwhile_ijvalues
{
	public static void main(String args[])
	{
		int i,j;
		i=1;
		while(i<3)
		{
			j=1;
			while(j<=3)
			{
				System.out.print("i,j"+j);
				i++; j++;
			}
		}
	}
}