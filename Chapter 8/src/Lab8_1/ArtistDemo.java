public class ArtistDemo
{
	public static void main(String [] args)
	{
		Shape s = new Shape();
		Rectangle r = new Rectangle(7,3);
		RightTriangle t = new RightTriangle(8,4);

		Artist artist = new Artist();
		artist.drawShape(s);
		artist.drawShape(r);
		artist.drawShape(t);
	}
}