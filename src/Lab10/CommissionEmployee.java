package Lab10;

/**
* Defines a CommissionEmployee, a subclass of Employee with additional 
* attributes for Commission Rate and Gross Sales.
* <p>
* Default constructor initializes all fields to default values. 
* Contains get/set methods for both Commission Rate and Gross Sales. Set methods
* for each require an argument to be positive, else throw exceptions. Implements
* the getEarnings method that calculates earning by multiplying gross sales 
* and commission rate. toString and equals methods are provided which override
* the parent class.
* @author Jaden Young
*/
public class CommissionEmployee extends Employee{


    //instance variables
    private double commissionRate;
    private double grossSales;
    
    

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
    public double getCommissionRate() {
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
        if (xCommissionRate < 0 || xCommissionRate > 1)
            throw new IllegalArgumentException("Rate must be a positive " +
                    "number");
        else
            commissionRate = xCommissionRate;
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
     * 
     * @return String containing printable version of the data in the object
     */
    @Override
    public String toString() {
        String output = "Type: Commission Employee";
        output += "\n" + super.toString();
        output += "\n Commission rate: " + percent.format(this.commissionRate);
        output += "\n Gross sales: " + money.format(this.grossSales);
        output += "\n Earnings: " + money.format(this.getEarnings());
        return output;
    }
    
    
    
    /**
     * Returns a printable version of the data contained in the class without 
     * the type of the class
     * <p>
     * This is for use in the subclass. It allows the subclass to add its type
     * to the beginning of the string for its toString method.
     * 
     * @return String containing all data in the class except for type of 
     * employee
     */
    public String toStringNoType() {
        String output = super.toString();
        output += "\nCommission rate: " + percent.format(this.commissionRate);
        output += "\nGross sales: " + money.format(this.grossSales);
        output += "\nEarnings: " + money.format(this.getEarnings());
        return output;
    }
    
    
    
    /**
     * Compares two CommissionEmployee objects for equality by comparing all
     * fields
     * 
     * @param xObj Object to be compared
     * @return True if objects are equal, false if not
     */
    @Override
    public boolean equals(Object xObj){
        if (!(super.equals(xObj)))
            return false;
        if (!(xObj instanceof CommissionEmployee))
            return false;
        CommissionEmployee Obj = (CommissionEmployee) xObj;
        
        if (this.commissionRate != Obj.getCommissionRate())
            return false;
        return (this.grossSales == Obj.getGrossSales());
    }
}