package demoParent;

public class Television
{
	public int channel, volume;

	public Television(int c)
	{
		this(c,5);
		System.out.println("Inside Television(int)");
	}

	public Television(int c, int v)
	{
		System.out.println("Inside Television(int, int)");
		channel = c;
		volume = v;
	}
}