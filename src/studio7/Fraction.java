package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator)
	{
		this.numerator=numerator;
		this.denominator=denominator;
		
	}
	
	public Fraction Mult (Fraction other)
	{
		int newNumerator = this.numerator*other.numerator;
		int newDenominator = this.denominator*other.denominator;
		Fraction ThirdFraction = new Fraction(newNumerator, newDenominator);
		return ThirdFraction;
	}
	public Fraction Sum (Fraction other)
	{
		int newNumerator = this.numerator*other.denominator;
		int newDenominator = this.denominator*other.denominator;
		int otherNumerator = other.numerator*this.denominator;
		Fraction newFraction = new Fraction(newNumerator+otherNumerator, newDenominator);
		return newFraction;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction FirstFraction = new Fraction(3,4);
		Fraction SecondFraction = new Fraction (2,3);
		Fraction f3 = FirstFraction.Mult(SecondFraction);
		//System.out.println(f3.numerator+"/"+f3.denominator);
		System.out.println(f3.toString());
		System.out.println((FirstFraction.Sum(SecondFraction)).toString());
	}

	@Override
	public String toString() {
		return "Fraction [numerator=" + numerator + ", denominator=" + denominator + "]";
	}

}
