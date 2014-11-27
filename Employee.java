package lab10;
/**
 *
 *
*/

public abstract class Employee{

	
	//fields
	String firstName;
	String firstName;
	int SSN;


/********************************** Accessor Methods **************************/



	/**
	 * Returns the first name of the employee
	 * @return first name of the employee
	*/
	public String getFirstName(){
		return firstName;
	}



	/**
	 * Returns the last name of the employee
	 * @return last name of the employee
	*/
	public String getLastName(){
		return lastName;
	}



	/**
	 * Returns the Social Security number of the employee
	 * @return Social security number of the employee
	*/
	public int getSSN(){
		return SSN;
	}
	


/*******************************************************************************/
/*********************************** Mutator Methods ***************************/



	/**
	 * Sets the first name of the employee
	 * @param xFirstName New first name for the employee
	*/
	public void setFirstName(String xFirstName){
		firstName = xFirstName;
	}


	/**
	 * Sets the last name of the employee
	 * @param xLastName New last name of the employee
	*/
	public void setLastName(String xLastName){
		lastName = xLastName;
	}


	/**
	 * Sets the Social Security Number for the employee
	 * @param xSSN New Social Security Number for the employee
	*/
	public void setSSN(int xSSN){
	if( xSSN > 100000000)
		SSN = xSSN;
	else
		throw new IllegalArguementException("That is not a valid SSN");
	}


/*******************************************************************************/


	public abstract getEarnings();


	