/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystemphase1;

import java.util.ArrayList;

/**
 *
 * @author Henryb8780
 */
public class PayrollSystemPhase1 {

    /**
     * @param args the command line arguments
     */
    public abstract class Employee{
        private int employeeID;
        private String firstName;
        private String lastName;
        private ArrayList listOfPaychecks;
        //List<String> strList = new ArrayList<String>();
        ArrayList Paycheck = new ArrayList();
        //ArrayList<Paycheck> listOfPaychecks = new ArrayList<>();

        public Employee(int employeeID, String firstName, String lastName) {
            this.employeeID = employeeID;
            this.firstName = firstName;
            this.lastName = lastName;
        }
        
        public Employee(Employee employee){
            this.Paycheck = employee.Paycheck;
            this.employeeID = employee.employeeID;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
        }

        @Override
        public String toString() {
            return "Employee{" + "employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", listOfPaychecks=" + listOfPaychecks + ", Paycheck=" + Paycheck + '}';
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

        public ArrayList getPaycheck() {
            return Paycheck;
        }

        public void setPaycheck(ArrayList Paycheck) {
            this.Paycheck = Paycheck;
        }
        
    }

    public class HourlyEmployee extends Employee{
        
       private double hourlyRate;
       private double periodHours;
        

        public HourlyEmployee(double hourlyRate, double periodHours, int employeeID, String firstName, String lastName) {
            super(employeeID, firstName, lastName);
            this.hourlyRate = hourlyRate;
            this.periodHours = periodHours;
        }

        public HourlyEmployee(double hourlyRate, double periodHours, Employee employee) {
            super(employee);
            this.hourlyRate = hourlyRate;
            this.periodHours = periodHours;
        }
        //copy constructor

        public double getHourlyRate() {
            return hourlyRate;
        }

        public void setHourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
        }

        public double getPeriodHours() {
            return periodHours;
        }

        public void setPeriodHours(double periodHours) {
            this.periodHours = periodHours;
        }

        public ArrayList getPaycheck() {
            return Paycheck;
        }

        public void setPaycheck(ArrayList Paycheck) {
            this.Paycheck = Paycheck;
        }

        @Override
        public String toString() {
            return "HourlyEmployee{" + "hourlyRate=" + hourlyRate + ", periodHours=" + periodHours + '}';
        }
        
        
        
        
   
        
    }
    
    public class SalariedEmployee extends Employee{
        
        private double annualSalary;

        public SalariedEmployee(double annualSalary, int employeeID, String firstName, String lastName) {
            super(employeeID, firstName, lastName);
            this.annualSalary = annualSalary;
        }

        public SalariedEmployee(double annualSalary, Employee employee) {
            super(employee);
            this.annualSalary = annualSalary;
        }

        public double getAnnualSalary() {
            return annualSalary;
        }

        public void setAnnualSalary(double annualSalary) {
            this.annualSalary = annualSalary;
        }

        public ArrayList getPaycheck() {
            return Paycheck;
        }

        public void setPaycheck(ArrayList Paycheck) {
            this.Paycheck = Paycheck;
        }

        @Override
        public String toString() {
            return "SalariedEmployee{" + "annualSalary=" + annualSalary + '}';
        }
        
        
        
        
        
    }
    
    public class Manager extends SalariedEmployee{
        
        private double bonus;

        public Manager(double bonus, double annualSalary, int employeeID, String firstName, String lastName) {
            super(annualSalary, employeeID, firstName, lastName);
            this.bonus = bonus;
        }

        public Manager(double bonus, double annualSalary, Employee employee) {
            super(annualSalary, employee);
            this.bonus = bonus;
        }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        public ArrayList getPaycheck() {
            return Paycheck;
        }

        public void setPaycheck(ArrayList Paycheck) {
            this.Paycheck = Paycheck;
        }

        @Override
        public String toString() {
            return "Manager{" + "bonus=" + bonus + '}';
        }
        
        

        
        
    }
    
    public static class Paycheck{
    
        private int employeeID;
        private String periodBeginDate;
        private String periodEndDate;
        private double grossAmount;
        private double taxAmount;
        private double bonusAmount;
        private double netAmount;

        public Paycheck(int employeeID, String periodBeginDate, String periodEndDate, double grossAmount, double taxAmount, double bonusAmount, double netAmount) {
            this.employeeID = employeeID;
            this.periodBeginDate = periodBeginDate;
            this.periodEndDate = periodEndDate;
            this.grossAmount = grossAmount;
            this.taxAmount = taxAmount;
            this.bonusAmount = bonusAmount;
            this.netAmount = netAmount;
        }

        public int getEmployeeID() {
            return employeeID;
        }

        public void setEmployeeID(int employeeID) {
            this.employeeID = employeeID;
        }

        public String getPeriodBeginDate() {
            return periodBeginDate;
        }

        public void setPeriodBeginDate(String periodBeginDate) {
            this.periodBeginDate = periodBeginDate;
        }

        public String getPeriodEndDate() {
            return periodEndDate;
        }

        public void setPeriodEndDate(String periodEndDate) {
            this.periodEndDate = periodEndDate;
        }

        public double getGrossAmount() {
            return grossAmount;
        }

        public void setGrossAmount(double grossAmount) {
            this.grossAmount = grossAmount;
        }

        public double getTaxAmount() {
            return taxAmount;
        }

        public void setTaxAmount(double taxAmount) {
            this.taxAmount = taxAmount;
        }

        public double getBonusAmount() {
            return bonusAmount;
        }

        public void setBonusAmount(double bonusAmount) {
            this.bonusAmount = bonusAmount;
        }

        public double getNetAmount() {
            return netAmount;
        }

        public void setNetAmount(double netAmount) {
            this.netAmount = netAmount;
        }

        @Override
        public String toString() {
            return "Paycheck{" + "employeeID=" + employeeID + ", periodBeginDate=" + periodBeginDate + ", periodEndDate=" + periodEndDate + ", grossAmount=" + grossAmount + ", taxAmount=" + taxAmount + ", bonusAmount=" + bonusAmount + ", netAmount=" + netAmount + '}';
        }
        
        

        
}
    public class Department{
        
        private int departmentID;
        private String departmentName;
        ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
        Manager departmentManager = new Manager();
        
        //departmentManager Manager = new departmentManager();
        //List<String> strList = new ArrayList<String>();
        //ArrayList Paycheck = new ArrayList();

        public Department(int departmentID, String departmentName) {
            this.departmentID = departmentID;
            this.departmentName = departmentName;
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
            return "Department{" + "departmentID=" + departmentID + ", departmentName=" + departmentName + ", listOfEmployees=" + listOfEmployees + ", departmentManager=" + departmentManager + '}';
        }
        
    public class Company {
        private String companyName;
        ArrayList<Department> listOfdepartments = new ArrayList<Department>();

            public Company(String companyName) {
                this.companyName = companyName;
            }
            //copy constructor

            public String getCompanyName() {
                return companyName;
            }

            public void setCompanyName(String companyName) {
                this.companyName = companyName;
            }

            public ArrayList<Department> getListOfdepartments() {
                return listOfdepartments;
            }

            public void setListOfdepartments(ArrayList<Department> listOfdepartments) {
                this.listOfdepartments = listOfdepartments;
            }
            

            @Override
            public String toString() {
                return "Company{" + "companyName=" + companyName + ", listOfdepartments=" + listOfdepartments + '}';
            }
            
        
    }
        
        
        
        
    }
    
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
        System.out.println(employee_2); // this calls the toString method implicitly
        
        
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

        
        
        
    
    

