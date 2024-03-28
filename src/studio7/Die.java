package studio7;

public class Die {
	private int sides;
	
	public Die(int initsides)
	{
		this.sides = initsides;
	}
	
	public int Roll()
	{
		return (int) (Math.random()*(sides)+1);
	}
	
	public static void main(String[] args) {
		Die FirstDie = new Die(1);
		System.out.println(FirstDie.toString());
	}

	@Override
	public String toString() {
		return "Die [sides=" + sides + "]";
	}
	
} 
