
public class testPayroll 
{

	public static void main(String[] args) 
	{
		//create variables
		Payroll employee1 = new Payroll();
		Payroll employee2;
		Payroll employee3;
		
		//Initializing employee1 manually using setters methods
		employee1.setName("Employee 1");
		employee1.setIDnumber(12345);
		employee1.setHoursWorked(12.00);
		employee1.setHourlyPayRate(1.00);
		
		//Initializing employee2 using default constructor
		employee2 = new Payroll();
		
		//Initializing employee3 using parameterized constructor
		employee3 = new Payroll("Mohamad Elshalati", 6789, 15.00, 40.00);

		//Employee1 manually set
		System.out.println(("Employee name: ") + employee1.getName()
		 				  +("\nEmployee ID number: ") + employee1.getIDnumber()
		 				  +("\nEmployee hourly pay rate: ") + employee1.getHourlyPayRate()
		 				  +("\nEmployee hours worked: ") + employee1.getHoursWorked()
		 				  +("\nEmployee gorss pay: ") + employee1.getGrossPay());
		
		//Employee2 set with default constructor.
		System.out.println(("\nEmployee name: ") + employee2.getName()
		 				  +("\nEmployee ID number: ") + employee2.getIDnumber()
		 				  +("\nEmployee hourly pay rate: ") + employee2.getHourlyPayRate()
		 				  +("\nEmployee hours worked: ") + employee2.getHoursWorked()
		 				  +("\nEmployee gorss pay: ") + employee2.getGrossPay());
		
		//Employee3 set with parameterized constructor.
		System.out.println(("\nEmployee name: ") + employee3.getName()
						  +("\nEmployee ID number: ") + employee3.getIDnumber()
						  +("\nEmployee hourly pay rate: ") + employee3.getHourlyPayRate()
						  +("\nEmployee hours worked: ") + employee3.getHoursWorked()
						  +("\nEmployee gorss pay: ") + employee3.getGrossPay());
	}

}
