package iniciante;

import java.util.Scanner;

public class URI_1011_Esfera 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int raio = sc.nextInt();
		double vol = (4.0 / 3) * 3.14159 * Math.pow(raio, 3);
		System.out.printf("VOLUME = %.3f\n", vol);

		sc.close();
	}
}
