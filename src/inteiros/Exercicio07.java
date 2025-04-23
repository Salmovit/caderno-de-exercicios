package inteiros;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, num, soma;
		
		System.out.print("N: ");
		n = input.nextInt();
		
		soma = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("num = ");
			num = input.nextInt();
			if(num % 2 == 0) 
				soma += num;
		}
		
		System.out.println("A soma dos numeros pares da sequencia = " + soma);
		input.close();
	}

}
