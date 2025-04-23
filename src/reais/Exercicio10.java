package reais;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		double termo, resultado;
		
		System.out.print("n = ");
		n = input.nextInt();
		
		termo = resultado = 0;
		
		for(int i = 0; i < n; i++) {
			termo = (i+1D)/(n-i);
			resultado += termo;
		}
		
		System.out.println("Resultado = %.4f" .formatted(resultado));
		input.close();
	}

}
