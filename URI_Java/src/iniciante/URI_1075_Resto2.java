package iniciante;

import java.util.Scanner;

public class URI_1075_Resto2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int N;

		N = sc.nextInt();

		for (int i = 1; i <= 10000; i++) 
		{
			if (i % N == 2) 
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
}
