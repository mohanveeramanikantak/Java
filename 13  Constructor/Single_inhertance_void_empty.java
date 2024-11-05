// To Print Single Inhertance With void in Empty Statement
class Single_inhertance_void_empty
{
	public:
	void p_value()
	{
		System.out.println("HAUSER XO");
	}
};
class Book: extends Single_inhertance_void_empty
{
	public:
	void b_value()
	{
		System.out.println("CLASSMATE");
	}
};
void main()
{
	Book b;
	b.p_value();
	b.B_value();
}