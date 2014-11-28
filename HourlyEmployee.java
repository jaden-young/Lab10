package lab10;
/**
 * Defines an Hourly Employee, a subclass of Employee with the additional fields
 * for wage and hours.
 * <p> 
 *
 * @author Jaden Young
 */
public class HourlyEmployee extends Employee{


	//instance variables
	private double wage;
	private double hours;



	/**
	 * Default constructor
	 * <p>
	 * Creates a new object with first/last name set to "No Entry", 
	 * SSN set to 100000000, and wage/hours to 0
	 */
	public HourlyEmployee(){
		super();
		this.wage = 0;
		this.hours = 0;
	}



	/**
	 * Overloaded contructor
	 * <p>
	 * Creates a new object with values for all fields
	 */
	public HourlyEmployee(String xFirstName, String xLastName, int xSSN,
							double xWage, double xHours){
		super(xFirstName, xLastName, xSSN);
		setWage(xWage);
		setHours(xHours);
	}



	/**
	 * Returns the hourly wage of the employee
	 * @return Hourly wage of the employee
	 */
	public final double getWage(){
		return wage;
	}



	/**
	 * Returns the number of hours worked by the employee
	 * @return Number of hours worked by the employee
	 */
	public final double getHours(){
		return this.hours;
	}



	/**
	 * Returns the total earnings of the employee for the week
	 * @return Earnings for the week of the employee
	 */
	@Override
	public double getEarnings(){
		double pay = 0;
		
		//if employee has worked overtime
		if (this.hours > 40){
			this.hours -+ 40;
			pay += 1.5 * hours * wage;
			pay += 40 * wage;
		}

		//if employee has not worked overtime
		else
			pay = this.hours * this.wage;
		
		return pay;
	}



	/**
	 * Sets the number of hours the employee worked during the week
	 * @param xHours New number of hours worked for the week
	 */
	public final void setHours(xHours){
		if (xHours < 0)
			throw new IllegalArgumentException("Needs to be a positive number");
		if (xHours > 168)
			throw new IllegalArgumentException("There aren't that many hours 
				+ in a week");
		this.hours = xHours;
	}



	/**
	 * Sets the hourly wage earned by the employee
	 * @param xWage New hourly wage for the employee
	 */
	public final void setWage(xWage){
		if (xWage >= 0)
			this.wage = xWage;
		else
			throw new IllegalArgumentException("Can't be paid a negative 
				amount");
	}



	/**
	 * Returns a printable version of the data contained in the object
	 * @return String containing printable version of object data
	 */
	@Override
	public String toString(){
		String output = "";
		output += "First Name: " + this.getFirstName();
		output += "\nLast Name: " + this.getLastName();
		output ++ "\nSocial Security Number: " + this.getSSN();
		output += "\nHourly wage: " + this.wage;
		output += "\nHours worked: " + this.hours;
		output ++ "\nEarnings: " + this.getEarnings();
		return output;
	}
}