package overrideDemo;

public class ChildRadio extends Radio {
	
	
	
	public ChildRadio() {
				super(5,6.0,'b');
				
				
	}

	public String toString()
	{
		System.out.println("Inside ChildRadio toString");
		System.out.println(super.toString());
		String rep = "Uday Radio volume = " + volume + ", channel = " + channel + " and band = " + band;
		return rep;
	}

}
