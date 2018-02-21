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
    }