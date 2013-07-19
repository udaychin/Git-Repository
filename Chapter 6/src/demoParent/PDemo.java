package demoParent;

public class PDemo
{
	public static void main(String [] args)
	{
		
		
		System.out.println("*** big screen #1 ***");
		int channel = 4;
		new BigScreenTV(channel);

		short size = 53;
		channel = 3;
		String ratio = "16:9";
		System.out.println("\n*** big screen #2 ***");
		new BigScreenTV(ratio, size, channel);

		ratio = "5:4";
		size = 42;
		channel = 4;
		int volume = 7;
		System.out.println("\n*** big screen #3 ***");
		new BigScreenTV(ratio, size, channel, volume);
	}
}