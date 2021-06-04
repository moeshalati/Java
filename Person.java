
/*
 * Author: Mohamad Elshalati
 * Prof. Rodrigues
 * purpose: Mega store program that will reword customers with a discount if they spend a certain amount at their store
 * inheritance will be implemented for those preferred customers regular customers will also have their own class that will also inherit from the person class 
 * 
 * ===========UML============
 * 		CLASS: Person
 * - name: string
 * -address: string
 * -telephoneNumber: string 
 * +Person()
 * +Person (String, String, String)
 * +setName (String) : void
 * +setAdderess(String) : void
 * +setTelephoneNumber (String) : void
 * +getName() : String
 * +getAddress() : String
 * +getTelephoneNumber() : String
 * +toString() : String
 * */
public class Person
{
	private String name, 
				   address, 
				   telephoneNumber;
	/*
	 * Method name: Person
	 * Purpose: Default constructor sets values to empty when an instance of the class is created
	 * Parameters: none
	 * */
	public Person()
	{
		this("","","");
	}
	/*
	 * Method name: Person
	 * Purpose: Parameterized constructor will assign predetermined values
	 *  when an instance of the class is created
	 * Parameters: (String, String, String)
	 * */
	public Person(String n, String a, String tN)
	{
		name = n;
		address = a;
		telephoneNumber = tN;
	}
	/*
	 * Method name: setName
	 * Purpose: set/change data private data member name to a predetermined value
	 * Parameters: (String)
	 * */
	public void setName(String n)
	{
		name = n;
	}
	/*
	 * Method name: setAddress
	 * Purpose: Set/change data private data member address to a predetermined value
	 * Parameters: (String)
	 * */
	public void setAddress(String a)
	{
		address = a;
	}
	/*
	 * Method name: setTelephoneNumber
	 * Purpose: Set/change data private data member telephoneNumber to a predetermined value
	 * Parameters: (String)
	 * */
	public void setTelephoneNumber(String tN)
	{
		telephoneNumber = tN;
	}
	/*
	 * Method name: getName
	 * Purpose: Return data private data member name when method is called
	 * Parameters: none
	 * */
	public String getName()
	{
		return name;
	}
	/*
	 * Method name: getAddress
	 * Purpose: Return data private data member address when method is called
	 * Parameters: none
	 * */
	public String getAddress()
	{
		return address;
	}
	/*
	 * Method name: getTelephoneNumber
	 * Purpose: Return data private data member telephoneNumber when method is called
	 * Parameters: none
	 * */
	public String getTelephoneNumber()
	{
		return telephoneNumber;
	}
	/*
	 * Method name: toString
	 * Purpose: Returns all data members as a string as a way to display them
	 * Parameters: none
	 * */
	public String toString()
	{
		return "Name: " + this.name + "\nAddress: " + this.address + "\nTelephone Number: " + this.telephoneNumber;
	}

}
