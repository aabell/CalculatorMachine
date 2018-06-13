package DayOne;

import java.util.Scanner;

public class Calculatore 
{
	
	public static void main(String[] args) 
	
	{
		int Number1,Total,Number2;
		String c; 
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter number1: ");
		
		Number1=input.nextInt();
		
		while(Number1!=0) 
		{
		
		System.out.println("Please enter number2: ");
		Number2 = input.nextInt();
		System.out.println("Please enter the Operation: ");
		c=input.next();
		
		
			
		if(c.equals("+")) 
		{
			Total=Number1+Number2;
			System.out.println("Total: " + Total);
		}
		
		 if (c.equals("-"))
		 {
			 Total=Number1-Number2;
			 System.out.println("Total: " + Total);
		}
		 if (c.equals("/"))
		 {
			 Total=Number1/Number2;
			 System.out.println("Total: " + Total);
		 }
		 if (c.equals("*"))
		 {
			Total=Number1*Number2;
			System.out.println("Total: " + Total);
		 }
	
		 System.out.println("Please enter number1: ");
			
		 Number1=input.nextInt();
		}
		
	}
}


