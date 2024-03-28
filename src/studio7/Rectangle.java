package studio7;

public class Rectangle {

	private int width;
	private int length;
	
	public Rectangle(int intWidth, int intLength)
	{
		this.width = intWidth;
		this.length = intLength;
	}
	
	public boolean isSquare()
	{
		if (length==width)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public int area()
	{
		return length*width;
	}
	
	public int perimeter()
	{
		return 2*length+2*width;
	}
	
	public static void main(String[] args) {
		
	Rectangle r1 = new Rectangle(4, 5);
	Rectangle r2 = new Rectangle(6,6);
	System.out.println(r1.isSquare()); 
	System.out.println(r2.isSquare());
	System.out.println(r1.area());
	System.out.println(r1.perimeter());
	
	if (r1.area()>r2.area())
	{
		System.out.println("r1 is bigger than r2");
	}
	else if (r2.area()>r1.area())
	{
		System.out.println("r2 is bigger than r1");
	}
	else
	{
		System.out.println("r1 and r2 are the same size");
	}
	}

}

