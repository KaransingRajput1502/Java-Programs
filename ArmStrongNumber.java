cmdimport java.util.Scanner;
class ArmStrongNumber

{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter a Number");
		int no=d.nextInt();
		int t1=no;
		int leng=0;
		while(t1!=0)
		{
			leng=leng+1;
			t1=t1/10;
		}
		int t2=no;
		int arm=0;
		int rem;
		//int mul=0;
		while(t2!=0)
		{
			int mul=1;
			rem=t2%10;
			for(int i=1; i<=leng;i++)
			{
				mul = mul * rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==no)
		{
			System.out.println("Number is Arm strong"+arm);
		}
		else
		{
			System.out.println("Number is not Arm strong"+arm);
		}

	}
}