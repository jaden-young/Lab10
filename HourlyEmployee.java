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
	 * and wage/hours to 0
	 */
	public HourlyEmployee(){
		firstName = "No Entry";
		lastName = "No Entry";
		wage = 0;
		hours = 0;
	}



	/**
	 * Overloaded contructor
	 * <p>
	 * Creates a new object with values for all fields
	 */
	public HourlyEmployee(String xFirstName, String xLastName, int xSSN,
							double xWage, double xHours){
		firstName = xFirstName;
		lastName = xLastName;
		setSSN(xSSN);
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
		return hours;
	}



	/**
	 * Returns the total earnings of the employee for the week
	 * @return Earnings for the week of the employee
	 */
	public double getEarnings(){
		double pay = 0;
		
		//if employee has worked overtime
		if (hours > 40){
			hours -+ 40;
			pay += 1.5 * hours * wage;
			pay += 40 * wage;
		}

		//if employee has not worked overtime
		else
			pay = hours * wage;
		
		return pay;
	}



	/**
	 * Sets the number of hours the employee worked during the week
	 * @param xHours New number of hours worked for the week
	 */
	public void setHours(xHours){
		if (xHours < 0)
			throw new IllegalArgumentException("Needs to be a positive number");
		if (xHours > 168)
			throw new IllegalArgumentException("There aren't that many hours 
				+ in a week");
		hours = xHours;
	}



	/**
	 * Sets the hourly wage earned by the employee
	 * @param xWage New hourly wage for the employee
	 */
	public void setWage(xWage){
		if (xWage >= 0)
			wage = xWage;
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
		output += "First Name: " + firstName;
		output += 
	}
}