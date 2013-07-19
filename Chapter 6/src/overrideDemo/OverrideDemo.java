package overrideDemo;

//import toStringDemo.Radio;

public class OverrideDemo
{
	public static void main(String [] args)
	{
		Radio radio = new Radio();
		System.out.println("toString returns " + radio.toString());

		//System.out.println("Just printing the reference: " + radio);
		
		ChildRadio cr = new ChildRadio();
		System.out.println("toString returns " + cr.toString());
		
		overrideDemo.Radio r = new ChildRadio( );
		
		ChildRadio crd = (ChildRadio) r;
		
		crd.toString();
		r.toString();
	}
}