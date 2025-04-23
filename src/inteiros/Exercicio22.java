package inteiros;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, num, prev;
		int sequencia, maiorSequencia;
		
		System.out.print("N = ");
		n = input.nextInt();
		System.out.print("Num = ");
		prev = input.nextInt();
		
		sequencia = 1;
		maiorSequencia = 1;
		
		for(int i = 1; i < n; i++) {
			System.out.print("Num = ");
			num = input.nextInt();
			
			if(num > prev) {
				sequencia++;
			}
			else {
				if(sequencia > maiorSequencia)
					maiorSequencia = sequencia;
				sequencia = 1;
			}
			prev = num;
		}
		
		System.out.println("O comprimento do segmento crescente maximo e " + maiorSequencia);
		input.close();
	}

}
