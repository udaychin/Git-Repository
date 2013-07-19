package inheritanceDemo;
public class InheritDemo
{
	public static void main(String [] args)
	{
		System.out.println("Instantiating an Employee");
		Employee e = new Employee();
		e.name = "Robert Smith";
		e.address = "111 Java Street";
		e.SSN = 999001111;
		e.number = 1;

		System.out.println("Instantiating a Salary");
		Salary s = new Salary();
		s.name = "Uday Kanth Chintala";
		s.address ="518 Pine Garden Ln Apt # D";
		s.number = 2;
		s.SSN = 51099900;
		s.salary = 20000002.19F;
		
		
		Salary s1 = new Salary();
		s1.name = "Jane Smith";
		s1.address = "222 Oak Drive";
		s1.SSN = 111009999;
		s1.number = 3;
		s1.salary = 100000.00F;
		
		System.out.println("Instantiating Part time Employee:");
		PartTimeSalary pt = new PartTimeSalary();
		pt.name = "Pooja Sharma";
		pt.address = "222 Oak Drive";
		pt.SSN = 111011119;
		pt.number = 5;
		pt.salary = 100000.00F;
		pt.hoursWorked = 80;
		
		System.out.println("Hours worked by part time employee "+pt.name+" " +pt.getHoursWorked());
		
		
		


		System.out.println("Instantiating an Hourly");
		Hourly h = new Hourly();
		h.name = "George Washington";
		h.address = "333 Espresso Lane";
		h.SSN = 111990000;
		h.number = 4;
		h.hourlyRate = 10.00F;
		h.hoursWorked = 50;

		System.out.println("Paying employees");
		//e.computePay();	//does not compile!
		System.out.println(s.number+" "+s.computePay());
		System.out.println(s1.number + " " + s1.computePay());
		System.out.println(h.number + " " + h.computePay());
		System.out.println(pt.number + " " + pt.computePay());
		
		System.out.println("Mailing checks");
		e.mailCheck();
		s.mailCheck();
		s1.mailCheck();
		h.mailCheck();
		pt.mailCheck();
		System.out.println(s1.toString());
		System.out.println(s1);
	}
}