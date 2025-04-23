package reais;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double capital, juros, fator;
		
		
		System.out.print("capital = ");
		capital = input.nextDouble();
		
		System.out.print("juros (em %) = ");
		juros = input.nextDouble();
		
		fator = 1 + (juros/100);
		
		for(int i = 1; i <= 12; i++) {
			capital *= fator;
			System.out.println(i + "o mes = " + String.format("%.2f", capital));
		}
		
		input.close();
	}

}
