package polymorphism;

public class InstanceOfDemo
{
	public static void main(String [] args)
	{
		Employee h = new Hourly("Abe Lincoln", "Springfield, IL", 16, 8.00);
		System.out.println(h.getName() + " " + h.getNumber());

		if(h instanceof Salary)
		{
			System.out.println("Casting to a Salary reference");
			Salary x = (Salary) h;
			System.out.println("Pay = " + x.computePay());
			x.mailCheck();
		}
		else if(h instanceof Hourly)
		{
			System.out.println("Casting to an Hourly reference");
			Hourly x = (Hourly) h;
			x.setHoursWorked(80);
			System.out.println("Pay = " + x.computePay());
			x.mailCheck();
		}

		System.out.println("\nDeliberately cast to the wrong type");
		Salary s = (Salary) h;
		s.computePay();
		s.mailCheck();
		System.out.println("End of main");
	}
}