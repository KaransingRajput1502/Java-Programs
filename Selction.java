import java.util.Scanner;
class Selction
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		int i;
		int [ ] a={54,98,32,5,89};
		int min=a[0];
		for(i=1;i<a.length;i++)
		{
		
		if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(" Smallest element of array is "  +min);
	}
}  