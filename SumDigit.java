 class SumDigit
{
	static int sum(int n)
	{
		if(n==0)
			return 0;
		return n%10+sum(n/10);

	}
	public static void main(String args[])
	{
		int n=5271;
		int c=sum(n);
		System.out.println(c);
	}
}