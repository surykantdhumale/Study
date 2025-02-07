class Fact{
	public static void main(String [] args){


	int n=5;
	int x=fact(n);
	System.out.println(x);
}	

	public static int fact(int y)
	{

	int fact=1;
	for(int i=1;i<=y;i++)
	{
		fact=fact*i;
	}
	return fact;
	}
}

