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
    public class Department{
        
        private int departmentID;
        private String departmentName;
        
        private Manager departmentManager;
        private ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
        //departmentManager Manager = new departmentManager();
        //List<String> strList = new ArrayList<String>();
        //ArrayList Paycheck = new ArrayList();


        public Department(int departmentID, String departmentName, Manager departmentManager, ArrayList<Employee> listOfEmployees) {
            this.departmentID = departmentID;
            this.departmentName = departmentName;
            this.departmentManager = departmentManager;
            this.listOfEmployees = listOfEmployees;
            
            ArrayList<Employee> listOfEmployeesCopy = new ArrayList<>(listOfEmployees);
            if ( listOfEmployees != null){
                
                for (Employee EmployeeElements : listOfEmployees)
                    listOfEmployeesCopy.add(new Employee(EmployeeElements));
            }
        }
        
        public Department(Department employee) {
           // super(employee);
            
            if(employee != null)
            {
            
            departmentID = employee.departmentID;
            departmentName = employee.departmentName;
            departmentManager = employee.departmentManager;
            listOfEmployees = employee.listOfEmployees;
                
            }
            
        }

        public int getDepartmentID() {
            return departmentID;
        }

        public void setDepartmentID(int departmentID) {
            this.departmentID = departmentID;
        }
        
        public String getDepartmentName() {
            return departmentName;
        }
        
        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        public ArrayList<Employee> getListOfEmployees() {
            ArrayList<Employee> listOfEmployees = new ArrayList<>();
            for (Employee EmployeekElements : listOfEmployees)
            listOfEmployees.add(new Employee(EmployeeElements));
            return listOfEmployees;
        }

        public void setListOfEmployees(ArrayList<Employee> listOfEmployees) {
            if(listOfEmployees != null){
                for (Employee EmployeeElements : listOfEmployees)
                    listOfEmployees.add( new Employee(EmployeeElements));
        }
        }
        public Manager getDepartmentManager() {
            return departmentManager;
        }

        public void setDepartmentManager(Manager departmentManager) {
            if(departmentManager != null){
                for (Employee EmployeeElements : listOfEmployees)
                    listOfEmployees.add(new Employee(EmployeeElements));
            }
        }

        @Override
        public String toString() {
            return "DepartmentID: " + departmentID + 
                   "\nDepartmentName: " + departmentName + 
                   "\nDepartmentManager: " + departmentManager +
                   "\nList Of Employees: " + listOfEmployees;
        }
        
        public boolean equals(Department employee){
            if (employee == null)
                return false;
                
                return departmentName.equals(employee.departmentName);
                 
        }
        
        
        public int compareTo(Department employee){
           /*
            if(this.departmentName== employee.departmentName)
                return 0;
            else if (this.departmentID > employee.departmentName)
                return 1;
            else
                return -1;
            */
        }

        public void addEmployee(Employee employee){
            listOfEmployees.add(new Employee(listOfEmployeesCopy));
            
            
        }
        
        
  
    }
