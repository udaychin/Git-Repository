public class RightTriangle extends Shape
{
	private int base, height;

	public RightTriangle(int base, int height)
	{
		this.base = base;
		this.height = height;
	}

	public void draw()
	{
		for(int row = height; row > 0; row--)
		{
			int numToPrint = base -( base/height * row);
			if(row == 1)
				numToPrint = base;
			else if(row == height)
				numToPrint = 1;
			for(int col = 1; col <= numToPrint; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}