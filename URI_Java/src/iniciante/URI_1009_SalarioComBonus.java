package iniciante;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1009_SalarioComBonus {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        DecimalFormat df = new DecimalFormat("0.00");
	        double a, b;
	        String name;
	         
	        name = scan.next();
	        a = scan.nextDouble();
	        b = scan.nextDouble();
	         
	        a = ((b*15/100)+a);
	         
	        System.out.println("TOTAL = R$ "+df.format(a));
	        
	        scan.close();
	    }	 
	}

