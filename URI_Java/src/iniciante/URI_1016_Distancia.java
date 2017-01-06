package iniciante;

import java.util.Scanner;

public class URI_1016_Distancia {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int A;
		A = scan.nextInt();

		System.out.println((60 * A) / 30 + " minutos");
		
		scan.close();
	}
}