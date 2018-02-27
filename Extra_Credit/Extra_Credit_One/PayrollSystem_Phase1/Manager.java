package Extra_Credit.Extra_Credit_One.PayrollSystem_Phase1;

import java.util.ArrayList;

/**
 * The Manager class is a subclass of the SalariedEmployee class. It represents
 * salaried employees who also manage a department.
 * 
 * @author Mayelin
 */
public class Manager extends SalariedEmployee
{
    // instance variable
    private double bonus;
    
    
    /** 
     * This constructor sets the manager's id, name, list of paychecks received, 
     * annual salary, and weekly bonus.   
     * @param id          The manager's identification number.
     * @param first       The manager's first name.
     * @param last        The manager's last name.
     * @param paychecks   The list of paychecks the manager has received so far.
     * @param salary      The manager's annual salary.
     * @param bonus       The manager's weekly bonus.
     */
    public Manager(int id, String first, String last, ArrayList<Paycheck> paychecks, double salary, double bonus)
    {
        super(id, first, last, paychecks, salary);
        
        this.bonus = bonus;
    }
    
    
    /**
     * This is a copy constructor. It initializes the fields of the object being 
     * created to the same values as the fields in the object passed as an argument.
     * @param managerObj The object being copied.
     */
    public Manager(Manager managerObj)
    {
        super(managerObj);
        
        if( managerObj != null )
        {
            bonus = managerObj.bonus;
        }
    }
    
    
    /**
     * The getBonus method returns the bonus that the manager gets every week.
     * @return The manager's weekly bonus.
     */
    public double getBonus()
    {
        return bonus;
    }
    
    
    /**
     * The setBonus method sets the bonus amount that the manager gets.
     * @param bonus The value to store in the bonus field.
     */
    public void setBonus(double bonus)
    {
        this.bonus = bonus; 
    }
    
    
    /** 
     * The toString method returns a string containing the state of a Manager 
     * object.
     * @return A string containing the manager's information: id, first name, 
     * last name, list of paychecks received, annual salary, and weekly bonus.
     */
    @Override
    public String toString()
    {
        return  super.toString() +
                String.format("%5s %-24s %-20s\n", "", "Bonus:", bonus );
    }
    
}
