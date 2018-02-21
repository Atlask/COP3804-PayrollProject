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
    public abstract class Employee{
        private int employeeID;
        private String firstName;
        private String lastName;
        //private ArrayList listOfPaychecks;
        //List<String> strList = new ArrayList<String>();
        //ArrayList listOfPaychecks = new ArrayList();
        private ArrayList<Paycheck> listOfPaychecks = new ArrayList<>();

        public Employee(int employeeID, String firstName, String lastName, ArrayList listOfPaychecks) {
            this.employeeID = employeeID;
            this.firstName = firstName;
            this.lastName = lastName;
            this.listOfPaychecks = listOfPaychecks;
        }
        
        public Employee(Employee employee){
            if (employee != null){
                
                
            
           
            this.employeeID = employee.employeeID;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
             this.listOfPaychecks = employee.listOfPaychecks;
            
            }
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
            return listOfPaychecks;
        }

        public void setListOfPaychecks(ArrayList<Paycheck> paychecks) {
            listOfPaychecks = paychecks;
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