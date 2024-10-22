// to pritn java methods in return method with empty in data direct assign
class Return_empty_dda
{
	void colours()
	{
		int colours =3;
		System.out.println(" no_colours : 3");
	}
	int no_colours()
	{
		return 3;
	}
	public static void main(String arga[])
	{
		Return_empty_dda re=new Return_empty_dda();
		re.colours();
	}
}