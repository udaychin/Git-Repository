package abstractmethods;

public class PayEmployees
{
	public static void main(String [] args)
	{
		Salary s = new Salary("Thomas Jefferson", "Monticello, VA", 3, 2600.00);

		Hourly h = new Hourly("John Adams", "Boston, MA", 2, 2.50);
		h.setHoursWorked(40);

		Contractor c = new Contractor("M. Mouse", "Anaheim, CA", 44, 1000.00);
		c.setDaysWorked(5);

		SmartBoss boss = new SmartBoss();

		boss.payEmployee(s);
		boss.payEmployee(h);
		boss.payEmployee(c);
	}
}