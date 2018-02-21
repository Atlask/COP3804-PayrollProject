package PayrollSystemPhase1;

/**
 *
 * @author Rei
 */
    public class Paycheck{
    
        private int employeeID;
        private String periodBeginDate;
        private String periodEndDate;
        private double grossAmount;
        private double taxAmount;
        private double bonusAmount;
        private double netAmount;

        public Paycheck(int employeeID, String periodBeginDate, String periodEndDate, double grossAmount, double taxAmount, double bonusAmount, double netAmount) {
            this.employeeID = employeeID;
            this.periodBeginDate = periodBeginDate;
            this.periodEndDate = periodEndDate;
            this.grossAmount = grossAmount;
            this.taxAmount = taxAmount;
            this.bonusAmount = bonusAmount;
            this.netAmount = netAmount;
        }
        
        public Paycheck(Paycheck employee) {
               //super(employee);
            
            if(employee != null)
            {
            
            employeeID = employee.employeeID;
            periodBeginDate = employee.periodBeginDate;
            periodEndDate = employee.periodEndDate;
            grossAmount = employee.grossAmount;
            taxAmount = employee.taxAmount;
            bonusAmount = employee.bonusAmount;
            netAmount = employee.netAmount;
                  
                  
            
                
            }
            
        }
        

        public int getEmployeeID() {
            return employeeID;
        }

        public void setEmployeeID(int employeeID) {
            this.employeeID = employeeID;
        }

        public String getPeriodBeginDate() {
            return periodBeginDate;
        }

        public void setPeriodBeginDate(String periodBeginDate) {
            this.periodBeginDate = periodBeginDate;
        }

        public String getPeriodEndDate() {
            return periodEndDate;
        }

        public void setPeriodEndDate(String periodEndDate) {
            this.periodEndDate = periodEndDate;
        }

        public double getGrossAmount() {
            return grossAmount;
        }

        public void setGrossAmount(double grossAmount) {
            this.grossAmount = grossAmount;
        }

        public double getTaxAmount() {
            return taxAmount;
        }

        public void setTaxAmount(double taxAmount) {
            this.taxAmount = taxAmount;
        }

        public double getBonusAmount() {
            return bonusAmount;
        }

        public void setBonusAmount(double bonusAmount) {
            this.bonusAmount = bonusAmount;
        }

        public double getNetAmount() {
            return netAmount;
        }

        public void setNetAmount(double netAmount) {
            this.netAmount = netAmount;
        }

        @Override
        public String toString() {
            return "\n                              EmployeeID: "+ employeeID + 
                   "\n                              PeriodBeginDate: " + periodBeginDate + 
                   "\n                              PeriodEndDate: " + periodEndDate + 
                   "\n                              GrossAmount: " + grossAmount + 
                   "\n                              TaxAmount: " + taxAmount + 
                   "\n                              BonusAmount: " + bonusAmount + 
                   "\n                              NetAmount: " + netAmount
                  +"\n                              -------------------------------";
        }
        //31
        

        
}

