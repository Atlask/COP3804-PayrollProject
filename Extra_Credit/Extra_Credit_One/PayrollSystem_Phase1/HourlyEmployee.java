package Extra_Credit.Extra_Credit_One.PayrollSystem_Phase1;

import java.util.*;

/**
 * The HourlyEmployee class is a subclass of the Employee class. It represents
 * employees that get paid by the hour.
 * 
 * @author Mayelin
 */
public class HourlyEmployee extends Employee
{
    // instance variables
    private double hourlyRate;
    private double periodHours;
        
    
    /** 
     * This constructor sets the hourly employee's id, name, list of paychecks
     * received, hourly rate, and period hours.   
     * @param id          The employee's identification number.
     * @param first       The employee's first name.
     * @param last        The employee's last name.
     * @param paychecks   The list of paychecks the employee has received so far.
     * @param rate        The employee's hourly rate.
     * @param periodHrs   The number of hours the employee works during a pay period.
     */
    public HourlyEmployee(int id, String first, String last, ArrayList<Paycheck> paychecks, double rate, double periodHrs)
    {
        super(id, first, last, paychecks);

        hourlyRate = rate;
        periodHours = periodHrs;
    }
    
    
    /**
     * This is a copy constructor. It initializes the fields of the object being 
     * created to the same values as the fields in the object passed as an argument.
     * @param hourlyEmpObj The object being copied.
     */
    public HourlyEmployee(HourlyEmployee hourlyEmpObj)
    {
        super(hourlyEmpObj);
        
        if( hourlyEmpObj != null )
        {
            hourlyRate = hourlyEmpObj.hourlyRate;
            periodHours = hourlyEmpObj.periodHours;
        }
    }
    
    
    /**
     * The getHourlyRate method returns the rate that the employee gets paid per hour.
     * @return The employee's hourly rate.
     */
    public double getHourlyRate()
    {
        return hourlyRate;
    }
    
    
    /**
     * The getPeriodHours method returns the number of hours the employee works 
     * during a pay period.
     * @return The employee's period hours.
     */
    public double getPeriodHours()
    {
        return periodHours;
    }
    
    
    /**
     * The setHourlyRate method sets the rate that the employee gets paid per hour.
     * @param rate The value to store in the hourly rate field.
     */
    public final void setHourlyRate(double rate)
    {
        hourlyRate = rate;
    }
    
    
    /**
     * The setPeriodHours method sets the number of hours the employee works 
     * during a pay period.
     * @param periodHrs The value to store in the period hours field.
     */
    public final void setPeriodHours(double periodHrs)
    {
        periodHours = periodHrs;
    }
    
    
    /** 
     * The toString method returns a string containing the state of an HourlyEmployee object.
     * @return A string containing the employee's information: id, first name, 
     * last name, list of paychecks received, hourly rate, and period hours.
     */
    @Override
    public String toString()
    {
        return  super.toString() + 
                String.format(  "%5s %-24s %-20s \n%5s %-24s %-20s", 
                                "", "Hourly Rate:", hourlyRate, 
                                "", "Period Hours:", periodHours );
    }
    
}
