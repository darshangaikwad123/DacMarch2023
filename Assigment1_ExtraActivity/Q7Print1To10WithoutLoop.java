class Q7{
	public static void Number(int n)
	{
		if(n<10)
		{
			System.out.println(n);
			 Number(n+1);
		}
		
	}
	public static void main(String[] args)
	{
		int n=1;
		Number(n);
	}
}