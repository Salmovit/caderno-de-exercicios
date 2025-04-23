package inteiros;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, soma;
		
		System.out.print("N = ");
		n = input.nextInt();
		
		soma = 0;	// Soma dos divisores
		
		for(int i = 1; i < n; i++) {
			if(n % i == 0)	// se for divisor de n vai para a soma
				soma += i;
		}
		
		if(soma == n)
			System.out.println(n + " e perfeito.");
		else
			System.out.println(n + " nao e perfeito.");
		
		input.close();
	}

}
