/*
 * File name: 
 * */
import java.util.InputMismatchException;
import java.util.Scanner;

public class testRetailProduct {

	public static void main(String[] args)
	{
		
		RetailProduct myProduct = new RetailProduct(); //class RetailProduct instance 
		RetailProduct newProduct = new RetailProduct();//class RetailProduct instance 2
		
		Scanner userInput = new Scanner(System.in);
		
			System.out.println("Please enter product's name: ");
			String name = userInput.nextLine();
			myProduct.setProductName(name);
		try //make sure input will throw an exception in case of unexpected input from user
		{
			System.out.println("Please enter product's price: ");
			double price = userInput.nextDouble();
			myProduct.setPrice(price);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error - Entered number is not a double");
		}
	
		try  //make sure input will throw an exception in case of unexpected input from user
		{
			System.out.println("Please enter product's quantity: ");
			int quantity = userInput.nextInt();
			myProduct.setQuantity(quantity);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error - Entered number is not an integer.");
		}
		
		
		userInput.nextLine();
		//new product
		
		System.out.println("Please enter new product's name: ");
		String name1 = userInput.nextLine();
		newProduct.setProductName(name1);
		try
		{
			System.out.println("Please enter product's price: ");
			double price = userInput.nextDouble();
			newProduct.setPrice(price);
		}
		catch(Exception e)  //make sure input will throw an exception in case of unexpected input from user
		{
		System.out.println("Error - Entered number is not a double. Error name: " + e.toString());
		}

		try 
		{
			System.out.println("Please enter product's quantity: ");
			int quantity = userInput.nextInt();
			newProduct.setQuantity(quantity);
		}
		catch(Exception e)
		{
			System.out.println("Error - Entered number is not an integer. Error name: " + e.toString());
		}
		
			
		finally
		{
			System.out.println(myProduct.toString());
			System.out.println();
			System.out.println(newProduct.toString());
		}
		
	}
}
