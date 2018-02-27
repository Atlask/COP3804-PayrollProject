package Extra_Credit.Extra_Credit_One.PayrollSystem_Phase1;


/**
 * The Paycheck class represents a paycheck paid to an employee for a pay period.
 * 
 * @author Mayelin
 */
public class Paycheck
{
    // instance variables
    private int employeeID;
    private String periodBeginDate;
    private String periodEndDate;
    private double grossAmount;
    private double taxAmount;
    private double bonusAmount;
    private double netAmount;
    
    
    /** 
     * The constructor sets the paycheck's employee id, begin and end dates for  
     * the pay period, as well as the gross, tax, bonus and net amounts.   
     * @param empID       Identification number of the employee receiving this paycheck.
     * @param beginDate   Begin date for this paycheck's pay period.
     * @param endDate     End date for this paycheck's pay period.
     * @param grossAmt    Gross amount paid in this paycheck.
     * @param taxAmt      Tax amount deducted in this paycheck.
     * @param bonusAmt    Bonus amount paid in this paycheck.
     * @param netAmt      Net amount paid in this paycheck.
     */
    public Paycheck(int empID, String beginDate, String endDate, double grossAmt, double taxAmt, double bonusAmt, double netAmt)
    {
        employeeID = empID;
        periodBeginDate = beginDate;
        periodEndDate = endDate;
        grossAmount = grossAmt;
        taxAmount = taxAmt;
        bonusAmount = bonusAmt;
        netAmount = netAmt;
    }

    
     /**
     * This is a copy constructor. It initializes the fields of the object being 
     * created to the same values as the fields in the object passed as an argument.
     * @param paycheckObj The object being copied.
     */
    public Paycheck(Paycheck paycheckObj)
    {   
        if( paycheckObj != null )
        {
            employeeID = paycheckObj.employeeID;
            periodBeginDate = paycheckObj.periodBeginDate;
            periodEndDate = paycheckObj.periodEndDate;
            grossAmount = paycheckObj.grossAmount;
            taxAmount = paycheckObj.taxAmount;
            bonusAmount = paycheckObj.bonusAmount;
            netAmount = paycheckObj.netAmount;
        }
    }
    
    
    /**
     * The getEmployeeID method returns the identification number of the employee 
     * receiving this paycheck.
     * @return The employee's id.
     */
    public int getEmployeeID()
    {
        return employeeID;
    }

    
    /**
     * The getPeriodBeginDate method returns the begin date for this paycheck's pay period.
     * @return The pay period's begin date.
     */
    public String getPeriodBeginDate()
    {
        return periodBeginDate;
    }

    
    /**
     * The getPeriodEndDate method returns the end date for this paycheck's pay period.
     * @return The pay period's end date.
     */
    public String getPeriodEndDate()
    {
        return periodEndDate;
    }

    
    /**
     * The getGrossAmount method returns the gross amount paid in this paycheck.
     * @return The paycheck's gross amount.
     */
    public double getGrossAmount()
    {
        return grossAmount;
    }

    
    /**
     * The getTaxAmount method returns the tax amount deducted in this paycheck.
     * @return The paycheck's tax amount.
     */
    public double getTaxAmount()
    {
        return taxAmount;
    }

    
    /**
     * The getBonusAmount method returns the bonus amount paid in this paycheck.
     * @return The paycheck's bonus amount.
     */
    public double getBonusAmount()
    {
        return bonusAmount;
    }

    
    /**
     * The getNetAmount method returns the net amount that the employee is getting paid in this paycheck.
     * @return The paycheck's net amount.
     */
    public double getNetAmount()
    {
        return netAmount;
    }

    
    /**
     * The setEmployeeID method sets the identification number of the employee 
     * receiving this paycheck.
     * @param empID The value to store in the employee ID field.
     */
    public void setEmployeeID(int empID)
    {
        employeeID = empID;
    }

    
    /**
     * The setPeriodBeginDate method sets the begin date for this paycheck's pay period.
     * @param beginDate The value to store in the pay period begin date field for this paycheck.
     */
    public void setPeriodBeginDate(String beginDate)
    {
        periodBeginDate = beginDate;
    }

    
    /**
     * The setPeriodEndDate method sets the end date for this paycheck's pay period.
     * @param endDate The value to store in the pay period end date field for this paycheck.
     */
    public void setPeriodEndDate(String endDate)
    {
        periodEndDate = endDate;
    }

    
    /**
     * The setGrossAmount method sets the gross amount for this paycheck.
     * @param payAmt The value to store in the gross amount field for this paycheck.
     */
    public void setGrossAmount(double payAmt)
    {
        grossAmount = payAmt;
    }

    
    /**
     * The setTaxAmount method sets the tax amount for this paycheck.
     * @param taxAmount The value to store in the tax amount field for this paycheck.
     */
    public void setTaxAmount(double taxAmount)
    {
        this.taxAmount = taxAmount;
    }

    
    /**
     * The setBonusAmount method sets the bonus amount for this paycheck.
     * @param bonusAmount The value to store in the bonus amount field for this paycheck.
     */
    public void setBonusAmount(double bonusAmount)
    {
        this.bonusAmount = bonusAmount;
    }

    
    /**
     * The setNetAmount method sets the net amount for this paycheck.
     * @param netAmount The value to store in the net amount field for this paycheck.
     */
    public void setNetAmount(double netAmount)
    {
        this.netAmount = netAmount;
    }
    
    
    /** 
     * The toString method returns a string containing the paycheck's data.
     * @return A String containing the Paycheck's information: employee id,
     * pay period begin and end dates, as well as gross, tax, bonus, and net amounts.
     */
    @Override
    public String toString()
    {
        String separator = String.format("\n%30s %031d", "", 0).replace('0', '-');
        
        return  String.format(  "\n%30s %-20s %10s \n%30s %-20s %10s \n%30s %-20s %10s " +
                                "\n%30s %-20s %10s \n%30s %-20s %10s \n%30s %-20s %10s " +
                                "\n%30s %-20s %10s", 
                                "", "Employee ID:", employeeID,
                                "", "Period Begin Date:", periodBeginDate,
                                "", "Period End Date:", periodEndDate, 
                                "", "Gross Amount:", grossAmount, 
                                "", "Tax Amount:", taxAmount, 
                                "", "Bonus Amount:", bonusAmount, 
                                "", "Net Amount:", netAmount) + separator;
    }


}
