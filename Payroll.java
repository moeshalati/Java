/*
 * Author: Mohamad Elshalati
 * Professor: John Rodrigues
 * 
 * */
public class Payroll 
{
	//private data members
	private String name;
	private int IDnumber;
	private double hourlyPayRate;
	private double hoursWorked;
	
	//methods
	/*
	 * Method: constructor
	 * Purpose: set all class private members to default values
	 * @param 
	 * */
	Payroll()
	{
		name = "unassigned";
		IDnumber = 0000;
		hourlyPayRate = 0.00;
		hoursWorked = 0.00;
		System.out.println("HERE!!");
	}
	
	/*
	 * Method: parameterized constructor
	 * Purpose: set all class private members to set values by user
	 * @param - n to set name.
	 * @param - ID to set IDnumber.
	 * @param - h to set hourlyPayRate.
	 * @param - hW to set hoursWorked.
	 * */
	Payroll( String n, int ID, double h, double hW)
	{
		name = n;
		IDnumber = ID;
		hourlyPayRate = h;
		hoursWorked = hW;
	}
	
	/*
	 * Method: setName
	 * Purpose: set employee name
	 * @param n representing the name data member (employee name)
	 */
	public void setName(String n)
	{
		name = n;
	}
	
	/*
	 * Method: setName
	 * Purpose: set employee IDnumber data member
	 * @param ID representing the IDnumber data member (employee IDnumber)
	 */
	public void setIDnumber(int ID)
	{
		IDnumber = ID;
	}
	
	/*
	 * Method: setName
	 * Purpose: set employee hourly pay rate
	 * @param h representing the hourlyPayRate class member (employee hourly pay rate)
	 */
	public void setHourlyPayRate(double h)
	{
		hourlyPayRate = h;
	}
	
	/*
	 * Method: setHoursWorked
	 * Purpose: set employee name
	 * @param double hW representing the hoursWorked class member (employee working hours)
	 */
	public void setHoursWorked(double hW)
	{
		hoursWorked = hW;
	}
	
	/*
	 * Method: getName
	 * @return the name of the employee
	 */
	public String getName()
	{
		return name;
	}
	
	
	/*
	 * Method: getIDnumber
	 * @return ID number of the employee
	 */
	public int getIDnumber()
	{
		return IDnumber;
	}
	
	/*
	 * Method: getHourlyPayRate
	 * @return hourly pay rate of employee
	 */
	public double getHourlyPayRate()
	{
		return hourlyPayRate;
	}
	
	/*
	 * Method: getHoursWorked
	 * @return hours worked by employee
	 */
	public double getHoursWorked()
	{
		return hoursWorked;
	}
	public double getGrossPay()
	{
		return hoursWorked * hourlyPayRate;
	}
}
