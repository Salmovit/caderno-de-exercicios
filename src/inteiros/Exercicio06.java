package inteiros;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, nota, maiorNota, menorNota;
		
		System.out.print("N: ");
		n = input.nextInt();
		
		// Computa a primeira nota
		System.out.print("Nota do aluno 1 = ");
		nota = input.nextInt();
		
		// Assume a primeira nota como a maior e a menor da sequencia
		maiorNota = nota;
		menorNota = nota;
		
		for(int i = 1; i < n; i++) {
			System.out.print("Nota do aluno " + (i+1) + " = ");
			nota = input.nextInt();
			if(nota > maiorNota)
				maiorNota = nota;
			else if(nota < menorNota)
				menorNota = nota;
		}
		
		System.out.println("A menor nota obtida foi = " + menorNota +  System.lineSeparator() +
							"A maior nota obtida foi = " + maiorNota);
		
		input.close();
	}

}
