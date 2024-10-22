// to print java methods by using return method in single parameter in statement
class Return_single_statement
{
	void keyboard(int ticket)
	{
		System.out.println(" tickets(2) ");
	}
	int ticket(int tickets)
	{
		return tickets*tickets;
	}
	public static void main(String args[])
	{
		Return_single_statement rss=new Return_single_statement();
		rss.keyboard(2);
	}
}