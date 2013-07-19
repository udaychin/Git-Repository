package toStringDemo;
public class Radio
{
	public int volume;
	public double channel;
	public char band;

	public Radio(int v, double c, char b)
	{
		volume = v;
		channel = c;
		band = b;
	}
	
	public Radio() {
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		System.out.println("Inside toString");
		String s = "Radio Volume " +volume+ " Channel " +channel+ " band " +band; 
	    return s;
		
	}
}