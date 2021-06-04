/*
 * File name: PreferredCustomer.java
 * Purpose: inherits from customer class and implements PreferredCustomer Abstract class 
 * 
 * =============UML============
 * - customerPurchase : double
 * - discountLevel : String
 * + PreferredCustomer 
 * + PreferredCustomer(String, String, String, boolean, double)
 * + getDiscount() : String
 * + toString() : String
 * */
public class PreferredCustomer extends Customer implements Preferred 
{
	
	private double customerPurchase;
	private String discountLevel;
	/*
	 * Method name: PreferredCustomer
	 * Purpose: Default constructor sets values to empty when an instance of this class is created
	 * Parameters: (double, String)
	 * */	
	PreferredCustomer(double p, String d)
	{
		customerPurchase = p;
		discountLevel = d;
	}
	/*
	 * Method name: PreferredCustomer (override)
	 * Purpose: Default constructor sets values to empty when an instance of this class is created
	 * Parameters: (String, String ,String, String, boolean, double)
	 * */
	PreferredCustomer(String n, String a, String c,String t , boolean m, double p)
	{
		super.setCustomerNumber(c);
		super.setMailingList(m);
		super.setName(n);
		super.setAddress(a);
		super.setTelephoneNumber(t);
		customerPurchase = p;
	}
	/*
	 * Method name: getDiscount (override)
	 * Purpose: Check whether created instance of class purchased enough to reward them with a discount
	 * Parameters: none
	 * */
	@Override
	public String getDiscount() 
	{
		if (customerPurchase >= 2000)
		{
			return discountLevel = "10%";
		}
		else if (customerPurchase >= 1500)
		{
		 	return discountLevel = "7%";
		}
		else if (customerPurchase >= 1000)
		{
			return discountLevel = "6%";
		}
		else if (customerPurchase >= 500)
		{
			return discountLevel = "5%";
		}
		else
		{
			return discountLevel = "N/A";
		}
	}
	/*
	 * Method name: toString
	 * Purpose: Returns all data members as a string as a way to display them
	 * Parameters: none
	 * */
	public String toString()
	{	
		return super.toString() + "\nCustomer Purchase Amount: " + customerPurchase + "\nDiscount Level: " + getDiscount();
	}
	
}
