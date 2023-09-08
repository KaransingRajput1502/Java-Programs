import java.util.Scanner;
class ArmStrongNumber2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int arm=no,rem;
		int sum=0;
		while(no!=0)
		{	
			rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;	
		}
		if(arm==sum)
		{
			System.out.println("arm Strong"+arm);
		}
		else
		{
			System.out.println("not arm Stron  g"+arm);
		}
	}
}