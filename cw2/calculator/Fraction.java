package calculator;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int num, int denom) {
        if (denom == 0) {
            System.out.println("Invalid fraction with denominator 0"); 
	    // this should use exceptions
            return;
        }
        int gcd = myGcd(num, denom);
        setNumerator(num / gcd);
        setDenominator(denom / gcd);
        if(denominator < 0)
        {
        	if(numerator > 0) {
        		setNumerator(numerator * -1);
        		 setDenominator(denominator * -1);
        	}
        }
    }

    @Override
    public String toString() {
        return (getDenominator() != 1) ? "" + getNumerator() + '/' + getDenominator() : Integer.toString(getNumerator());
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int num) {
        denominator = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (getDenominator() != fraction.getDenominator()) return false;
        if (getNumerator() != fraction.getNumerator()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    private int myGcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    
    public int myLcm(int a, int b)
    {
    	int greater;
    	int lesser;
        while (true)
        {
        	if (a > b)
            {
                greater = a; lesser = b;
            }
            else if (a < b)
            {
                greater = b; lesser = a;
            }
            else
            {
                return a;
            }
            for (int iterator = 1; iterator <= lesser; iterator++)
            {
                if ((greater * iterator) % lesser == 0)
                {
                    return iterator * greater;
                }
            }
            return 0;
        }
    }
    
    public Fraction multiply(Fraction other) {

        int num = this.getNumerator() * other.getNumerator();
        int denom = this.getDenominator() * other.getDenominator();
        return new Fraction(num, denom);
    }
    
    public Fraction absValue()
    {
    	return new Fraction(Math.abs(getNumerator()),Math.abs(getDenominator()));
    }
    
    public Fraction negate()
    {
    	if(getNumerator() * getDenominator() < 0) {
    		return new Fraction(Math.abs(getNumerator()),Math.abs(getDenominator()));
    	}
    	else if(getNumerator() * getDenominator() > 0)
    	{
    		return new Fraction(-(getNumerator()),(getDenominator()));
    	}
    	else
    		return new Fraction(0,0);
    }
    
    public Fraction add(Fraction other) {
    	int denom = this.getDenominator();
        if(this.getDenominator() != other.getDenominator()) {
        	denom = myLcm(this.getDenominator(),other.getDenominator());
        }

        int num = ((this.getNumerator() * (denom / this.getDenominator())) + (other.getNumerator() * (denom / other.getDenominator())));
        return new Fraction(num, denom);
    }
    
    public Fraction divide(Fraction other) {

        int num = this.getNumerator() * other.getDenominator();
        int denom = this.getDenominator() * other.getNumerator();
        return new Fraction(num, denom);
    }
    
    public Fraction subtract(Fraction other) {
    	int denom = this.getDenominator();
        if(this.getDenominator() != other.getDenominator()) {
        	denom = myLcm(this.getDenominator(),other.getDenominator());
        }

        int num = ((this.getNumerator() * (denom / this.getDenominator())) - (other.getNumerator() * (denom / other.getDenominator())));
        return new Fraction(num, denom);
    }
}
