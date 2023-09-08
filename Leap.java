import java.util.Scanner;
class Leap
{	
	public static void main(String args[])
	{
		int year;
		System.out.println(" enter a year");
		 //int num=sc.nextInt();
		Scanner sc=new Scanner(System.in);
		 year=sc.nextInt();
		if ((year%400==0)   ||  (year%4==0 && year%100!=0 ))
		{
			System.out.println("year is leap year"+year);
		}
		else
		{
			System.out.println(" year is not leap year"+year);
		}
	}

}

