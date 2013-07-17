package polymorphism;

public class CastDemo
{
	public static void main(String [] args)
	{
		Salary s = new Salary("George Washington", "Valley Forge, DE", 1, 5000.00);
		System.out.println(s.getName() + " " + s.computePay());

		Employee e = new Salary("Rich Raposa", "Rapid City, SD", 38, 250000.00);
		System.out.println(e.getName());

		//e.computePay();	//does not compile!
		Salary f = (Salary) e;
		System.out.println(f.getName() + " " + f.computePay());

		s.mailCheck();
		e.mailCheck();
		f.mailCheck();
	}
}