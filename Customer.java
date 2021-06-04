/*
 * File name: Customer.java
 * Purpose: subclass that inherits from Person parent class and add to it some more attributes 
 * 
 * =============UML===========
 * - customerNumber : String
 * - mailingList : boolean
 * + Customer()
 * + Customer (String, boolean)
 * + Customer (String, String, String, boolean, String)
 * + setCustomerNumber(String)
 * + setMailingList(boolean)
 * + getCustomerNumber () : String
 * + getMailingList() : String
 * + toString(): String
 * */

	public class Customer extends Person {
	private String customerNumber;
	private boolean mailingList;
	/*
	 * Method name: Customer
	 * Purpose: Default constructor sets values to empty when an instance of the class is created
	 * Parameters: none
	 * */
	Customer()
	{
		super.setName("");
		super.setAddress("");
		super.setTelephoneNumber("");
		customerNumber = "";
		mailingList = false;
	}
	/*
	 * Method name: Customer
	 * Purpose: Parameterized constructor will assign predetermined values
	 *  when an instance of the class is created
	 * Parameters: (String, boolean)
	 * */
	Customer(String c, boolean m)
	{
		customerNumber= c ;
		mailingList = m;
	}
	/*
	 * Method name: customer
	 * Purpose: Parameterized constructor will assign predetermined values
	 * when an instance of the class is created for both parent class and sub/child class
	 * Parameters: (String, String, String, boolean, String )
	 * */
	Customer(String n, String a, String c, boolean m , String t)
	{
		customerNumber = c;
		mailingList = m;
		super.setName(n);
		super.setAddress(a);
		super.setTelephoneNumber(t);
	}
	/*
	 * Method name: setCusomerNumber
	 * Purpose: Set/Change data member to a determined value
	 * Parameters: (String)
	 * */
	public void setCustomerNumber(String c)
	{
		customerNumber = c;
	}
	/*
	 * Method name: setMailingList
	 * Purpose: Set/Change data member to a determined value
	 * Parameters: (boolean)
	 * */
	public void setMailingList(boolean m)
	{
		mailingList = m;
	}
	/*
	 * Method name: getCustomerNumber
	 * Purpose: return data member when method is called
	 * Parameters: none
	 * */
	public String getCustomerNumber ()
	{
		return customerNumber;
	}
	/*
	 * Method name: getMailingList
	 * Purpose: return data member when method is called
	 * Parameters: none
	 * */
	public boolean getMailingList()
	{
		return mailingList;
	}
	/*
	 * Method name: toString
	 * Purpose: Returns all data members as a string as a way to display them
	 * Parameters: none
	 * */
	public String toString()
	{
		
		if (this.mailingList == true)
		{
			return super.toString() + "\nCustomer number: " + this.customerNumber + "\nMailing List: Subscribed" ;
		}
		else
		{
			return super.toString() + "\nCustomer number: " + this.customerNumber + "\nMailing List: Not Subscribed" ;
		}
	}
}
