// to print java methods empty in data scan assign
import java.util.Scanner;
class Empty_data_scan_assign 
{
	void Institute_name()
	{
		String Institute_name;
		Scanner ui=new Scanner(System.in);
		System.out.println(" enter the Institute_name ");
		String institute_name=ui.next();
		System.out.println(" institute_name is : "+ institute_name);
	}
	public static void main(String args[])
	{
		Empty_data_scan_assign ed=new Empty_data_scan_assign ();
		ed.Institute_name();
	}
}