interface GetValueInterface
{
	double getValue();
}

class LM01Demo
{
	public static void main(String [] args)
	{
		GetValueInterface gvi = () -> 1.25;
	
		double x = gvi.getValue();

		System.out.println("x: " + x);
	}
}