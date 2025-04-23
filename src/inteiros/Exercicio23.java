package inteiros;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, num;
		int digito, reverso;

		System.out.print("N = ");
		n = input.nextInt();
		
		num = n;
		reverso = 0;
		
		while(n > 0) {
			digito = n % 10;
			reverso = reverso * 10 + digito;
			n = n / 10;
		}
		
		if(num == reverso)
			System.out.println("O numero " + num + " e palindromo.");
		else
			System.out.println("O numero " + num + " nao e palindromo.");
		
		input.close();
	}

}
