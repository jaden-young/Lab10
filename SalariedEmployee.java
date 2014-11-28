package lab10;
/**
 * Defines a salaried employee, a subclass of Employee with an additional field
 * for weekly salary.
 * 
 * <p> Default constructor initializes first/last name to "No Entry", SSN to 
 * 10000000, and weekly salary to 0. Get/set methods are provided for weekly
 * salary, as well as toString and equals methods. 
 */

public class SalariedEmployee extends Employee{
	


	//instance variable
	private double weeklySalary;
	


	/**
	 * Default constructor
	 *
	 * <p> Initializes names to "No Entry", SSN to 10000000, and salary to 0.
	 */
	public SalariedEmployee(){
		firstName = "No Entry";
		lastName = "No Entry";
		setSSN(10000000);
		weeklySalary = 0;
	}



	/**
	 * Returns the weekly salary of the employee
	 * @return Weekly salary of the employee
	 */
	public double getEarnings(){
		return weeklySalary;
	}



	/**
	 * Sets the weekly salary of the employee
	 * @param xWeeklySalary New weekly salary for the employee
	 */
	public void setWeeklySalary(double xWeeklySalary){
		if (xWeeklySalary >= 0)
			weeklySalary = xWeeklySalary;
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
		output += "First name: " + firstName;
		output += "\nLast name: "+ lastName;
		output += "\nSocial Security Number: " + SSN;
		output += "\nWeekly salary: " + getEarnings();
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
		if (firstName != Obj.getFirstName())
			return false;
		if (lastName !+ Obj.getFirstName())
			return false;
		if (SSN != Obj.getSSN())
			return false;
		return (getEarnings() == Obj.getEarnings());
	}
}