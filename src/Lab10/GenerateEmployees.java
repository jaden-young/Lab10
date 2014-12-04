package Lab10;

import java.util.Random;

/**
 * This is a client program containing a main method. Its purpose is to randomly
 * generate 10 different objects of Employee's subclasses, then print each of 
 * them with all of their data.
 * @author Jaden Young
 */
public class GenerateEmployees {
    
    
    //array of first names
    private final static String[] firstNames = { "George", "John", "Rutherford", 
        "Franklin", "Ulysses", "Marsha", "Sue", "Charolett", "Brenda", 
        "LaFonda" };
    
    
    //array of last names
    private final static String[] lastNames = { "Washington", "Adams", "Hayes",
        "Pierce", "Grant", "Billings", "Polk", "Kennedy", "Harrison", "Smith"};
    
    
    
    /**
     * Generates a 10 element array of Employee type with randomly populated
     * information.
     * <p>
     * A random number generator is used to decide which type of employee to 
     * create. First name and last name are randomly selected from arrays with 
     * generic names. The social security number is also assigned as a random 
     * value. The program is switched on the type of employee to create, and 
     * each different type initializes its unique instance variables to random
     * values using the random object. All values are passed to the constructor
     * for each iteration, and that new Employee object is added to an array
     * list. 
     * 
     * @return Array list with 10 randomly generated Employee objects
     */
    private static Employee[] generateEmployees(){
        
        
        //array that will hold random employee objects
        Employee[] employeeList = new Employee[10];
        Random rand = new Random();
        
    
        
        for(int i = 0; i < employeeList.length; i++){
            
            
            //chooses which type of employee and generates fields common to all
            int type = rand.nextInt(4);
            String firstName = firstNames[rand.nextInt(10)];
            String lastName = lastNames[rand.nextInt(10)];
            int SSN = (rand.nextInt(89999999) + 10000000);
            
            
            //creates objects of diferent classes depending on the randomly 
            //generated number
            switch (type){
                
                
                //Salaried employee
                case 0:
                    double weeklySalary = rand.nextDouble() * 1500;

                    employeeList[i] = new SalariedEmployee
                            (firstName,
                            lastName,
                            SSN,
                            weeklySalary);
                    
                    break;
                  
                    
                //Hourly employee
                case 1:
                    double wage = rand.nextDouble() * 40 + 7.25;
                    double hours = rand.nextDouble() * 80;
                    
                    employeeList[i] = new HourlyEmployee(
                            firstName,
                            lastName,
                            SSN,
                            wage,
                            hours);
                    
                    break;
                    
                    
                //Commission Employee
                case 2:
                    double commissionRate = rand.nextDouble();
                    double grossSales = rand.nextDouble() * 5000;
                    
                    employeeList[i] = new CommissionEmployee(
                        firstName,
                        lastName,
                        SSN,
                        commissionRate,
                        grossSales);
                    
                    break;
                    
                    
                //Base Plus Commission Employee
                case 3:
                    double basePlusCommissionRate = rand.nextDouble();
                    double basePlusGrossSales = rand.nextDouble() * 5000;
                    double baseSalary = rand.nextDouble() * 500;
                    
                    employeeList[i] = new BasePlusCommissionEmployee(
                        firstName,
                        lastName,
                        SSN,
                        basePlusCommissionRate,
                        basePlusGrossSales,
                        baseSalary);
            }
        }
        return employeeList;
    }
    
    
    
    //Prints summary of each object in the array list
    public static void main(String[] args) {
        Employee[] employeeList = generateEmployees();
        
        for (Employee Obj : employeeList) {
            System.out.println(Obj.toString());
            System.out.println("");
        }
    }
}
