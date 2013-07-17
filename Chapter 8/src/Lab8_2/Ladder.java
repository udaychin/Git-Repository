public class Ladder extends Shape
{
	private int rungs;

	public Ladder(int r)
	{
		setRungs(r);
	}

	public void setRungs(int r)
	{
		if(r >= 1 && r <= 10)
		{
			rungs = r;
		}
		else
		{
			rungs = 1;
		}
	}

	public int getRungs()
	{
		return rungs;
	}
	
	public void draw()
	{
		for(int row = 1; row <= 4; row++)
		{
			for(int col = 1; col <= rungs * 5; col++)
			{
				if(row == 1 || row == 4)
					System.out.print("*");
				else if((col-3)%5 == 0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}