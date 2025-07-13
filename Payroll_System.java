package JavaFundamentals;

import java.util.*;

public class Payroll_System {

	public static void main(String[] args) {
//NOTE:THIS PROGRAM CREATED BY REYBEEN ROMERO  "1yr-BS Computer Science"
		//NOTE:THIS PROGRAM CREATED BY REYBEEN ROMERO  "1yr-BS Computer Science"		
		Scanner E = new Scanner(System.in);
		
		System.out.println("------PAYROLL_SYSTEM_CREATED_BY_REYBEEN_ROMERO------");
		System.out.println();
		System.out.println();
		
		String Employee_Name;
		String Gender;
		String Address;
		
		int RatePerHour;
		int HourPerDay;
		int Number_Days_Work;
		
		double  Tax_Monthly =  0.10;
		int Philhealth = 500;
		int PagIbig = 300;
		int SSS = 700;
		
		System.out.println("------EMPLOYEE INFORMATION------");
		
		System.out.print("Enter Name: ");
		Employee_Name = E.nextLine();
		
		System.out.print("Enter Gender: ");
		Gender = E.nextLine();
		
		System.out.print("Enter Address: ");
		Address = E.nextLine();
		
		System.out.print("Rate Per Hour: ");
		RatePerHour = E.nextInt();		
		
		System.out.print("Hour Per Day: ");
		HourPerDay = E.nextInt();
		
		System.out.print("Number Days Of Work: ");
		Number_Days_Work = E.nextInt();
		
		E.close();
		
		
		
		System.out.println();
		System.out.println("------EMPLOYEE_RECIEPT------");
		
		
		System.out.println("Enter Name: " + Employee_Name);
		System.out.println("Enter Gender: " + Gender);
		System.out.println("Enter Address: " + Address);
		System.out.println("Rate Per Hour: " + RatePerHour);
		System.out.println("Hour Per Day: " + HourPerDay);
		System.out.println("Number Days Of Work: " + Number_Days_Work);
		
		int Total_Gross_Salary = RatePerHour * HourPerDay * Number_Days_Work;
		System.out.println("Total_Gross_Salary: " + Total_Gross_Salary );	
		
		double Tax_Gross =  (Tax_Monthly * Total_Gross_Salary);
		int Deduction = Philhealth + PagIbig + SSS;
		
		
		System.out.println();
		System.out.println("------DEDUCTION_RECIEPT------");
		
	
		System.out.println("TAX_MONTHLY: " + Tax_Gross);
		System.out.println("PHILHEALTH: " + Philhealth);
		System.out.println("PAGIBIG	: " + PagIbig);
		System.out.println("SSS: " + SSS);
		System.out.println("TOTAL_DEDUCTION: " + (Tax_Gross + Deduction));
		
		
		double Net_Salary = Total_Gross_Salary - (Deduction + Tax_Gross);
		System.out.println();
		System.out.println("------NET_SALARY------");
		System.out.println("NET: " + Net_Salary);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
