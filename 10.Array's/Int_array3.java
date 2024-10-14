// to print array in int by using data direct assin
class Int_array3
{
	public static void main(String args[])
	{
		int i;
		int [] pen=new int []{0,1,2,3,4,};
		pen [0]=34;
		pen [1]=68;
		pen [2]=136;
		pen [3]=242;
		pen [4]=484;
		System.out.println("pen value is");
		for(i=0; i<=5; i++)
		{
			System.out.println("no.of pens sets : " +pen[i]);
		}
	}
}