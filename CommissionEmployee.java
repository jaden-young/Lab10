package lab10;
/**
 * Defines a CommissionEmployee, a subclass of Employee with additional 
 * attributes for Comission Rate and Gross Sales.
 * <p>
 */
public class ComissionEmployee extends Employee{


	//instance variables
	private double commissionRate;
	private double grossSales;



	/**
	 * Default constructor
	 * <p>
	 * Initializes first/last name to "No Entry", SSN to 10000000, grossSales
	 * to 0, and commissionRate to 0
	 */
	public CommissionEmployee(){
		super();
		this.commissionRate = 0;
		this.grossSales = 0;
	}



	/**
	 * Overloaded constructor
	 * <p>
	 * Initializes all fields with values from arguements
	 * @param xFirstName First name of the employee
	 * @param xLastName Last name of the employee
	 * @param xSSN Social security number of the employee
	 * @param xCommissionRate Commission rate of the employee
	 * @param xGrossSales Total sales for the week made by the employee
	 */
	public CommissionEmployee(String xFirstName, String xLastName, int xSSN, 
								double xCommissionRate, double xGrossSales){
		super(xFirstName, xLastName, xSSN);
		this.setCommissionRate(xCommissionRate);
		this.setGrossSales(xGrossSales);
	}



	/**
	 * Returns the commission rate of the employee
	 * @return Commission rate of the employee
	 */
	public get
}