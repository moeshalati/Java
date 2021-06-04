
public class CustomerTest {

	public static void main(String[] args) 
	{
		Customer myCustomer;// instance of customer class
		myCustomer = new Customer("Moe", "Wayne, NJ" , "46246", true,"2016733836"); // using parameterized constructor to set instance
		System.out.println(myCustomer.toString());//utilizing toString() method
		System.out.println("\nPreferred Customer test... ");
		PreferredCustomer myPreferredCustomer = new PreferredCustomer("Elshalati", "Paterson, NJ" ,"55" ,"2016733836", false, 1500);
		System.out.print(myPreferredCustomer.toString());
	}

}