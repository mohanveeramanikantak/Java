// to print Constructor in empty in data direct assign
class Student
{
	Student()
	{
		String Name="Manikanta";
		String Son_of="Srinivasu";
		String Rolno="PRG1954";
		int Total=450;
		System.out.println(" Name is  	: " +Name);
		System.out.println(" Son_of is  : " +Son_of);
		System.out.println(" Rolno is 	: " +Rolno);
		System.out.println(" Total is 	: " +Total);
	}
}
class Empty_dda
{
	public static void main(String args[])	
	{
		Student s=new Student();
		Student S;
	}
}