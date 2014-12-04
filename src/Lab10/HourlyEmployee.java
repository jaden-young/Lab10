package Lab10;

import java.text.DecimalFormat;

/**
* Defines an Hourly Employee, a subclass of Employee with the additional fields
* for wage and hours.
* <p> 
* Default constructor initializes all fields to default values. Get/set methods
* are provided for the employee's wage and hours. Both mutator methods check
* to ensure arguments are positive numbers. The getEarnings method is 
* implemented, and returns the earnings for the week by multiplying the hours
* worked and wage per hour. It also checks for overtime, and any hours worked
* over 40 will be counted for time and a half. toString and equals methods are 
* provided that override those in the parent class.
*
* @author Jaden Young
*/
public class HourlyEmployee extends Employee{


    //instance variables
    private double wage;
    private double hours;

    DecimalFormat decimal = new DecimalFormat("0.##");

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
     * Overloaded constructor
     * <p>
     * Creates a new object with values for all fields
     * 
     * @param xFirstName First name of the employee 
     * @param xLastName Last name of the employee
     * @param xSSN Social Security Number of the employee
     * @param xWage Hourly wage of the employee
     * @param xHours Hours worked for the week by the employee
     */
    public HourlyEmployee(String xFirstName, String xLastName, int xSSN, 
            double xWage, double xHours){
        super(xFirstName, xLastName, xSSN);
        setWage(xWage);
        setHours(xHours);
    }



    /**
     * Returns the hourly wage of the employee
     * 
     * @return Hourly wage of the employee
     */
    public final double getWage(){
            return wage;
    }



    /**
     * Returns the number of hours worked by the employee
     * 
     * @return Number of hours worked by the employee
     */
    public final double getHours(){
            return this.hours;
    }



    /**
     * Returns the total earnings of the employee for the week
     * 
     * @return Earnings for the week of the employee
     */
    @Override
    public double getEarnings(){
        double pay = 0;

        //if employee has worked overtime
        if (this.hours > 40){
            this.hours -= 40;
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
     * 
     * @param xHours New number of hours worked for the week
     */
    public final void setHours(double xHours){
        if (xHours < 0)
            throw new IllegalArgumentException("Needs to be a positive number");
        if (xHours > 168)
            throw new IllegalArgumentException("There aren't that many hours " 
                        + "in a week");
        this.hours = xHours;
    }



    /**
     * Sets the hourly wage earned by the employee
     * 
     * @param xWage New hourly wage for the employee
     */
    public final void setWage(double xWage){
        if (xWage < 0)
            throw new IllegalArgumentException("Can't be paid a negative "
                    + "amount");
        if (xWage < 7.25)
            throw new IllegalArgumentException("That is below the federal " +
                    "minimum wage");
        wage = xWage;
    }



    /**
     * Returns a printable version of the data contained in the object
     * 
     * @return String containing printable version of object data
     */
    @Override
    public String toString(){
        String output = "Type: Hourly Employee";
        output += "\n" + super.toString();
        output += "\nHourly wage: " + money.format(this.wage);
        output += "\nHours worked: " + decimal.format(this.hours);
        output += "\nEarnings: " + money.format(this.getEarnings());
        return output;
    }
    
    
    
    /**
     * Compares two HourlyEmployee objects for equality by checking all fields
     * 
     * @param xObj Object to be compared
     * @return True if objects are equal, false if not
     */
    @Override
    public boolean equals(Object xObj){
        if (!(super.equals(xObj)))
            return false;
        if (!(xObj instanceof HourlyEmployee))
            return false;
        HourlyEmployee Obj = (HourlyEmployee) xObj;
        if (this.hours != Obj.getHours())
            return false;
        return (this.wage == Obj.getWage());
    }
}