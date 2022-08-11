 import java.util.*;
 class Tax1
 {
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your Annual income:");
	int income =sc.nextInt();
	
	if(income<=200000)
		{
		System.out.println(" you have to pay 2% of Tax");
		}
	else if(income<=400000)
	{
		System.out.println(" you have to pay 4% of Tax");
	}
	else if(income<=500000)
	{
		System.out.println(" you have to pay 10% of Tax");
	}
	else
	{
		System.out.println(" you have to pay 40% of Tax");
	}
	}
}
	
	
	