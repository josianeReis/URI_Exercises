package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1017_GastoDeCombustivel 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");

		int A = scan.nextInt();
		int B = scan.nextInt();

		System.out.println(df.format((A * B) / 12f));
		scan.close();
	}
}
