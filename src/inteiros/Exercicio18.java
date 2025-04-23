package inteiros;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, aux;
		
		System.out.print("A = ");
		a = input.nextInt();
		System.out.print("B = ");
		b = input.nextInt();
		System.out.print("C = ");
		c = input.nextInt();
		
		if(b > a && b > c) {
			aux = a;
			a = b;
			b = aux;
		}
		else if(c > a && c > b) {
			aux = a;
			a = c;
			c = aux;
		}
		
		if(a*a == b*b + c*c)
			System.out.println("O triangulo e retangulo.");
		else
			System.out.println("O triangulo nao e retangulo.");
		
		input.close();
	}

}
