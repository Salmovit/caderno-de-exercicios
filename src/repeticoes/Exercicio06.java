package repeticoes;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int div = 2;
		int mult = 0;
				
		System.out.print("N = ");
		n = input.nextInt();
		
		System.out.println("Decomposicao:");
		while(n > 1) {
			while(n % div == 0) {
				mult++;
				n = n / div;
			}
			if(mult > 0 ) {
				System.out.println(div + "^" + mult);
			} 
			div++;
			mult = 0;
		}
		
		input.close();
	}

}
