package DayOne;

import java.util.Scanner;

public class DayThree {

	public static void main(String[] args) 
	{
		/*int n;
		int status=1;
		int num=3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter n: ");
		n=input.nextInt();
		
		if(n>=1) {
			System.out.println("First"+n+"prime number are");
			System.out.println(2);
		}
		for(int i=2; i<=n;) {
			
			for (int j=2;j<=Math.sqrt(num);j++) 
			{
				if(num%j==0) {
					status=0;
					break;
				}
			}
		if (status !=0) {
			System.out.println(num);
			i++;
		}
		status=1;
		num++;
		}

	}*/
		
		
		/*int[] arr= {2,11,45,9};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		*/
		
		/*
		//For each loop
		//Enhanced for loop
		for (int num: arr) 
		{
			System.out.println(num);
		}
		*/
	
		
		//fibonachcci
		
		int count=7;
		int num1=0;
		int num2=1;
		
		for(int i=1;i<=count;++i) 
		{
			System.out.println(num1 + " ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}
	
	
	
	
	
	
	}
}
