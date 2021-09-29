import java.text.DecimalFormat;

public class EmpWageBuilderUC5{

  public static void main(String[] args){

     DecimalFormat df = new DecimalFormat("#,###");
	double dailyWage = 1000;
	int workDays = 20;

	double monthlyWage = dailyWage*workDays;

	System.out.println("Daily wage of Employee is Rs 1000");
	System.out.println("Monthly wage of employee is Rs " + df.format(monthlyWage));
   }
}
