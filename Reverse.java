class Reverse{

	public static void main(String args[])
	{
		int arr[]={12,5,45,30,5};
		
		System.out.println("Original Array Elements are: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}

		System.out.println("Reverse Array Elements are: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}