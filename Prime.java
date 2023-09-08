import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int i,no,temp=0;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		no=sc.nextInt();
		for(i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("number is prime:" +no);
		}
		else
		{
			System.out.println("number is not prime:" +no);
		}

	}
}