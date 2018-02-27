package Extra_Credit.Extra_Credit_One.PayrollSystem_Phase1;

import java.util.ArrayList;

/**
 * The Company class represents a company having multiple departments.
 * 
 * @author Mayelin
 */
public class Company
{
    // instance variables
    private String companyName;
    private ArrayList<Department> listOfDepartments = new ArrayList<>();
        
    
    /** 
     * This constructor sets the company's name and list of departments. 
     * @param name        Company's name.
     * @param departments List of departments in the company.
     */
    public Company(String name, ArrayList<Department> departments)
    {
        companyName = name;
        listOfDepartments = departments;
    }

    
    /**
     * The getCompanyName method returns the company's name.
     * @return The company's name.
     */
    public String getCompanyName()
    {
        return companyName;
    }
    

    /**
     * The getDepartmentList method returns the company's list of departments.
     * @return The company's list of departments as an ArrayList of Department elements.
     */
    public ArrayList<Department> getListOfDepartments()
    {
        return listOfDepartments;
    }

    
    /**
     * The setCompanyName method sets the name for this company.
     * @param name The value to store in the name field for this company.
     */
    public void setCompanyName(String name)
    {
        companyName = name;
    }

    
    /**
     * The setDepartmentList method sets the list of departments for this company.
     * @param departments The value, as an ArrayList of Department elements, to store 
     * in the list of departments field for this company.
     */
    public void setDepartmentList(ArrayList<Department> departments)
    {
        listOfDepartments = departments;
    }
    
    
    /** 
     * The toString method returns a string containing the company's data.
     * @return A String containing the Company's information: name and list of 
     * departments.
     */
    @Override
    public String toString()
    {
        String output = String.format("%-30s %s", "Company Name:", companyName );
        
        if( listOfDepartments == null || listOfDepartments.isEmpty() )
            output += "There are no departments in the company.";
        else
        {
            for( Department deptElement : listOfDepartments)
                output += "\n" + deptElement;
        }
        
        return output;
    }
}
