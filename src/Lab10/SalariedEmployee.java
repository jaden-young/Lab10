package Lab10;
/**
 * Subclass of Employee, defines a Salaried employee with a weekly salary.
 *
 * <p> Defines a salaried employee that adds a weekly salary to the 
 * Employee superclass. Default constructor initializes all variables to 
 * default values. Get/set methods are provided for weekly salary, as well as
 * toString and equals 
 * 
 */

public class SalariedEmployee extends Employee{



    //instance variable
    private double weeklySalary;



    /**
     * Default constructor, initializes all variables to default values
     */
    public SalariedEmployee(){
        super();
        weeklySalary = 0.0;
    }



    /**
     * Overloaded constructor
     * <p>
     * Initializes all variables to values passed as arguments
     * @param xFirstName First name of the employee
     * @param xLastName Last name of the employee
     * @param xSSN Social Security Number of the employee
     * @param xWeeklySalary Weekly salary of the employee
     */
    public SalariedEmployee(String xFirstName, String xLastName, int xSSN,
                                double xWeeklySalary){
        super(xFirstName, xLastName, xSSN);
        this.setWeeklySalary(xWeeklySalary);
    }



    /**
     * Returns the weekly salary of the employee
     * @return Weekly salary of the employee
     */
    @Override
    public double getEarnings(){
        return weeklySalary;
    }
    



    /**
     * Sets the weekly salary of the employee
     * @param xWeeklySalary New weekly salary for the employee
     */
    public final void setWeeklySalary(double xWeeklySalary){
        if(xWeeklySalary > 0)
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
    @Override
    public String toString(){
            String output = "";
            output += "First name: " + this.getFirstName();
            output += "\nLast name: " + this.getLastName();
            output += "\nSocial Security Number: " + this.getSSN();
            output += "\nWeekly salary: " + this.getEarnings();
            return output;
    }



    /**
     * Compares two SalariedEmployee objects for equality by comparing the 
     * data in the fields.
     * @param xObj object to be compared
     * @return True if objects are equal, false if not
     */
    @Override
    public boolean equals(Object xObj){
            if(!(xObj instanceof SalariedEmployee))
                    return false;
            SalariedEmployee Obj = (SalariedEmployee)xObj;

            if(!(this.getFirstName().equals(Obj.getFirstName())))
                    return false;
            if(!(this.getLastName().equals(Obj.getFirstName())))
                    return false;
            if(this.getSSN() != Obj.getSSN())
                    return false;
            return(this.getEarnings() == Obj.getEarnings());
    }
}