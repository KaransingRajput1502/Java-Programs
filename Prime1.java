import java.util.Scanner;
class Prime1
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		int i,num=7;
		int temp=0;
		//System.out.println("entter a number");
		//num=ss.nextInt();
		//for( num=1;num<=10;num++)
		//{
			for(i=2;i<=num-1;i++)
			{
				if(num%i==0)
				{
					temp=temp+1;
				}
			
			}
			if(temp==0)
			{
				System.out.println("primr"+num);
			}
			/*else
			{
				temp=0;
			}*/
		//}
			
	}
}