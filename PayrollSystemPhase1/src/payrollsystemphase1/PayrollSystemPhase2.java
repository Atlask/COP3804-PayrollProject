package payrollsystemphase1;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henry
 */
public class PayrollSystemPhase2 
{
    public static void main(String args[])
    {

    System.out.println("/*******************************************************************************/");
        System.out.println("/* Testing aggregation in the Employee class: making copies of listOfPaychecks */");
        System.out.println("/*******************************************************************************/");
        
        Paycheck paycheck_1 = new Paycheck(1, "01/01/2018", "01/07/2018", 442.50, 66.38, 0.0, 376.12);
        Paycheck paycheck_2 = new Paycheck(1, "01/08/2018", "01/14/2018", 442.50, 66.38, 50.0, 426.12);

        ArrayList<Paycheck> employee1Paychecks = new ArrayList<>();
        employee1Paychecks.add(paycheck_1);
        employee1Paychecks.add(paycheck_2);
        
        // Creating an HourlyEmployee object
        HourlyEmployee employee_1 = new HourlyEmployee(1, "Albert", "Hernandez", employee1Paychecks, 14.75, 30);
        
        // Creating another HourlyEmployee object using the copy constructor
        HourlyEmployee employee_2 = new HourlyEmployee(employee_1);
        employee_2.setEmployeeID(2);
        employee_2.setFirstName("Nancy");
        
        // Creating a third HourlyEmployee object
        HourlyEmployee employee_3 = new HourlyEmployee(3, "John", "Smith", null, 20, 35);
        ArrayList<Paycheck> checks = employee_1.getListOfPaychecks();
        for(Paycheck pay : checks)
                pay.setEmployeeID(3);
        employee_3.setListOfPaychecks(checks);
        
        
        // Changing employee1Paychecks should not affect the listOfPaychecks field inside any of the employee objects
        employee1Paychecks.get(0).setPeriodBeginDate("11/11/1111");
        employee1Paychecks.remove(1);
        
        // Changing the listOfPaychecks field inside employee_1 should not affect the other employees
        Paycheck paycheck_3 = new Paycheck(1, "01/15/2018", "01/22/2018", 662.50, 78.38, 0.0, 584.12);
        employee_1.addPaycheck(paycheck_3);
   
        // display the employees information
        System.out.println(employee_1);
        System.out.println(employee_2);
        System.out.println(employee_3);
        
        
        System.out.println("\n");
        System.out.println("/*******************************************************************************/");
        System.out.println("/*     Testing the equals and compareTo methods in the Employee class          */");
        System.out.println("/*******************************************************************************/");
        
        System.out.println("This should return false: " + employee_1.equals(employee_2));
        System.out.println("This should return any negative number: " + employee_1.compareTo(employee_2));
        
        // change employee_1 first name to Nancy, now they have the same first and last name
        employee_1.setFirstName("Nancy");
        
        System.out.println("This should return true: " + employee_1.equals(employee_2));
        System.out.println("This should return 0: " + employee_1.compareTo(employee_2));
        
        // change employee_1 first name back to Albert
        employee_1.setFirstName("Albert");
        
        System.out.println("This should return any positive number: " + employee_3.compareTo(employee_2));
        
        
        
        System.out.println("\n");
        System.out.println("/*******************************************************************************/");
        System.out.println("/*     Testing the equals and compareTo methods in the Paycheck class          */");
        System.out.println("/*******************************************************************************/");
        
        Paycheck paycheck_4 = new Paycheck(paycheck_2);
        System.out.println("This should return true: " + paycheck_2.equals(paycheck_4));
        System.out.println("This should return 0: " + paycheck_2.compareTo(paycheck_4));
        
        paycheck_4.setPeriodBeginDate("01/22/2018");
        System.out.println("This should return false: " + paycheck_2.equals(paycheck_4));
        System.out.println("This should return any negative number: " + paycheck_2.compareTo(paycheck_4));
        System.out.println("This should return any positive number: " + paycheck_4.compareTo(paycheck_2));
        
        
        
        System.out.println("\n");
        System.out.println("/*******************************************************************************/");
        System.out.println("/* Testing aggregation in the Department class: making copies of               */");
        System.out.println("/* departmentManager and listOfEmployees                                       */");
        System.out.println("/*******************************************************************************/");

        Paycheck paycheck_5 = new Paycheck(4, "01/15/2018", "01/21/2018", 1288.45, 257.70, 80.0, 1110.75);
        
        ArrayList<Paycheck> michaelsPaychecks = new ArrayList<>();
        michaelsPaychecks.add(paycheck_5);
        Manager manager_1 = new Manager(4, "Michael", "Colt", michaelsPaychecks, 67000, 50);

        ArrayList<Employee> dept1Employees = new ArrayList<>();
        dept1Employees.add(employee_1);
        dept1Employees.add(employee_2);
        
        // Create a Department object
        Department dept_1 = new Department(1, "Human Resources", manager_1, dept1Employees);
        
        // Create another Department object
        Department dept_2 = new Department(dept_1);
        dept_2.setDepartmentID(2);
        dept_2.setDepartmentName("Information Technology");
        
        Paycheck paycheck_6 = new Paycheck(5, "01/15/2018", "01/21/2018", 1250.0, 250.0, 72.0, 1072.0);
        ArrayList<Paycheck> luisasPaychecks = new ArrayList<>();
        luisasPaychecks.add(paycheck_6);

        Manager manager_2 = new Manager(5, "Luisa", "Lopez", luisasPaychecks, 65000, 90);
        dept_2.setDepartmentManager(manager_2);
        
        ArrayList<Employee> dept2Employees = new ArrayList<>();
        dept2Employees.add(employee_3);

        dept_2.setListOfEmployees(dept2Employees);
        dept_2.addEmployee(new SalariedEmployee(6, "Joe", "Brown", null, 45400));
        
        // Changing manager_1, employee_3, dept1Employees, and dept2Employees should not affect the data inside the departments
        manager_1.setFirstName("Blah");
        manager_1.setLastName("Blah");
        employee_3.setPeriodHours(11);
        
        dept1Employees.clear();
        dept2Employees.add(employee_2);
        
        // display the departments information
        System.out.println(dept_1);
        System.out.println("\n");
        System.out.println(dept_2);
        
        
        System.out.println("\n");
        System.out.println("/*******************************************************************************/");
        System.out.println("/*     Testing the equals and compareTo methods in the Department class        */");
        System.out.println("/*******************************************************************************/");
        
        System.out.println("This should return false: " + dept_1.equals(dept_2));
        System.out.println("This should return a negative number: " + dept_1.compareTo(dept_2));
        System.out.println("This should return a positive number: " + dept_2.compareTo(dept_1));
        
        dept_1.setDepartmentName("Information Technology");
        
        System.out.println("This should return true: " + dept_1.equals(dept_2));
        System.out.println("This should return 0: " + dept_2.compareTo(dept_1));
        
        dept_1.setDepartmentName("Human Resources");
        

        
        System.out.println("\n");
        System.out.println("/********************************************************************************/");
        System.out.println("/* Testing Aggregation in the Company class: making copies of listOfDepartments */");
        System.out.println("/********************************************************************************/");

        // create an ArrayList of Departments
        ArrayList<Department> departments = new ArrayList<>();
        departments.add(dept_1);
        
        // Creating a Company object.
        Company company = new Company("Our Company", departments);
        company.addDepartment(dept_2);
        
        SalariedEmployee employee_7 = new SalariedEmployee(7, "Daniel", "Davis", null, 49400);
        
        company.addEmployeeToDepartment(2, employee_7);
        
        Manager manager_3 = new Manager(8, "Robert", "Porter", null, 65000, 100);
        
        company.setDepartmentManager(2, manager_3);
        
        // Display the company information
        System.out.println(company.toString());
         
    }
    
}
    
