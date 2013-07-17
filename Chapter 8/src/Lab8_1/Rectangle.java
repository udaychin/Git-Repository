public class Rectangle extends Shape
{
	private int width, height;

	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	public void draw()
	{
		for(int row = 1; row <= height; row++)
		{
			for(int col = 1; col <= width; col++)
			{
				if(row == 1 || row == height)
					System.out.print("*");
				else if(col == 1 || col == width)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}