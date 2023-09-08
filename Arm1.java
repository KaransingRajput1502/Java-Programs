class Armjh
{
	public static void main(String args[])
	{
		int rev=0,rem,num=153;
		int temp=num;
		//Sytem.out.println("");
		while(num!=0)
		{
			rem=num%10;
			temp=temp+(rem*rem*rem);
		}
		if(temp==num)
		{
			System.out.println("numberr is prime number"+num);
		}
		else
		{
			System.out.println("numberr is prime number"+num);
		}
	}
}