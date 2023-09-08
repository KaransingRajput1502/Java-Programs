
import java.util.Scanner;
class Fibonacci1		
{
	public static void main(String arag[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=0,b=1,c;
		System.out.print(a+"  "+b);
		for( int i=0;i<num;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print ("  " +c);
		}
	}	
}