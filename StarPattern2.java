import java.util.Scanner;
class StarPattern2
{
	public static void main(String args[])
	{       
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=c.nextInt();
		int i,j;
		for(i=1;i<=no;i++)
		{
			for(j=no;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}