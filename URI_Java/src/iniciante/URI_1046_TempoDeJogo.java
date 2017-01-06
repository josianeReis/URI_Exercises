package iniciante;

import java.util.Scanner;

public class URI_1046_TempoDeJogo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int Start, End;

		Start = sc.nextInt();
		End = sc.nextInt();

		if (Start == End) 
		{
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else if (Start < End) 
		{
			System.out.println("O JOGO DUROU " + (End - Start) + " HORA(S)");
		} else 
		{
			System.out.println("O JOGO DUROU " + ((24 - Start) + End) + " HORA(S)");
		}
		sc.close();
	}
}
