package iniciante;

import java.util.Scanner;

public class URI_1065_ParesEntreCincoNumeros 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int N[] = new int[5];
		int cont = 0;

		for (int i = 0; i < 5; i++) {
			N[i] = sc.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			if (N[i] % 2 == 0)
				cont++;
		}

		System.out.println(cont + " valores pares");

		sc.close();
	}
}
