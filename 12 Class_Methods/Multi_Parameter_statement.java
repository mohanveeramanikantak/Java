// To Print Class Methods In Multi parameter with Statement
class Multi_sst
{
	void jack(int lap,int pen)
	{
		System.out.println("*** ``````` ***");
		System.out.println("lap is : 40000");
		System.out.println("pen is : 100");
	}
}
class Multi_Parameter_statement
{
	public static void main(String args[])
	{
		Multi_sst ms=new Multi_sst();
		ms.jack(40000,100);
	}
}