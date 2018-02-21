package PayrollSystemPhase1;
import java.util.*;

/**
 *
 * @author Rei
 */
public class Manager extends SalariedEmployee{
        
        private double bonus;
/*
        public Manager(int employeeID, String firstName, String lastName, ArrayList<Paycheck> listOfPaychecks, double bonus) {
            super(annualSalary, employee);
            this.bonus = bonus;
        }
*/
        public Manager(int employeeID, String firstName, String lastName, ArrayList<Paycheck> listOfPaychecks,double annualSalary, double bonus)  {
            super(employeeID, firstName, lastName, listOfPaychecks, annualSalary);
            this.bonus = bonus;
        }
        
        public Manager(Manager employee) {
            super(employee);
            
            if(employee != null)
            {
            
            bonus = employee.bonus;
            
                
            }
            
        }
        

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }


        @Override
        public String toString() {
             String hour = super.toString() + String.format("      Bonus:" + "                  " + bonus);
             
             return hour + "\n";
        }
}
        
        

