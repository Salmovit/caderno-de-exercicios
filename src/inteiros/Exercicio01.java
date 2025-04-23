package inteiros;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.print("n: ");
		n = input.nextInt();
		
		while(n > 0) {
			System.out.println(n + "^2 = " + n*n);
			System.out.print("n: ");
			n = input.nextInt();
		}
		System.out.println("Encerrando...");
		input.close();
	}

}
