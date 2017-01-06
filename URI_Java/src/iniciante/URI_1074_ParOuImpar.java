package iniciante;

import java.util.Scanner;

public class URI_1074_ParOuImpar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int N, X;
		N = sc.nextInt();

		for (int i = 0; i < N; i++) 
		{
			X = sc.nextInt();

			if (X == 0)
				System.out.println("NULL");
			else if (X > 0 && X % 2 == 0)
				System.out.println("EVEN POSITIVE");
			else if (X < 0 && X % 2 == 0)
				System.out.println("EVEN NEGATIVE");
			else if (X % 2 != 0 && X > 0)
				System.out.println("ODD POSITIVE");
			else if (X % 2 != 0 && X < 0)
				System.out.println("ODD NEGATIVE");
		}
		sc.close();
	}
}