package Lab10;

/**
 * Defines a BasePlusCommissionEmployee object, a subclass of CommissionEmployee
 * with an addition field for base salary.
 * <p>
 * Default constructor initializes fields to default values. Get/set methods are 
 * provided for baseSalary. Set method ensures that the argument is positive.
 * Implements the getEarnings method, returns the earnings for the week by 
 * calling the getEarnings method from the superclass and adding on the base
 * salary. Provides toString and equals methods that override those in the 
 * parent class.
 * @author Jaden Young
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    
    //instance variable
    private double baseSalary;
    
    
    
    /**
     * Default constructor
     * <p>
     * Initializes first/last names to "No entry", SSN to 100000000, and
     * commissionRate, grossSales, and baseSalary to 0
     */
    public BasePlusCommissionEmployee(){
        super();
        this.baseSalary = 0;
    }
    
    
    /**
     * Overloaded constructor
     * <p>
     * Contains parameters for all fields
     * 
     * @param xFirstName first name of the employee
     * @param xLastName last name of the employee
     * @param xSSN Social Security Number of the employee
     * @param xCommissionRate commission rate of the employee
     * @param xGrossSales gross sales of the employee
     * @param xBaseSalary base salary of the employee
     */
    public BasePlusCommissionEmployee(String xFirstName,
                                      String xLastName,
                                      int xSSN,
                                      double xCommissionRate,
                                      double xGrossSales,
                                      double xBaseSalary){
        super(xFirstName, xLastName, xSSN, xCommissionRate, xGrossSales);
        this.setBaseSalary(xBaseSalary);
    }
    
    
    
    /**
     * Returns the base salary of the employee
     * 
     * @return Base salary of the employee
     */
    public double getBaseSalary(){
        return this.baseSalary;
    }
    
    
    
    /**
     * Returns the earnings for the week of the employee
     * 
     * @return Earnings for the week for the employee
     */
    @Override
    public double getEarnings(){
        return (super.getEarnings() + baseSalary);
    }
    
    
    
    /**
     * Sets the base salary of the employee
     * 
     * @param xBaseSalary new base salary of the employee
     */
    public final void setBaseSalary(double xBaseSalary){
        if(xBaseSalary >= 0)
            this.baseSalary = xBaseSalary;
        else
            throw new IllegalArgumentException("Base salary needs to be a " + 
                    "positive number");
    }
    
    
    
    /**
     * Returns a printable version of the data contained in the object
     * 
     * @return String containing printable version of data
     */
    @Override
    public String toString(){
        String output = super.toString();
        output += "\nBase Salary: " + money.format(this.getBaseSalary());
        return output;
    }
    
    
    
    /**
     * Compares two BasePlusCommissionEmployee objects for equality by comparing
     * all fields
     * 
     * @param xObj Object to be compared
     * @return True if objects are equal, false if not
     */
    @Override
    public boolean equals(Object xObj){
        if (!(super.equals(xObj)))
            return false;
        if (!(xObj instanceof BasePlusCommissionEmployee))
            return false;
        BasePlusCommissionEmployee Obj = (BasePlusCommissionEmployee) xObj;
        return (this.baseSalary == Obj.getBaseSalary());
    }
}                                                                 
