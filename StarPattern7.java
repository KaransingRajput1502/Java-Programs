import java.util.Scanner;
class StarPattern7
{
	public static void main(String args[])
	{       
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=c.nextInt();
		int i,j,k;
		for(i=1;i<=no;i++)
		{
			for(j=no;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}