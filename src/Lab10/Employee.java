package Lab10;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
* Abstract superclass containing common methods/fields for various types of 
* employees
* <p>
* Contains fields for first name, last name, and social security number,
* get/set methods for each field, and an abstract method getEarnings()
* to calculate the earnings of the employee for the pay period.
* 
* @author Jaden Young
*/

public abstract class Employee{


    //common fields
    private  String firstName;
    private  String lastName;
    private  int SSN;


    //formats for toString output
    NumberFormat money = NumberFormat.getCurrencyInstance();
    DecimalFormat percent = new DecimalFormat("%0.##");
    

    /**
     * Default constructor
     * <p>
     * Initializes names to "No Entry", SSN to 10000000, and salary to 0.
     */
    public Employee(){
            this.firstName = "No Entry";
            this.lastName = "No Entry";
            this.setSSN(10000000);
    }



    /**
     * Overloaded constructor
     * <p>
     * Contains parameters for all fields
     * 
     * @param xFirstName First name of the employee
     * @param xLastName Last name of the employee
     * @param xSSN Social Security Number of the employee
     */
    public Employee(String xFirstName, String xLastName, int xSSN){
            this.firstName = xFirstName;
            this.lastName = xLastName;
            this.setSSN(xSSN);
    }



/********************************** Accessor Methods *************************/



    /**
     * Returns the first name of the employee
     * 
     * @return first name of the employee
     */
    public String getFirstName(){
            return this.firstName;
    }



    /**
     * Returns the last name of the employee
     * 
     * @return last name of the employee
     */
    public String getLastName(){
            return this.lastName;
    }



    /**
     * Returns the Social Security number of the employee
     * 
     * @return Social security number of the employee
     */
    public int getSSN(){
            return this.SSN;
    }



/*****************************************************************************/
/*********************************** Mutator Methods *************************/



    /**
     * Sets the first name of the employee
     * 
     * @param xFirstName New first name for the employee
     */
    public void setFirstName(String xFirstName){
            this.firstName = xFirstName;
    }



    /**
     * Sets the last name of the employee
     * 
     * @param xLastName New last name of the employee
     */
    public void setLastName(String xLastName){
            this.lastName = xLastName;
    }



    /**
     * Sets the Social Security Number for the employee
     * 
     * @param xSSN New Social Security Number for the employee
     */
    public final void setSSN(int xSSN){
        if(xSSN >= 10000000)
            this.SSN = xSSN;
        else
            throw new IllegalArgumentException("Must be an 8 digit number");
    }



/**************************************************************************/


    /**
     * Abstract method to return the earnings of the employee
     * 
     * @return 
    */
    public abstract double getEarnings();



    /**
     * Returns a printable version of the first/last name and SSN
     * 
     * @return Printable version of the first/last name and SSN
     */
    @Override
    public String toString(){
        String output = "";
        output += "First name: " + this.firstName;
        output += "\nLast name: " + this.lastName;
        output += "\nSocial Security Number: " + this.SSN;
        return output;
    }
    
    
    
    /**
     * Compares two Employee objects for equality by comparing all fields
     * 
     * @param xObj Object to be compared
     * @return True if objects are equal, false if not
     */
    @Override
    public boolean equals(Object xObj){
        if (!(xObj instanceof Employee))
            return false;
        Employee Obj = (Employee)xObj;
        if (!(this.firstName.equals(Obj.getFirstName())))
            return false;
        if (!(this.lastName.equals(Obj.getLastName())))
            return false;
        return (this.SSN == Obj.getSSN());
    }
}