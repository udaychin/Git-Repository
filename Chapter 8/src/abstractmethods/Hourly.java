package abstractmethods;

public class Hourly extends Employee
{
	private double hourlyRate, hoursWorked;

	public Hourly(String name, String address, int number, double hourlyRate)
	{
		super(name, address, number);
		setHourlyRate(hourlyRate);
	}

	public double getHourlyRate()
	{
		return hourlyRate;
	}

	public void setHourlyRate(double newRate)
	{
		if(newRate >= 0.0 && newRate <= 200.00)
		{
			hourlyRate = newRate;
		}
	}

	public double getHoursWorked()
	{
		return hoursWorked;
	}

	public void setHoursWorked(double h)
	{
		if(h >= 0 && h <= 80)
		{
			hoursWorked = h;
		}
	}

	public double computePay()
	{
		System.out.println("Computing hourly pay for " + getName());
		if(hoursWorked <= 40)
		{
			return hourlyRate * hoursWorked;
		}
		else
		{
			return hourlyRate * 40.0 + hourlyRate * 1.5 * (hoursWorked - 40);
		}
	}
}