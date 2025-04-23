package reais;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		double x, y;
		String c;
		
		System.out.print("n = ");
		n = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Operacao, x, y = ");
			c = input.next();
			x = input.nextDouble();
			y = input.nextDouble();
			
			switch(c) {
			case("+"):
				System.out.println("%.2f + %.2f = %.2f" .formatted(x, y, (x+y)));
				break;
			case("-"):
				System.out.println("%.2f - %.2f = %.2f" .formatted(x, y, (x-y)));
				break;
			case("*"):
				System.out.println("%.2f * %.2f = %.2f" .formatted(x, y, (x*y)));
				break;
			case("/"):
				System.out.println("%.2f / %.2f = %.2f" .formatted(x, y, (x/y)));
				break;
			default:
				System.out.println("Operacao invalida.");
			}
		}
		
		input.close();
	}

}
