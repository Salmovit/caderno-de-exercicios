package inteiros;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int p, divs;
		
		System.out.print("P = ");
		p = input.nextInt();
		
		divs = 0;
		for(int i = 1; i <= p; i++) {
			if(p % i == 0) {
				divs++;
			}
		}
		
		if(divs == 2) {
			System.out.println(p + " e primo.");
		} else {
			System.out.println(p + " nao e primo.");
		}
		
		input.close();
	}

}
