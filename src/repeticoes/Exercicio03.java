package repeticoes;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m, n;
		double resultado, resultadoMax;
		int xMax, yMax;
		
		System.out.print("M = ");
		m = input.nextInt();
		System.out.print("N = ");
		n = input.nextInt();
		
		resultadoMax = 0;
		xMax = 0;
		yMax = 0;
		for(int x = 0; x <= m; x++) {
			for(int y = 0; y <= n; y++) {
				resultado = x*y - x*x + y;
				if(resultado > resultadoMax) {
					resultadoMax = resultado;
					xMax = x;
					yMax = y;
				}
			}
		}
		
		System.out.println("O valor maximo da expressao e " + resultadoMax + " obtido com o par (" + xMax + "," + yMax + ").");
		input.close();
	}

}
