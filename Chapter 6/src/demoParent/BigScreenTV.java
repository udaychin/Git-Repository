package demoParent;

public class BigScreenTV extends Television
{
	public String aspectRatio;
	public short size;

	public BigScreenTV(int channel)
	{
		this("unknown", (short) 40, channel);
		System.out.println("Inside BigScreenTV(int)");
	}

	public BigScreenTV(String r, short s, int channel)
	{
		super(channel);
		System.out.println("Inside BigScreenTV(String, short, int)");
		aspectRatio = r;
		size = s;
	}

	public BigScreenTV(String r, short s, int channel, int volume)
	{
		super(channel, volume);
		System.out.println("Inside BigScreenTV(String, short, int, int)");
		aspectRatio = r;
		size = s;
	}
}