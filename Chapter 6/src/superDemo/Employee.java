package superDemo;

public class Employee
{
	public String name;
	public String address;
	public int SSN;
	public int number;

	public  void mailCheck()
	{
		System.out.println("Inside Employee mailCheck: " + super.toString());
		System.out.println("Mailing a check to " + this.name + " " + this.address);
	}
}