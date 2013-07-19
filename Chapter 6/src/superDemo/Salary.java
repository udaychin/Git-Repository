package superDemo;

public class Salary extends Employee
{
	public float salary;	//annual salary

	public float computePay()
	{
		System.out.println("Computing salary pay for " + super.name);
		return salary/52;
	}

	public void mailCheck()
	{
		System.out.println("Inside Salary mailCheck");
		super.mailCheck();
		System.out.println("Mailed check to " + this.name + " with salary " + this.salary);
	}
}