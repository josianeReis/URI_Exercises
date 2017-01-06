package iniciante;

import java.util.Scanner;

public class URI_1060_NumerosPositivos {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double N[] = new double[6];
		int cont = 0;

		for (int i = 0; i < 6; i++) {
			N[i] = sc.nextDouble();
		}

		for (int i = 0; i < 6; i++) {
			if (N[i] > 0)
				cont++;
		}

		System.out.println(cont + " valores positivos");
		sc.close();
	}
}
