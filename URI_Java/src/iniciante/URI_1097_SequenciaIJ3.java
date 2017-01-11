package iniciante;

public class URI_1097_SequenciaIJ3 
{
	public static void main(String[] args) 
	{
		int I, J;

		for (I = 1, J = 7; I < 10; I = I + 2, J = J + 2) {
			System.out.println("I=" + I + " J=" + J);
			System.out.println("I=" + I + " J=" + (J - 1));
			System.out.println("I=" + I + " J=" + (J - 2));
		}
	}
}
