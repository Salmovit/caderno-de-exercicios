package reais;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c;
		double delta, raiz1, raiz2;
		double real, complexa;
		
		System.out.print("a = ");
		a = input.nextDouble();
		System.out.print("b = ");
		b = input.nextDouble();
		System.out.print("c = ");
		c = input.nextDouble();
		
		delta = b*b - 4*a*c;
		
		if(delta > 0) {	// Equacao tem duas raizes reais diferentes
			raiz1 = -(b + Math.sqrt(delta))/ (2*a);
			raiz2 = -(b - Math.sqrt(delta))/ (2*a);
			System.out.println("raiz 1 = %f" .formatted(raiz1));
			System.out.println("raiz 2 = %f" .formatted(raiz2));
		}
		else if(delta == 0) {	// Equacao possui uma unica raiz
			raiz1 = -(b + Math.sqrt(delta))/ (2*a);
			System.out.println("raiz = %f" .formatted(raiz1));
		}
		else {	// Equcao nao possui raiz real
			real = -b/(2*a);
			complexa = Math.sqrt(delta * (-1)) / (2*a);
			System.out.println("raiz 1 = %f + %fi" .formatted(real, complexa));
			System.out.println("raiz 2 = %f + %fi" .formatted(real, complexa));
		}
		
		input.close();

	}

}
