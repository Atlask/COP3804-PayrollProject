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
    }