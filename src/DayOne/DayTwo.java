package DayOne;

import java.util.Scanner;

public class DayTwo {

	public static void main(String[] args) 
	{
//		int num1=100;
//		int num2=20;
//		
////		num2+=num1;
////		System.out.println(num2);
//		if(num1==num2) 
//		{
//			System.out.println("They are the same");
//		}
//		if(num1!=num2)
//		{
//			System.out.println("They are not the same");
//		}
//		
//	//var num = (expression)? value if true : value if false
//	num2=(num1==10)?100:200;
//	System.out.println(num2);
	
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter number1: ");
		
		int Number1=input.nextInt();
		
		if(1<Number1 && Number1<100) {
			
		
		int result=Number1%2;
		
		if(result==0) 
		{
			
			
			if(( Number1> 2) && (Number1 < 5))
			{
				System.out.println("Not Weird");
				
			}
			
			 if(Number1>6 && Number1<20) 
			{
				System.out.println("Weird");
			}
			if(Number1>20) 
			 {
				 System.out.println(" Not Weird");
			 }
			
		}
		else
		{
			System.out.println("odd and Weird");
		}

	}
	else 
	{
		System.out.println("The Number has to be b/n 1 to 100 Range");
	}
	
	} }