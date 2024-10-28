// To Print Class Methods in Multi Parameter With Data Direct Assign
class Multi_dda
{
	void phone(int Blance, int phcost)
	{
		int Blances=3200;
		int phcosts=18500;
		System.out.println(" Yearly Blance is : " +Blances);
		System.out.println(" Phone Cost is    : " +phcosts);
	}
}
class Multi_parameter_dda
{
	public static void main(String args[])
	{
		Multi_dda md=new Multi_dda();
		md.phone(3200,18500);
	}
}