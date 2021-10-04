import java.util.Random;

public class EmpWageBuilder{

  public static void main(String[] arg){	
         //Using Switch Case
    Random random = new Random();
	int empType = random.nextInt(3);
	
	int workHour = 8;
	int wagePerHour = 20;
	int partTimeWage = 10;
	
	switch (empType) 
      {
          //comparing value of variable against each case
        case 0:
          System.out.println("Fulltime Employee");
		  int dailyWage1 = workHour*wagePerHour;
		  System.out.println("Daily wage of Fulltime employee is " + dailyWage1 +"Rs");
          break;
        case 1:
          System.out.println("Part time Employee");
		  int dailyWage = workHour*partTimeWage;
		  System.out.println("Daily wage of Fulltime employee is " + dailyWage +"Rs");
          break;
        case 2:
          System.out.println("Employee is absent");
          break;

    }
  }
}