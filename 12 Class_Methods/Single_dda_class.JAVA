// To Print Class Methods in Single Parameter with Data Direct Assign
class Single_dda
{
	void phone(int blance)
	{
		int Blance=3000;
		System.out.println(" Yearly Blance is : " +blance);
	}
}
class Single_dda_class
{
	public static void main(String args[])
	{
		Single_dda sd=new Single_dda();
		sd.phone(3000);
	}
}