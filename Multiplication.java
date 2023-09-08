import java.util.Scanner;
class Multiplication

{
	public static void main(String args[])
	{
		int num ,i;	
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println("\n\t"+num+"*"+i+"="+num*i);
		}
		
		
	
	}
}