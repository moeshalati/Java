/*
 * File name: TestServiceProvider.java
 a*/
import java.util.Scanner;

public class TestServiceProvider {

	public static void main(String[] args)
	{

		//Initialization
		ServiceProvider clientA = new ServiceProvider();
		Scanner input = new Scanner(System.in);
		String userString;
		int userInt;
		
		//do-while loop to make sure user is inputting correct values into program. will not pass values other than a,b or c
		//regardless of the letter case
		do{
			System.out.println("Please enter your package(A, B, Or C): ");
			userString = input.next();
		}while(!userString.equalsIgnoreCase("a") && !userString.equalsIgnoreCase("b") && !userString.equalsIgnoreCase("c"));
		
		//do-while loop to make sure user is inputting correct values into program. will not pass values less than 0.
		do{
			System.out.println("Please enter number of minutes: ");
			userInt = input.nextInt();
		}while(userInt < 0);
		
		//call to methods
		clientA.billCalculator(userString, userInt);
		clientA.savings(userString);
		
	}
	

}
