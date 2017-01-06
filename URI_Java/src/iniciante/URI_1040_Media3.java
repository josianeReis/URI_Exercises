package iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1040_Media3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		double N1, N2, N3, N4, media, exame;

		N1 = sc.nextDouble();
		N2 = sc.nextDouble();
		N3 = sc.nextDouble();
		N4 = sc.nextDouble();

		media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / (2 + 3 + 4 + 1);

		DecimalFormat df = new DecimalFormat("#,##0.0");
		System.out.println("Media: " + df.format(media));

		if (media < 5) 
		{
			System.out.println("Aluno reprovado.");
		} else if (media >= 5 && media <= 6.9) 
		  {
			System.out.println("Aluno em exame.");
			exame = sc.nextDouble();
			System.out.println("Nota do exame: " + df.format(exame));

			if (((media + exame) / 2) >= 5) 
			{
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: " + (media + exame) / 2.0);
			} else 
			  {
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: " + df.format((media + exame) / 2.0));
			  }
		  } else
			System.out.println("Aluno aprovado.");
		sc.close();
	}
}
