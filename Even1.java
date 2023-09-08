import java.util.Scanner;
class Even1
{
	public static void main(String argss[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter a number");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("\n even  number " + num);
		}
		else
		{
			System.out.println("\n odd number" +    num);
		}
	}
}