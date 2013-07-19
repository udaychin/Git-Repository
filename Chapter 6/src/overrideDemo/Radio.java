package overrideDemo;

public class Radio
{
	public int volume;
	public double channel;
	public char band;
	
	public Radio()
	{
		
	}

	public Radio(int v, double c, char b)
	{
		volume = v;
		channel = c;
		band = b;
	}

	@Override
	public String toString() {
		return "Radio [volume=" + volume + "]";
	}

	
	
	

}