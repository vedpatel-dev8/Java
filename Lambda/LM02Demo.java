interface MyCal
{
	int Cal(int a, int b);
}

class LM02Demo
{
	public static void main(String [] args)
	{
		MyCal add = (a,b) -> a+b;
		System.out.println("Add: " + add.Cal(5,10));

		MyCal sub = (a,b) -> a-b;
		System.out.println("Sub: " + sub.Cal(3,4));

		MyCal mul = (a,b) -> a-b;
		System.out.println("Mul: " + mul.Cal(2,3));

		MyCal Maxv = (a,b) -> 
		{
			if(a>b)
				return a;
			else
				return b;
		};
		System.out.println("Max Value: " + Maxv.Cal(5,6));
	}
}