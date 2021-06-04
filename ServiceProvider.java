/*
 * Author: Mohamad Elshalati
 * Prof. Rodrigues
 * File name: ServiceProvider.Java
 * Program Purpose: Cell phone service provider program that will provide customers pay their phone bill.
 * 
 */
//UML diagram
/*
 * DATA Members
 * - packageA : String
 * - packageB : String
 * - packageC : String
 * - minutes : int
 * METHODS
 * + ServiceProvider()
 * + setPackageA(String) : void
 * + setPackageB(String) : void
 * + setPackageC(String) : void
 * + setMinutes(int) : void
 * + getPackageA () : String
 * + getPackageB () : String
 * + getPackageC () : String
 * + getMinutes () : int
 * + billCalculator (String, int) : void
 * + savings (String) : void
 * 
 * */
public class ServiceProvider 
{
	//Data Members
	private String packageA;
	private String packageB;
	private String packageC;
	private int minutes;

	//Methods
	/*
	 * Method Name: ServiceProvider.
	 * Purpose: initialize private data members to default values.
	 * */
	public ServiceProvider()
	{
		packageA = "Package A: $29.99/month 120 minutes of calls. $0.16 for any over limit minutes.";
		packageB = "Package B: $39.99/month 220 minutes of calls. $0.12 for any over limit minutes.";
		packageC = "Package C: $49.99/month unlimited calls minutes.";
		minutes = 0; 
	}
	/*
	 * Method Name: setPackageA.
	 * Purpose: set data member packageA.
	 * @param a : a string
	 * */
	public void setPackageA(String a)
	{
		packageA = a;
	}
	/*
	 * Method Name: setPackageB.
	 * Purpose: set data member packageB.
	 * @param b : a string
	 * */
	public void setPackageB(String b)
	{
		packageB = b;
	}
	/*
	 * Method Name: setPackageC.
	 * Purpose: set data member packageC.
	 * @param : c a string
	 * */
	public void setPackageC(String c)
	{
		packageC = c;
	}
	/*
	 * Method Name: setMinutes.
	 * Purpose: set data member minutes.
	 * @param m : m an integer
	 * */
	public void setMinutes(int m)
	{
		minutes = m;
	}
	/*
	 * Method Name: getPackageA.
	 * Purpose: get/retrieve data member packageA.
	 * */
	public String getPackageA()
	{
		return packageA;
	}
	/*
	 * Method Name: getPackageB.
	 * Purpose: get/retrieve data member packageB.
	 * */
	public String getPackageB()
	{
		return packageB;
	}
	/*
	 * Method Name: getPackageC.
	 * Purpose: get/retrieve data member packageC.
	 * */
	public String getPackageC()
	{
		return packageC;
	}
	/*
	 * Method Name: getMinutes.
	 * Purpose: get/retrieve data member minutes.
	 * */
	public int getMinutes()
	{
		return minutes;
	}
	/*
	 * Method Name: billCalculator.
	 * Purpose: calculate phone bill
	 *@param p: a string referring to user choice of package and m : an integer referring to number of minutes 
	 * */
	public void billCalculator(String p, int m)
	{
		if (p.equalsIgnoreCase("a"))
		{
			if(m > 120)
			{
				double temp = m - 120;
				temp = 0.16 * temp;
				System.out.println("Your plan is " + packageA + "\nYour bill total is: $" + (29.99 + temp));
			}
			else
			{
				System.out.println("Your plan is " + packageA + "\nYour bill total is: $" + 29.99);
			}
		}
		
		else if (p.equalsIgnoreCase("b"))
		{
			if (m > 220)
			{
				double temp = m - 220;
				temp = 0.12 * temp;
				System.out.println("Your plan is " + packageB + "\nYour bill total is: $" + (39.99 + temp));
			}
			else
			{
				System.out.println("Your plan is " + packageB + "\nYour bill total is: $" + 39.99);
			}
		}
		else if (p.equalsIgnoreCase("c"))
		{
			System.out.println("Your plan is " + packageC + "\nYour bill total is: $" + 49.99);
		}

	}
	/*
	 * Method Name: savings.
	 * Purpose: Let customer know that they either have the most economic plan or they can save by switching to cheaper packages.
	 * @param p : a string referring to package chosen by user.
	 * */
	public void savings (String p)
	{
		System.out.println("We have great news for you!");
		
		if (p.equalsIgnoreCase("a"))
		{
			System.out.println("Good choice! You picked our most economic plan.");
		}
		
		else if (p.equalsIgnoreCase("b"))
		{
			System.out.println("You can save up to $10 if you switch to this plan:" + packageA);
		}
		
		else if (p.equalsIgnoreCase("c"))
		{
			System.out.println("You can save up to $10 if you switch to our " + packageB + "\nand up to $20 if you switch to our " + packageA);
		}
	}
	
}
