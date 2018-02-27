package Extra_Credit.Extra_Credit_One.PayrollSystem_Phase1;

import java.util.ArrayList;

/**
 * The Employee class is an abstract class that holds general data about a company's 
 * employee. Classes representing more specific types of employees should inherit
 * from this class.
 * 
 * @author Mayelin
 */
public abstract class Employee
{
    // instance variables
    private int employeeID;
    private String firstName;
    private String lastName;
    private ArrayList<Paycheck> listOfPaychecks = new ArrayList<>();
    
    
    /** 
     * This constructor sets the employee's id, name, and the list of
     * paychecks received.   
     * @param id          The employee's identification number.
     * @param first       The employee's first name.
     * @param last        The employee's last name.
     * @param paychecks   The list of paychecks the employee has received so far.
     */
    public Employee(int id, String first, String last, ArrayList<Paycheck> paychecks)
    {
        employeeID = id;
        firstName = first;
        lastName = last;
        listOfPaychecks = paychecks;  
    }
    
    
    /**
     * This is a copy constructor. It initializes the fields of the object being 
     * created to the same values as the fields in the object passed as an argument.
     * @param employeeObj The object being copied.
     */
    public Employee(Employee employeeObj)
    {
        if( employeeObj != null )
        {
            employeeID = employeeObj.employeeID;
            firstName = employeeObj.firstName;
            lastName = employeeObj.lastName;
            listOfPaychecks = employeeObj.listOfPaychecks;
        }
    }
    
    
    /**
     * The getEmployeeID method returns the employee's identification number.
     * @return The employee's id.
     */
    public int getEmployeeID()
    {
        return employeeID;
    }
    
    
    /**
     * The getFirstName method returns the employee's first name.
     * @return The employee's first name.
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    
    /**
     * The getLastName method returns the employee's last name.
     * @return The employee's last name.
     */
    public String getLastName()
    {
        return lastName;
    }
    
    
    /**
     * The getListOfPaychecks method returns a list containing all the paychecks 
     * the employee has received.
     * @return A reference to the employee's list of paychecks.
     */
    public ArrayList<Paycheck> getListOfPaychecks()
    {
        return listOfPaychecks;
    }
    
        
    /**
     * The setEmployeeID method sets the employee's identification number.
     * @param id The value to store in the employee id field.
     */
    public void setEmployeeID(int id)
    {
        employeeID = id;
    }
    
    
    /**
     * The setFirstName method sets the employee's first name.
     * @param first The value to store in the first name field.
     */
    public void setFirstName(String first)
    {
        firstName = first;
    }
    
    
    /**
     * The setLastName method sets the employee's last name.
     * @param last The value to store in the last name field.
     */
    public void setLastName(String last)
    {
        lastName = last;
    }
    
    
    /**
     * The setListOfPaychecks method sets the list of paychecks that the employee 
     * has received.
     * @param paychecks The value as an ArrayList of Paycheck elements to store 
     * in the list of paychecks field.
     */
    public void setListOfPaychecks(ArrayList<Paycheck> paychecks)
    {
        listOfPaychecks = paychecks; 
    }
    
    
    /** 
     * The toString method returns a string containing the state of an Employee object.
     * @return A string containing the employee's information: id, first name, 
     * last name, and list of paychecks received.
     */
    @Override
    public String toString()
    {
        String output = String.format("\n%5s %-24s %s \n%5s %-24s %s \n%5s %-24s %s \n%5s %-24s ", 
                                           "", "Employee ID:", employeeID,
                                           "", "First Name:", firstName,
                                           "", "Last Name:", lastName,
                                           "", "Paychecks Received:");
        
        if( listOfPaychecks == null || listOfPaychecks.isEmpty() )
            output += "No paychecks received.";
        else
        {
            for( Paycheck checkElement : listOfPaychecks)
                output += checkElement.toString();
        }
        
        return output + "\n";               
    }

}
