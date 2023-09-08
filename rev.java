class appl
{
	public static void main(String args[])
	{
		int rev=0,rem,num=156;int temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			temp=temp/10;

		}
		if(num==temp)
		System.out.println(" palidrome="+num);
		else
		System.out.println(" not palindrome="+num);
		
	}
}