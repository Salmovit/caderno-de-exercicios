package funcoes_pt2;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void digitos(int n) {
		int count, digito;
		
		count = 0;
		digito = 0;
		while(n > 0) {
			digito = n % 10;
			count++;
			n = n / 10;
		}
		System.out.println("Nº de digitos = " + count + " primeiro digito = " + digito);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, num;
		
		System.out.print("N = ");
		n = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Numero = ");
			num = input.nextInt();
			digitos(num);
		}
		input.close();
	}

}
