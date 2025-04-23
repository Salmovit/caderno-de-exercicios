package inteiros;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, n;
		double exp;
		
		System.out.print("x (base) = ");
		x = input.nextInt();
		
		System.out.print("n (expoente) = ");
		n = input.nextInt();
		
		if(n >= 0) {	// Se n nao for negativo faz a exponenciacao
			exp = 1;
			for(int i = 0; i < n; i++)
				exp *= x;
			
			System.out.println(x + "^" + n + " = " + exp);
		}
		else			// Caso contrario nao faz
			System.out.println("Expoente negativo.");
		input.close();
	}

}
