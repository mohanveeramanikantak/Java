// array example by using data direct assign
class Array_example1
{
	public static void main(String args[])
	{
		int i;
		int [] num=new int []{0,1,2,3,4,};
		num [0]=10;
		num [1]=20;
		num [2]=30;	
		num [3]=40;
		num [4]=50;
		System.out.println("array is");
		for(i=0; i<=5; i++)
		{
			System.out.println("i"+num[i]);
		}
	}
}

