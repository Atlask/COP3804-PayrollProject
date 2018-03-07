package Extra_Credit.Extra_Credit_One.PayrollSystem_Phase1;

import java.util.ArrayList;

public class PayrollSystem_Phase2
{

    public static void main(String args[])
    {

        String paycheckData =   "01/22/2018:01/26/2018:2500.50:375.25:50#" +
                                "01/29/2018:02/02/2018:2430.50:370.75:25#" +
                                "02/05/2018:02/09/2018:2630.50:380.25:60";

        ArrayList<Paycheck> empPaychecks = parseEmployeePaychecks(1, paycheckData);

        for(Paycheck checkElement: empPaychecks)
        {
            System.out.println(checkElement.toString());
        }
    }
    public static ArrayList<Paycheck> parseEmployeePaychecks(int empID, String paycheckData) {
        ArrayList<Paycheck> paycheckElements = new ArrayList<Paycheck>();

        String paycheckInfo[] = paycheckData.split("#");
        for (String p : paycheckInfo) {
            String[] arr = p.split(":");
            double grossAmount = Double.parseDouble (arr[2]);
            double taxAmount = Double.parseDouble (arr[3]);
            double bonusAmount = Double.parseDouble (arr[4]);

            double netAmount = grossAmount - taxAmount;
            Paycheck pc = new Paycheck(empID, arr[0], arr[1], grossAmount, taxAmount, bonusAmount, netAmount);

            paycheckElements.add(pc);

        }
        return paycheckElements;
    }}



