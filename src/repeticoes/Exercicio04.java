package repeticoes;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, num;
		int cont, soma;
		
		System.out.print("N = ");
		n = input.nextInt();
		
		cont = 0;
		soma = 0;
		for(int i = 0; i < n; i++) {
			System.out.print("num = ");
			num = input.nextInt();
			for(int j = 1; j <= num; j++)
				if(num % j  == 0)
					cont++;
			if(cont == 2)
				soma += num;
			cont = 0;
		}
		
		System.out.println("A soma dos numeros primos da sequencia e " + soma);
		input.close();
	}

}
