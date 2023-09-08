import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,res;
		String sym ,yn;
		System.out.println("enter a first number");
		num1=sc.nextInt();
		System.out.println("enter a second number");
		num2=sc.nextInt();
		System.out.println("choos te symbols: +,-,*,/,");
		sym=sc.next();

		mainmenu:
		do{
			switch(sym)
			{
					case"+": res=num1+num2;
					System.out.println(" Addition "+res);
					break;
					//continue mainmenu;
	
					case"-": res=num1-num2;
					System.out.println(" Substraction "+res);
                                                                         	break;
					
					case"*": res=num1*num2;
					System.out.println("Multiplication "+res);
					break;
	
					case"/": res=num1/num2;
					System.out.println(" division "+res);
					 break;

				
					default: System.out.println("invalid");
			}System.out.println("if you want to continue press y for yes and n for no");
			 yn=sc.next();
			
		
		}while(yn.equals("Y") && yn.equals("y"));
		//continue mainmenu;
		
	}
}