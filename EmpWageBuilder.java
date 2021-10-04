public class EmpWageBuilder{

  public static void main(String[] arg){	
         //Adding Part Time Employee
	Random random = new Random();
    int empType = random.nextInt(2);
        
	int wagePerHour = 20; int workHours=0; String n = null;
		
         if(empType == 0){ workHours = 8; n = "Full"; //Full time
            System.out.println("Full time Empoyee"); }
			
         else if(empType == 1){ workHours = 4; n = "Part"; //Part time
            System.out.println("Part time Empoyee"); }

    int Wage = workHours*wagePerHour;
    System.out.printf("Daily wage of %s time employee is %dRs ", n, Wage);
    }
}