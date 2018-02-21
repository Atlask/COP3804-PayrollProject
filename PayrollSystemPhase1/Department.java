package PayrollSystemPhase1;

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
            return listOfEmployees;
        }

        public void setListOfEmployees(ArrayList<Employee> listOfEmployees) {
            this.listOfEmployees = listOfEmployees;
        }

        public Manager getDepartmentManager() {
            return departmentManager;
        }

        public void setDepartmentManager(Manager departmentManager) {
            this.departmentManager = departmentManager;
        }

        @Override
        public String toString() {
            return "DepartmentID: " + departmentID + 
                   "\nDepartmentName: " + departmentName + 
                   "\nDepartmentManager: " + departmentManager +
                   "\nList Of Employees: " + listOfEmployees;
        }
    }