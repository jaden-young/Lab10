package lab10;
/**
 * Defines a salaried employee, a subclass of Employee with an additional field
 * for weekly salary.
 * <p>
 * Default constructor initializes first/last name to "No Entry", SSN to 
 * 10000000, and weekly salary to 0. Get/set methods are provided for weekly
 * salary, as well as toString and equals methods. 
 */

public class SalariedEmployee extends Employee{
	


	//instance variable
	private double weeklySalary;
	


	/**
	 * Default constructor
	 * <p>
	 * Initializes names to "No Entry", SSN to 10000000, and salary to 0.
	 */
	public SalariedEmployee(){
		super();
		this.weeklySalary = 0;
	}



	/**
	 * Overloaded constructor
	 * <p> 
	 * Initializes SalariedEmployee object with values for all fields
	 * @param xFirstName First name of the employee
	 * @param xLastName Last name of the employee
	 * @param xSSN Social Security Number of the employee
	 * @param xWeeklySalary Weekly salary of the employee
	 */
	public SalariedEmployee(String xFirstName, String xLastName, int xSSN, 
							double xWeeklySalary){
		super(xFirstName, xLastName, xSSN);
		setWeeklySalary(xWeeklySalary);
	}



	/**
	 * Returns the weekly salary of the employee
	 * @return Weekly salary of the employee
	 */
	@Override
	public double getEarnings(){
		return this.weeklySalary;
	}



	/**
	 * Sets the weekly salary of the employee
	 * @param xWeeklySalary New weekly salary for the employee
	 */
	public final void setWeeklySalary(double xWeeklySalary){
		if (xWeeklySalary >= 0)
			this.weeklySalary = xWeeklySalary;
		else
			throw new IllegalArgumentException("Needs to be a positive " + 
				"number");
	}



	/**
	 * Returns a printable version of the data contained in the fields of the
	 * object.
	 *
	 * @return String containing first name, last name, SSN, and weekly salary
	 * 		   of the salaried employee
	 */
	@Override toString()
	public String toString(){
		String output = "";
		output += "First name: " + this.getFirstName();
		output += "\nLast name: "+ this.getLastName();
		output += "\nSocial Security Number: " + this.getSSN();
		output += "\nWeekly salary: " + this.getEarnings();
		return output;
	}



	/**
	 * Compares two SalariedEmployee objects for equality by comparing the 
	 * data in the fields.
	 *
	 * @return True if objects are equal, false if not
	 */
	@Override equals()
	public boolean equals(Object xObj){
		if (!(xObj instanceof SalariedEmployee))
			return false;
		SalariedEmployee Obj = (SalariedEmployee)xObj;
		if (this.getFirstName() != Obj.getFirstName())
			return false;
		if (this.getLastName() !+ Obj.getFirstName())
			return false;
		if (this.getSSN() != Obj.getSSN())
			return false;
		return (this.getEarnings() == Obj.getEarnings());
	}
}