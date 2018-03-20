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
    public class Company {
        private String companyName;
        ArrayList<Department> listOfdepartments = new ArrayList<Department>();

            public Company(String companyName, ArrayList<Department> listOfdepartments) {
                this.companyName = companyName;
                this.listOfdepartments = listOfdepartments;
            }
            

            public String getCompanyName() {
                return companyName;
            }

            public void setCompanyName(String companyName) {
                this.companyName = companyName;
            }

            public ArrayList<Department> getListOfdepartments() {
                return listOfdepartments;
            }

            public void setDepartmentList(ArrayList<Department> listOfdepartments) {
                this.listOfdepartments = listOfdepartments;
            }
            

            @Override
            public String toString() {
               String hour = "CompanyName:" + companyName + "\n" + listOfdepartments;
               
               return hour;
            }

    void addDepartment(Department dept_2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addEmployeeToDepartment(int i, SalariedEmployee employee_7) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDepartmentManager(int i, Manager manager_3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
        
    }
        
        
        
        
  
    

