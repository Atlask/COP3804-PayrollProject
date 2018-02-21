package PayrollSystemPhase1;

import java.util.ArrayList;

/**
 *
 * @author Rei
 */
    public class SalariedEmployee extends Employee{
        
        private double annualSalary;

        public SalariedEmployee(int employeeID, String firstName, String lastName, ArrayList<Paycheck> listOfPaychecks, double annualSalary) {
            super(employeeID, firstName, lastName, listOfPaychecks);
            this.annualSalary = annualSalary;
        }

        public SalariedEmployee(double annualSalary, Employee employee) {
            super(employee);
            this.annualSalary = annualSalary;
        }
        
        public SalariedEmployee(SalariedEmployee employee) {
            super(employee);
            
            if(employee != null)
            {
            
            annualSalary = employee.annualSalary;
            
                
            }
            
        }
        

        public double getAnnualSalary() {
            return annualSalary;
        }

        public void setAnnualSalary(double annualSalary) {
            this.annualSalary = annualSalary;
        }

        
        @Override
        public String toString() {
            String hour = super.toString() + String.format("%5s %-23s %s ","", "AnnualSalary:", annualSalary);
            
            return hour + "\n";
        }
    }