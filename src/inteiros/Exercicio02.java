package inteiros;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, soma;
		
		System.out.print("N: ");
		n = input.nextInt();
		
		soma = 0;
		
		for(int i = 1; i <= n; i++) {
			soma += i;
		}
		System.out.println("Soma dos " + n + " primeiros numeros inteiros = " + soma);
		input.close();
	}

}
