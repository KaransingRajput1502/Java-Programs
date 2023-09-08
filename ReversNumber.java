import java.util.Scanner;
class ReversNumber
{
	public static void main(String args[])
	{
		int rev=0,no;
		int rem;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		 no=sc.nextInt();
		
		while(no!= 0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);

	}
}