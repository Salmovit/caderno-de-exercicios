package repeticoes;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, num;
		int soma;
		
		System.out.print("Quantidade de sequencias = ");
		n = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			soma = 0;
			System.out.print("N = ");
			num = input.nextInt();
			while(num != 0) {
				if(num % 2 == 0)
					soma += num;
				System.out.print("N = ");
				num = input.nextInt();
			}
			System.out.println("A soma dos numeros pares da " + (i+1) + " sequencia = " + soma);
		}
		
		input.close();
	}

}
