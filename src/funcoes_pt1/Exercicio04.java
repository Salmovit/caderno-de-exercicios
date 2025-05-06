package funcoes_pt1;

import java.util.Scanner;

public class Exercicio04 {
	
	public static int ehPrimo(int m) {
		int divisores = 0;
		
		for(int i = 1; i <= m; i++) {
			if(m % i  == 0) 
				divisores++;				
		}
		
		if(divisores == 2) 
			return 1;
		else 
			return 0;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, soma, i, count;
		
		System.out.print("N = ");
		n = input.nextInt();
		
		soma = 0;
		i = 1;
		count = 0;
		while(count < n) {
			if(ehPrimo(i) == 1) {
				soma += i;
				count++;
			}
			i++;
		}
		
		System.out.println("Soma dos %d primeiros numeros primos = %d" .formatted(n, soma));
		
		input.close();
		
	}

}
