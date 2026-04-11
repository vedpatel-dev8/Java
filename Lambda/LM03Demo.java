interface NumericalTest
{
	Boolean test(int n);
}

class LM03Demo
{
	public static void main(String [] args)
	{
		NumericalTest isEven = (n) -> n%2 == 0;
	
		System.out.println("ISEven: " + isEven.test(10));

		NumericalTest isPrime = (n) ->
		{
			for(int i = 2; i<n/2; i++)
				if(n%i == 0)
					return false;
			return true;
		};
		System.out.println("IsPrime: " + isPrime.test(15));
	}
}