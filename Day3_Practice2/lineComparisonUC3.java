import java.util.Random;
import java.text.DecimalFormat;
//import java.lang.*;
import java.lang.Math;

public class lineComparisonUC3{
  public static void main(String[] args){
	Random rd = new Random();
	int x1=3; int x2=8;  //Line 1
	int y1=1; int y2=2;

	int a1=1; int a2=6;  //Line 2
	int b1=4; int b2=9;	  
	  
	System.out.printf("\nLine 1\n(x1=%d, y1=%d)\n(x2=%d, y2=%d)\n______",x1,y1,x2,y2);
	System.out.printf("___\n\nLine 2\n(x1=%d, y1=%d)\n(x2=%d, y2=%d)\n",a1,b1,a2,b2);
	  
	DecimalFormat df = new DecimalFormat("#.00");	  
	  double length1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	  double length2 = Math.sqrt(Math.pow((a2-a1),2)+Math.pow((b2-b1),2));

		Double L1 = Double.valueOf(df.format(length1));
		Double L2 = Double.valueOf(df.format(length2));
		
	System.out.println("\nLength of the Line 1 is "+df.format(length1));
	System.out.println("Length of the Line 2 is "+df.format(length2));
	  
	if(L1.compareTo(L2) == 0){ System.out.println("given two lines are equal");}
	else if(L1.compareTo(L2) > 0){ System.out.println("line 1 greater than line 2"); }
	else if(L1.compareTo(L2) < 0){ System.out.println("line 1 lesser than line 2"); }
    }
}