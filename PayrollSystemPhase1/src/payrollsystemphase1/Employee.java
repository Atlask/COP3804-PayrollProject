/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystemphase1;

import java.util.ArrayList;

/**
 *
 * @author Rei
 */
    public abstract class Employee{
        private int employeeID;
        private String firstName;
        private String lastName;
        //private ArrayList listOfPaychecks;
        //List<String> strList = new ArrayList<String>();
        //ArrayList listOfPaychecks = new ArrayList();
        private ArrayList<Paycheck> listOfPaychecks = new ArrayList<>();

        public Employee(int employeeID, String firstName, String lastName, ArrayList<Paycheck> listOfPaychecks) {
            this.employeeID = employeeID;
            this.firstName = firstName;
            this.lastName = lastName;
            this.listOfPaychecks = listOfPaychecks;
            //listOfPaychecks = Paycheck;
            ArrayList<Paycheck> listOfPaychecksCopy = new ArrayList<>(listOfPaychecks);
            if ( listOfPaychecks != null){
                
                for (Paycheck PaycheckElements : listOfPaychecks)
                    listOfPaychecksCopy.add(new Paycheck(PaycheckElements));
            
            }
        }
        
        public Employee(Employee employee){
            
            if (employee != null){
                
                
            
           
            this.employeeID = employee.employeeID;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
             this.listOfPaychecks = employee.listOfPaychecks;
            // this.listOfPaychecksCopy = employee.listOfPaychecksCopy;
            
            for (Paycheck PaycheckElements : employee.listOfPaychecks)
                listOfPaychecks.add(new Paycheck(PaycheckElements));
            
            }
            
                  
                  
            
                
         
            
        
        }
        
        public boolean equals(Employee employee){
            
            if (employee == null)
                return false;
                
                return firstName.equals(employee.firstName)
                 && lastName.equals(employee.lastName);
                
    
        }
        
        public int compareTo (Employee employee){
            
            Employee s = (Employee) employee;
            int result = this.lastName.compareTo(employee.getLastName());
            if (result == 0){
                result = this.getFirstName().compareTo(employee.getFirstName());
            }
            return result;

        }
        
        public void addPaycheck(Paycheck listOfPaychecksCopy){
            listOfPaychecks.add(new Paycheck(listOfPaychecksCopy));
        }

        public int getEmployeeID() {
            return employeeID;
        }

        public void setEmployeeID(int employeeID) {
            this.employeeID = employeeID;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public ArrayList getListOfPaychecks() {
            
            ArrayList<Paycheck> newList = new ArrayList<>();
            for (Paycheck PaycheckElements : listOfPaychecks)
            newList.add(new Paycheck(PaycheckElements));
            return newList;
            
            //return listOfPaychecks;
        }

        public void setListOfPaychecks(ArrayList<Paycheck> paychecks) {
            //listOfPaychecks.clear();
            if(paychecks != null){
                for (Paycheck PaycheckElements : listOfPaychecks)
                    listOfPaychecks.add( new Paycheck(PaycheckElements));
                    
            }
           // listOfPaychecks = paychecks;
        }
        
        @Override
    public String toString()
    {
        String output = String.format("\n%5s %-23s %s \n%5s %-23s %s \n%5s %-23s %s \n%5s %-23s ", 
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