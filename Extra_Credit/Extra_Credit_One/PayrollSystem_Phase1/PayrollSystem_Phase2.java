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
    public static ArrayList<Paycheck> parseEmployeePaychecks(int empID, String paycheckData)
    {
        ArrayList<Paycheck> paycheckElements = new ArrayList<Paycheck>();

        String paycheckInfo[]= paycheckData.split("#");
        double netAmmount;
        double grossAmount;
        double taxAmount;
        double bonusAmount;




        netAmmount = grossAmount – taxAmount + bonusAmount
    }

}

/*

1-	Declare an ArrayList of Paycheck elements and initialize to an empty list.
2-	Split the paycheckData parameter on the # to get each paycheck information.
3-	Write a For loop to iterate through the list of paycheck strings, which should have the following format: periodBeginDate:periodEndDate:grossAmount:taxAmount:bonusAmount
4-	Calculate the netAmount to be: grossAmount – taxAmount + bonusAmount

5-	Create a Paycheck object using the employee id passed in the first parameter and the data parsed from the second parameter.
use the constructor from the paycheck class
6-	Add the Paycheck object to the ArrayList that this method returns.
7-	After the loop, return the ArrayList of Paycheck objects.
* Write variables in method contained.
* * Double.parseDouble("5.7)
* when you read it, it'll be a string
*/