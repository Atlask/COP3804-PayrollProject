/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayrollSystemPhase1;

import java.util.ArrayList;


public class PayrollSystemPhase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // We cannot instantiate the Employee class since it is abstract
        
        System.out.println("/*********************************************************************/");
        System.out.println("/*               Testing the HourlyEmployee class                    */");
        System.out.println("/*********************************************************************/");
        
        // Creating an HourlyEmployee object using the first constructor
        HourlyEmployee employee_1 = new HourlyEmployee(1, "Janette", "Hernandez", null, 14.75, 30);
        
        // Creating an HourlyEmployee object using the copy constructor
        HourlyEmployee employee_2 = new HourlyEmployee(employee_1);
        
        
        // Calling some of the setter methods in the HourlyEmployee class.
        employee_2.setEmployeeID(2);
        employee_2.setFirstName("Marcela");
        employee_2.setLastName("Brown");
        employee_2.setHourlyRate(25);
        employee_2.setPeriodHours(40);
        
        System.out.println("\nCalling some of the getter methods in the HourlyEmployee class...");
        System.out.println( String.format("%-30s%s", "Employee ID:", employee_1.getEmployeeID()) );
        System.out.println( String.format("%-30s%s", "First Name:", employee_1.getFirstName()) );
        System.out.println( String.format("%-30s%s", "Last Name:", employee_1.getLastName()) );
        System.out.println( String.format("%-30s%s", "Hourly Rate:", employee_1.getHourlyRate()) );
        System.out.println( String.format("%-30s%s", "Period Hours:", employee_1.getPeriodHours()) );
        
        
        System.out.println("/*********************************************************************/");
        System.out.println("/*                   Testing the Paycheck class                      */");
        System.out.println("/*********************************************************************/");
        
        // create two Paycheck objects and add them to an ArrayList
        Paycheck janettesPaycheck_1 = new Paycheck(1, "01/01/2018", "01/07/2018", 442.50, 66.38, 0.0, 376.12);
        Paycheck janettesPaycheck_2 = new Paycheck(janettesPaycheck_1);
        janettesPaycheck_2.setPeriodBeginDate("01/08/2018");
        janettesPaycheck_2.setPeriodEndDate("01/14/2018");

        ArrayList<Paycheck> janettesPaychecks = new ArrayList<>();
        janettesPaychecks.add(janettesPaycheck_1);
        janettesPaychecks.add(janettesPaycheck_2);
        
        employee_1.setListOfPaychecks(janettesPaychecks);
        
        System.out.println("\nDisplaying the state of the first HourlyEmployee object (the values in its instance variables)...");
        System.out.println(employee_1.toString());
        
        System.out.println("\nDisplaying the state of the second HourlyEmployee object (the values in its instance variables)...");
        System.out.println(employee_2.toString()); // this calls the toString method implicitly
        
        
        System.out.println("\n*********************************************************************");
        System.out.println("*              Testing the SalariedEmployee class                   *");
        System.out.println("*********************************************************************");
        
        // create one Paycheck object and add it to an ArrayList
        Paycheck stevensPaycheck = new Paycheck(3, "01/01/2018", "01/07/2018", 865.38, 173.00, 0.0, 692.38);
        ArrayList<Paycheck> stevensPaychecks = new ArrayList<>();
        stevensPaychecks.add(stevensPaycheck);
        
        // Creating a SalariedEmployee object
        SalariedEmployee employee_3 = new SalariedEmployee(3, "Steven", "Estevez", stevensPaychecks, 0.0);
        
        // Calling some of the set methods in the SalariedEmployee class.
        employee_3.setAnnualSalary(45000.0);
        
        // Displaying the state of this object
        System.out.println(employee_3);
        
        
        // Creating another SalariedEmployee object using the copy constructor
        SalariedEmployee employee_4 = new SalariedEmployee(employee_3);
        employee_4.setEmployeeID(4);
        employee_4.setFirstName("Beatrice");
        employee_4.setAnnualSalary(48000.0);
        
        Paycheck beatricesPaycheck = new Paycheck(4, "01/08/2018", "01/14/2018", 923.08, 184.70, 0.0, 738.38);
        ArrayList<Paycheck> beatricesPaychecks = new ArrayList<>();
        beatricesPaychecks.add(beatricesPaycheck);
        
        employee_4.setListOfPaychecks(beatricesPaychecks);
        
        // Displaying the state of this object
        System.out.println(employee_4.toString());
        
        
        System.out.println("\n*********************************************************************");
        System.out.println("*                   Testing the Manager class                       *");
        System.out.println("*********************************************************************");
        
        // create one Paycheck object and add it to an ArrayList
        Paycheck michaelsPaycheck = new Paycheck(5, "01/15/2018", "01/21/2018", 1288.45, 257.70, 80.0, 1110.75);
        ArrayList<Paycheck> michaelsPaychecks = new ArrayList<>();
        michaelsPaychecks.add(michaelsPaycheck);
        
        // Creating a Manager object using the first constructor.
        Manager manager_1 = new Manager(5, "Michael", "Colt", michaelsPaychecks, 67000, 50);
        
        // Calling some of the set methods in the Manager class.
        manager_1.setLastName("Colton");
        manager_1.setBonus(100.0);
        
        // Displaying the state of this object (the values in its instance variables.
        System.out.println(manager_1.toString());
        
        
        // create one Paycheck object and add it to an ArrayList
        Paycheck luisasPaycheck = new Paycheck(6, "01/15/2018", "01/21/2018", 1250.0, 250.0, 72.0, 1072.0);
        ArrayList<Paycheck> luisasPaychecks = new ArrayList<>();
        luisasPaychecks.add(luisasPaycheck);
        
        // Creating another Manager object using the copy constructor
        Manager manager_2 = new Manager(manager_1);
        
        // Calling some of the set methods in the Manager class.
        manager_2.setEmployeeID(6);
        manager_2.setFirstName("Luisa");
        manager_2.setLastName("Lopez");
        manager_2.setAnnualSalary(65000.0);
        manager_2.setBonus(90.0);
        manager_2.setListOfPaychecks(luisasPaychecks);
        
        // Displaying the state of this object (the values in its instance variables.
        System.out.println(manager_2.toString());
        
        
        System.out.println("\n*********************************************************************");
        System.out.println("*                 Testing the Department class                      *");
        System.out.println("*********************************************************************");
        
        // create an ArrayList of Employees
        ArrayList<Employee> dept1Employees = new ArrayList<>();
        dept1Employees.add(employee_1);
        dept1Employees.add(employee_3);
        
        // Creating a Department object using the first constructor.
        Department dept_1 = new Department(1, "Human Resources", manager_1, dept1Employees);
        
        // Displaying the state of the first department object.
        System.out.println(dept_1.toString());
        
        System.out.println("------------------------------------------------------------------");
        // create another ArrayList of Employees
        ArrayList<Employee> dept2Employees = new ArrayList<>();
        dept2Employees.add(employee_2);
        dept2Employees.add(employee_4);
        
        // Creating a Department object using the copy constructor.
        Department dept_2 = new Department(dept_1);
        
        // Calling some of the setter methods in the Department class.
        dept_2.setDepartmentID(2);
        dept_2.setDepartmentName("Information Technology");
        dept_2.setDepartmentManager(manager_2);
        dept_2.setListOfEmployees(dept2Employees);
        
        // Displaying the state of the second department object (the values in its instance variables.
        System.out.println(dept_2.toString());
        System.out.println("------------------------------------------------------------------");
        
        System.out.println("\n*********************************************************************");
        System.out.println("*                   Testing the Company class                       *");
        System.out.println("*********************************************************************");
        
        // Creating a Company object.
        Company company = new Company("", null);
        
        // create an ArrayList of Departments
        ArrayList<Department> departments = new ArrayList<>();
        departments.add(dept_1);
        departments.add(dept_2);
        
        // Calling some of the set methods in the Company class.
        company.setCompanyName("Our Company");
        company.setDepartmentList(departments);
        
        // Displaying the state of the company object.
        System.out.println(company.toString());
         
    }
    
}

        
        
        