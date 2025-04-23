package inteiros;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, aux;
		
		System.out.print("A = ");
		a = input.nextInt();
		System.out.print("B = ");
		b = input.nextInt();
		System.out.print("C = ");
		c = input.nextInt();
		
		if(b < a && b < c) {
			aux = a;
			a = b;
			b = aux;
		}
		else if(c < a && c < b) {
			aux = a;
			a = c;
			c = aux;
		}
		
		if(c < b) {
			aux = b;
			b = c;
			c = aux;
		}
		
		System.out.println("Ordem crescente: " + a + " " + b + " " + c);
		
		input.close();
	}

}
