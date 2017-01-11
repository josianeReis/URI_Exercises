package iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1079_MediasPonderadas 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int N;
		double val1, val2, val3, media;

		N = sc.nextInt();

		for (int i = 0; i < N; i++) 
		{
			val1 = sc.nextDouble();
			val2 = sc.nextDouble();
			val3 = sc.nextDouble();

			media = ((val1 * 2) + (val2 * 3) + (val3 * 5)) / (2 + 3 + 5);

			DecimalFormat df = new DecimalFormat("#,##0.0");
			System.out.println(df.format(media));
		}
		sc.close();
	}
}