public class EmpWageBuilder{
  public static void main(String[] arg){
	
    final int EMP_CHECK = 1; //Declaring constant
	double empCheck = Math.floor(Math.random() * 10) % 2;
    System.out.println("the value " + empCheck);
	//checking attendance using if condition below
     if(EMP_CHECK == empCheck){ System.out.println("Employee is present"); }
     else{ System.out.println("Employee is absent"); }
    }
}
