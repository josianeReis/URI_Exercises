package iniciante;

import java.util.Scanner;

public class URI_1050_DDD 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int N;

		N = sc.nextInt();

		if (N == 61)
			System.out.println("Brasilia");
		else if (N == 71)
			System.out.println("Salvador");
		else if (N == 11)
			System.out.println("Sao Paulo");
		else if (N == 21)
			System.out.println("Rio de Janeiro");
		else if (N == 32)
			System.out.println("Juiz de Fora");
		else if (N == 19)
			System.out.println("Campinas");
		else if (N == 27)
			System.out.println("Vitoria");
		else if (N == 31)
			System.out.println("BeloHorizonte");
		else
			System.out.println("DDD nao cadastrado");

		sc.close();
	}
}
