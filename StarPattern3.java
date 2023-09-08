import java.util.Scanner;
class StarPattern3
{
	public static void main(String args[])
	{       
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=c.nextInt();
		int i,j;
		for(i=1;i<=no;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

		for(i=1;i<=no;i++)
		{
			for(j=no-1;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}


	}
}