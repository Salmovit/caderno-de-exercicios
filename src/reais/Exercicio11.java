package reais;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double soma1, soma2, soma3, soma4;
		double positivos, negativos, sinal;
		
		
		// Soma da direita para a esquerda
		soma1 = 0;
		sinal = -1;
		
		for(int i = 10000; i > 0; i--) {
			soma1 += (double)sinal/i;
			sinal = -sinal;
		}
		
		
		// Soma da esquerda para a direita
		soma2 = 0;
		sinal = 1;
		
		for(int i = 1; i <= 10000; i++) {
			soma2 += (double)sinal/i;
			sinal = -sinal;
		}
		
		// Soma separada dos termos positivos e negativos
		// da esquerda para a direita
		soma3 = 0;
		positivos = negativos = 0;
		
		for(int i = 1; i <= 10000; i++) {
			if(i % 2 != 0) {
				negativos += (double)1/i;
			}
			else {
				positivos += (double)-1/i;
			}
		}
		
		soma3 = positivos + negativos;
		
		// Soma separada dos termos positivos e negativos
		// da direita para a esquerda
		soma4 = 0;
		positivos = negativos = 0;
		
		for(int i = 10000; i > 0; i--) {
			if(i % 2 != 0) {
				negativos += (double)1/i;
			}
			else {
				positivos += (double)-1/i;
			}
		}
		
		soma4 = positivos + negativos;
		
		System.out.println("Soma 1 = " + soma1);
		System.out.println("Soma 2 = " + soma2);
		System.out.println("Soma 3 = " + soma3);
		System.out.println("Soma 4 = " + soma4);
		
		input.close();
		
	}

}
