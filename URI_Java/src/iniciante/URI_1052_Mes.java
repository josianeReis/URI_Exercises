package iniciante;

import java.util.Scanner;

public class URI_1052_Mes 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int N;

		N = sc.nextInt();

		if (N == 1)
			System.out.println("January");
		else if (N == 2)
			System.out.println("February");
		else if (N == 3)
			System.out.println("March");
		else if (N == 4)
			System.out.println("April");
		else if (N == 5)
			System.out.println("May");
		else if (N == 6)
			System.out.println("June");
		else if (N == 7)
			System.out.println("July");
		else if (N == 8)
			System.out.println("August");
		else if (N == 9)
			System.out.println("September");
		else if (N == 10)
			System.out.println("October");
		else if (N == 11)
			System.out.println("November");
		else if (N == 12)
			System.out.println("December");

		sc.close();
	}
}