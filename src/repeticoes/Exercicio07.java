package repeticoes;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int a, b;
		int quociente, resto;
		
		System.out.print("N = ");
		n = input.nextInt();
		
		System.out.print("num = ");
		a = input.nextInt();

		
		for(int i = 1; i < n; i++) {
			System.out.print("num = ");
			b = input.nextInt();
			
			quociente = a / b;
			resto = a % b;
			
			a = b;
			b = resto;
			
			while(resto > 0) {
				quociente = a / b;
				resto = a % b;
					
				a = b;		// MDC == a
				b = resto;
			}
		}
		
		System.out.println("MDC = " + a);
		input.close();
	}

}
