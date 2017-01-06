package iniciante;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1002_AreaDoCirculo 
{ 
	    static double A = 3.14159;
	    public static void main(String[] args) 
	    {
	    	double R;
	        Scanner scan = new Scanner(System.in);
	        R = scan.nextDouble();
	        DecimalFormat df = new DecimalFormat("0.0000");  
	        System.out.println("A="+df.format((R*R)*A));
	        
	        scan.close();
	    }
}
