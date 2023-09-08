class BubleSort
{
	public static void main(String args[])
	{
		int i,j;
		int temp;
		int [ ] a={10,54,68,32,97};
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<=a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{

					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		for(i=0;i<=a.length;i++)
		{
			System.out.println(" "+a[i]);
		}
		
	}
}