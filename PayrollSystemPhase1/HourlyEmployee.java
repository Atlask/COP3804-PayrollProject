/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayrollSystemPhase1;

import java.util.ArrayList;

/**
 *
 * @author Rei
 */
public class HourlyEmployee extends Employee{

    private double hourlyRate;
    private double periodHours;



    public HourlyEmployee( int employeeID, String firstName, String lastName, ArrayList<Paycheck> listOfPaychecks, double hourlyRate, double periodHours) {
        super(employeeID, firstName, lastName, listOfPaychecks);
        this.hourlyRate = hourlyRate;
        this.periodHours = periodHours;
    }


    public HourlyEmployee(HourlyEmployee employee) {
        super(employee);

        if(employee != null)
        {


            hourlyRate = employee.hourlyRate;
            periodHours = employee.periodHours;

        }

    }


    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getPeriodHours() {
        return periodHours;
    }

    public void setPeriodHours(double periodHours) {
        this.periodHours = periodHours;
    }





    @Override
    public String toString() {
        String hour = super.toString() + String.format("%5s %-23s %s \n%5s %-23s %s", "", "HourlyRate:",
                hourlyRate, "", "PeriodHours:", periodHours);

        return hour + "\n";
    }
/*
    void addPaycheck(Paycheck paycheck_3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    String compareTo(HourlyEmployee employee_2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }






}
    