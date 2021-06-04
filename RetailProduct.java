/*
 * File name: RetailProduct.java
 * Purpose: Retail Product class
 * */

public class RetailProduct 
{
	private String productName;
	private double price;
	private int quantity;
	
	/*
	 * Method name: RetailProduct
	 * Purpose: Default constructor sets values to empty/null when an instance of the class is created
	 * Parameters: none
	 * */
	public RetailProduct() 
	{
		String productName = "";
		double price = 0;
		int quantity = 0;
		
	}
	/*
	 * Method name: RetailProduct
	 * Purpose: Parameterized constructor will assign predetermined values
	 * when an instance of the class is created
	 * Parameters: (String, double, int)
	 * */
	RetailProduct(String productName,double price, int quantity)
	{
		this.productName = productName;
		this.price= price;
		this.quantity = quantity;
	}
	/*
	 * Method name: setProductName
	 * Purpose: set/change data private data member name to a predetermined value
	 * Parameters: (String)
	 * */
	public void setProductName(String productName) 
	{
		this.productName = productName;
	}
	/*
	 * Method name: setPrice
	 * Purpose: set/change data private data member name to a predetermined value also throws an error with a message when
	 * input results in an error 
	 * Parameters: (double)
	 * */
	public void setPrice(double price) throws NumberFormatException
	{
		if (price < 0 || price > 10000)
		{
			throw new NumberFormatException("Number must be between 0 and 10000");
		}
		else 
			this.price = price;
	}
	/*
	 * Method name: setQuantity 
	 * Purpose: set/change data private data member name to a predetermined value also throws an error with a message when
	 * input results in an error 
	 * Parameters: (int)
	 * */
	public void setQuantity(int quantity) throws NumberFormatException
	{
		if (quantity < 0 || quantity > 10000) 
		{
			throw new NumberFormatException("Number must be between 0 and 10000");
		}
		else 
			this.quantity = quantity;
	}
	/*
	 * Method name: getProductName
	 * Purpose: Return data private data member name when method is called
	 * Parameters: none
	 * */
	public String getProductName() 
	{
		return productName;
	}
	/*
	 * Method name: getPrice
	 * Purpose: Return data private data member name when method is called
	 * Parameters: none
	 * */
	public double getPrice() 
	{
		return price;
	}
	/*
	 * Method name: getQuantity
	 * Purpose: Return data private data member name when method is called
	 * Parameters: none
	 * */
	public int getQuantity() 
	{
		return quantity;
	}
	/*
	 * Method name: toString
	 * Purpose: Returns all data members as a string as a way to display them
	 * Parameters: none
	 * */
	public String toString() 
	{
		return "RetailProduct:\nProduct Name= " + productName + "\nPrice= " + price + "\nQuantity= " + quantity;
	}
}
