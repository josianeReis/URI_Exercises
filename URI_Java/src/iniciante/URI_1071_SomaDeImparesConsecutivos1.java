package iniciante;

import java.util.Scanner;

public class URI_1071_SomaDeImparesConsecutivos1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int X, Y, soma = 0;

		X = sc.nextInt();
		Y = sc.nextInt();

		if (X < Y) 
		{
			for (int i = X + 1; i <= Y; i++) 
			{
				if (i % 2 != 0)
					soma = soma + i;
			}
			System.out.println(soma);
		}

		if (Y < X) 
		{
			for (int i = Y + 1; i <= X; i++) 
			{
				if (i % 2 != 0)
					soma = soma + i;
			}
			System.out.println(soma);
		}
		sc.close();
	}
}