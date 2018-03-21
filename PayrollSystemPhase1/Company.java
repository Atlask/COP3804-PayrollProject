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
public class Company {
    private String companyName;
    ArrayList<Department> listOfdepartments = new ArrayList<Department>();

    public Company(String companyName, ArrayList<Department> listOfdepartments) {
        this.companyName = companyName;
        this.listOfdepartments = listOfdepartments;

        ArrayList<Department> listOfdepartmentsCopy = new ArrayList<>(listOfdepartments);
        if ( listOfdepartments != null){

            for (Department DepartmentElements : listOfdepartments)
                listOfdepartmentsCopy.add(new Department(DepartmentElements));

        }
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Department> getListOfdepartments() {
        ArrayList<Department> listOfDepartments = new ArrayList<>();
        for (Department DepartmentElements : listOfdepartments)
            listOfDepartments.add(new Department(DepartmentElements));
        return listOfDepartments;
    }

    public void setDepartmentList(ArrayList<Department> listOfdepartments) {
        if(listOfdepartments != null){
            for (Department DepartmentElements : listOfdepartments)
                listOfdepartments.add( new Department(DepartmentElements));
        }
    }


    @Override
    public String toString() {
        String hour = "CompanyName:" + companyName + "\n" + listOfdepartments;

        return hour;
    }


    public void addDepartment(Department listOfdepartmentsCopy){
        listOfdepartments.add(new Department(listOfdepartmentsCopy));
    }

    public void addEmployeeToDepartment (int deptID, Employee empObject){


    }

    public void setDepartmentManager(int deptID, Manager manObject){


    }

}
        
        
        
        
  
    