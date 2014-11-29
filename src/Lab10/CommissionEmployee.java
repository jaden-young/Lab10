package Lab10;
import java.text.NumberFormat;
/**
* Defines a CommissionEmployee, a subclass of Employee with additional 
* attributes for Commission Rate and Gross Sales.
* <p>
* 
* @author Jaden Young
*/
public class CommissionEmployee extends Employee{


    //instance variables
    private double commissionRate;
    private double grossSales;
    
    //format for percent/currency
    NumberFormat money = NumberFormat.getCurrencyInstance();
    NumberFormat percent = NumberFormat.getPercentInstance();
    
    

    /**
     * Default constructor
     * <p>
     * Initializes first/last name to "No Entry", SSN to 10000000, grossSales to
     * 0, and commissionRate to 0
     */
    public CommissionEmployee() {
        super();
        this.commissionRate = 0;
        this.grossSales = 0;
    }

    
    
    /**
     * Overloaded constructor
     * <p>
     * Initializes all fields with values from arguments
     *
     * @param xFirstName First name of the employee
     * @param xLastName Last name of the employee
     * @param xSSN Social security number of the employee
     * @param xCommissionRate Commission rate of the employee
     * @param xGrossSales Total sales for the week made by the employee
     */
    public CommissionEmployee(String xFirstName, String xLastName, int xSSN,
            double xCommissionRate, double xGrossSales) {
        super(xFirstName, xLastName, xSSN);
        this.setCommissionRate(xCommissionRate);
        this.setGrossSales(xGrossSales);
    }

    
    
    /**
     * Returns the commission rate of the employee
     *
     * @return Commission rate of the employee
     */
    public double getComissionRate() {
        return commissionRate;
    }

    
    
    /**
     * Returns the gross sales of the employee
     *
     * @return Gross sales of the employee
     */
    public double getGrossSales() {
        return grossSales;
    }

    
    
    /**
     * Returns the earnings for the week of the employee
     *
     * @return Earnings for the week of the employee
     */
    @Override
    public double getEarnings() {
        return (commissionRate * grossSales);
    }

    
    
    /**
     * Sets the commission rate of the employee
     *
     * @param xCommissionRate New commission rate for the employee
     */
    public final void setCommissionRate(double xCommissionRate) {
        if (xCommissionRate >= 0)
            commissionRate = xCommissionRate;
        else
            throw new IllegalArgumentException("Rate must be a positive " +
                    "number");
    }


    
     /**
     * Sets the gross sales of the employee
     * 
     * @param xGrossSales New gross sales for the employee
     */
    public final void setGrossSales(double xGrossSales) {
        if (xGrossSales >= 0)
            grossSales = xGrossSales;
        else
            throw new IllegalArgumentException("Sales must be a positive " + 
                    "number");
    }



    /**
     * Returns a printable version of the data contained in the object
     * @return String containing printable version of the data in the object
     */
    @Override
    public String toString() {
        String output = super.toString();
        output += "\n Commission rate: " + percent.format(this.commissionRate);
        output += "\n Gross sales: " + money.format(this.grossSales);
        return output;
    }
}