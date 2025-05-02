package funcoes_pt1;

import java.util.Scanner;

public class Exercicio02 {
	
	public static boolean encaixa(int a, int b) {
		boolean igual = true;;
				
		while(b > 0) {
			if(b%10 != a%10) {
				igual = false;
			}
			b = b/10;
			a = a/10;
		}
		
		if(igual)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, temp, menor, maior;
		boolean segmento;
		
		System.out.print("A = ");
		a = input.nextInt();
		System.out.print("B = ");
		b = input.nextInt();
		
		segmento = false;
		
		// b sempre tem o menor valor
		if(b > a) {
			temp = a;
			a = b;
			b = temp;
		}

		// Guarda os valores
		maior = a;
		menor = b;
		
		while(a > 0) {
			if(encaixa(a,b)) {
				segmento = true;
				break;
			}
			a = a / 10;
		}
		
		if(segmento) {
			System.out.println("%d eh segmento de %d" .formatted(menor,maior));
		}
		else {
			System.out.println("%d nao eh segmento de %d" .formatted(menor,maior));
		}
		input.close();
	}

}
