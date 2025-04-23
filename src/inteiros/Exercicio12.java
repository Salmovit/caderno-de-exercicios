package inteiros;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		int quociente, resto;
		
		System.out.print("A = ");
		a = input.nextInt();
		System.out.print("B = ");
		b = input.nextInt();
		
		System.out.print("MDC(" + a + "," + b + ") = ");
		quociente = a / b;
		resto = a % b;
		
		a = b;
		b = resto;
		
		while(resto > 0) {
			quociente = a / b;
			resto = a % b;
				
			a = b;
			b = resto;
		}
		System.out.print(a);
		
		input.close();
	}

}
