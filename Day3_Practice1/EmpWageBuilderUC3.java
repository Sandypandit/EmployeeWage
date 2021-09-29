import java.util.Random;

class empWageBuilderUC3{
  public static void main(String[] args){
        
    Random random = new Random();
    int empType = random.nextInt(2);
        
	int wagePerHour = 20; int workHours=0; String n = null;
		
         if(empType == 0){ workHours = 8; n = "Full";
            System.out.println("Full time Empoyee"); }
			
         else if(empType == 1){ workHours = 4; n = "Part";
            System.out.println("Part time Empoyee"); }

    int Wage = workHours*wagePerHour;
    System.out.printf("Daily wage of %s time employee is %dRs ", n, Wage);
  }
}
