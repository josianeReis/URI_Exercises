package iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1064_PositivosEMedia {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		double N[] = new double[6], media = 0;
		int cont = 0;

		for (int i = 0; i < 6; i++) 
		{
			N[i] = sc.nextDouble();
		}

		for (int i = 0; i < 6; i++) 
		{
			if (N[i] > 0) 
			{
				cont++;
				media = media + N[i];
			}
		}

		media = media / cont;

		System.out.println(cont + " valores positivos");
		DecimalFormat df = new DecimalFormat("#,##0.0");
		System.out.println(df.format(media));

		sc.close();
	}
}
