package Extra_Credit.Extra_Credit_One.PayrollSystem_Phase1;

import java.util.ArrayList;

/**
 * The Department class represents a department within a company. Departments have a 
 * list of employees and a manager.
 * 
 * @author Mayelin
 */
public class Department
{
    // instance variables
    private int departmentID;
    private String departmentName;
    private Manager departmentManager;
    private ArrayList<Employee> listOfEmployees = new ArrayList<>();
    
    
    /** 
     * This constructor sets the department's id and name, as well as the list of
     * employees and manager.   
     * @param id          Department's id.
     * @param name        Department's name.
     * @param manager     Department's manager.
     * @param employees   Department's list of employees.
     */
    public Department(int id, String name, Manager manager, ArrayList<Employee> employees)
    {
        departmentID = id;
        departmentName = name;
        departmentManager = new Manager(manager);
        listOfEmployees = employees;
    }
    
    
    /**
     * This is a copy constructor. It initializes the fields of the object being 
     * created to the same values as the fields in the object passed as an argument.
     * @param deptObj The object being copied.
     */
    public Department(Department deptObj)
    {   
        if( deptObj != null )
        {
            departmentID = deptObj.departmentID;
            departmentName = deptObj.departmentName;
            departmentManager = deptObj.departmentManager;
            listOfEmployees = deptObj.listOfEmployees;
        }
    }
    
    
    /**
     * The getDepartmentID method returns the department's id number.
     * @return The department's id.
     */
    public int getDepartmentID()
    {
        return departmentID;
    }
    
    
    /**
     * The getDepartmentName method returns the department's name.
     * @return The department's name.
     */
    public String getDepartmentName()
    {
        return departmentName;
    }
    
    
    /**
     * The getDepartmentManager method returns the department's manager.
     * @return The department's manager.
     */
    public Manager getDepartmentManager()
    {
        return new Manager(departmentManager);
    }
    
    
    /**
     * The getListOfEmployees method returns the department's list of employees.
     * @return The department's list of employees as an ArrayList of Employee elements.
     */
    public ArrayList<Employee> getListOfEmployees()
    {
        return listOfEmployees;
    }
    
    
    /**
     * The setDepartmentID method sets the id for this department.
     * @param id The value to store in the id field for this department.
     */
    public void setDepartmentID(int id)
    {
        departmentID = id;
    } 
    
    
    /**
     * The setDepartmentName method sets the name for this department.
     * @param name The value to store in the name field for this department.
     */
    public void setDepartmentName(String name)
    {
        departmentName = name;
    }
    
    
    /**
     * The setDepartmentManager method sets the manager for this department.
     * @param deptManager The value to store in the manager field for this department.
     */
    public void setDepartmentManager(Manager deptManager)
    {
        departmentManager = new Manager(deptManager);
    }
    
    
    /**
     * The setListOfEmployees method sets the list of employees for this department.
     * @param employees The value, as an ArrayList of Employee elements, to store 
     * in the list of employees field for this department.
     */
    public void setListOfEmployees(ArrayList<Employee> employees)
    {
        listOfEmployees = employees;
    }
    
    
    /** 
     * The toString method returns a string containing the department's data.
     * @return A String containing the Department's information: id, name, 
     * manager, and list of employees.
     */
    @Override
    public String toString()
    {
        String output = String.format(  "\n%-30s %s \n%-30s %s \n%-30s %s \n%-30s %s", 
                                        "Department ID:", departmentID,
                                        "Department Name:", departmentName,
                                        "Department Manager:", departmentManager,
                                        "List of Employees:", "");
        
        for( Employee emp : listOfEmployees )
            output += emp + "\n";
        
        output += "------------------------------------------------------------------\n";
        return output;
    }
    
}
