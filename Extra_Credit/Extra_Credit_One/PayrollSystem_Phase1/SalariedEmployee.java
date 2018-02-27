package Extra_Credit.Extra_Credit_One.PayrollSystem_Phase1;

import java.util.ArrayList;

/**
 * The SalariedEmployee class is a subclass of the Employee class. It represents
 * employees that get paid an annual salary.
 * 
 * @author Mayelin
 */
public class SalariedEmployee extends Employee
{
    // instance variable
    private double annualSalary;
    
    
    /** 
     * This constructor sets the salaried employee's id, name, date of birth, list of
     * paychecks received, and annual salary.   
     * @param id          The employee's identification number.
     * @param first       The employee's first name.
     * @param last        The employee's last name.
     * @param paychecks   The list of paychecks the employee has received so far.
     * @param salary      The employee's annual salary.
     */
    public SalariedEmployee(int id, String first, String last, ArrayList<Paycheck> paychecks, double salary)
    {
        super(id, first, last, paychecks);

        annualSalary = salary;
    }
    
    
    /**
     * This is a copy constructor. It initializes the fields of the object being 
     * created to the same values as the fields in the object passed as an argument.
     * @param salariedEmpObj The object being copied.
     */
    public SalariedEmployee(SalariedEmployee salariedEmpObj)
    {
        super(salariedEmpObj);
        
        if( salariedEmpObj != null )
        {
            annualSalary = salariedEmpObj.annualSalary;
        }
    }
    
    
    /**
     * The getAnnualSalary method returns the salary that the employee gets paid 
     * per year.
     * @return The employee's annual salary.
     */
    public double getAnnualSalary()
    {
        return annualSalary;
    }
    
    
    /**
     * The setAnnualSalary method sets the salary that the employee gets paid 
     * per year.
     * @param salary The value to store in the annual salary field.
     */
    public final void setAnnualSalary(double salary)
    {
        annualSalary = salary;
    }
    
    
    /** 
     * The toString method returns a string containing the state of a SalariedEmployee 
     * object.
     * @return A string containing the employee's information: id, first name, 
     * last name, list of paychecks received, and annual salary.
     */
    @Override
    public String toString()
    {
        return  super.toString() +
                String.format("%5s %-24s %-20s\n", "", "Annual Salary:", annualSalary );
    }
    
}
