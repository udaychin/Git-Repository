package equals;

public class EqualsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		
		e1.number = 121;
		e2.number = 121;
		e3.number = 121;
		
		if(e1.equals(e2))
		{
			System.out.println("e1 is equal to e2");
		}
		
		if(e1.equals(e3))
			System.out.println("e1 is equal to e3");
		
		if(e1==e2)
		System.out.println("this will not print");
		
	}

	

}
