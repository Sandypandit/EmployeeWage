import java.util.Random;
import java.text.DecimalFormat;

public class EmpWageBuilder{
  public static void main(String[] arg){	
         //Complete conditions to get wage
	DecimalFormat df = new DecimalFormat("#,###");
    
	Random random = new Random();
	int workHoursComp = random.nextInt(98,101); //getting working HOURS
    int workDaysComp = random.nextInt(18,21); //getting working DAYS

	double dailyWage = 1000;
	int workDays = 20;
	int totalWorkHours = 100;
	double monthlyWage = dailyWage*workDays;
	if (workHoursComp ==100 && workDaysComp == 20){
	System.out.println("Good, you have completed montly working hours and days");
	System.out.println("Monthly wage of employee is Rs " + df.format(monthlyWage));
    }
	else{ System.out.println("You haven't completed working hours of 100 hours or working days of 20 days"); };
  }
}
