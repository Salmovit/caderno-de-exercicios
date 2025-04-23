package reais;

import java.util.Scanner;

public class Exercicio04 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int n, count;
		float x, y;
		
		System.out.print("N = ");
		n = input.nextInt();
		count = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("(x,y) = ");
			x = input.nextFloat();
			y = input.nextFloat();
			
			if(x <= 0 && y <= 0 && (y + x*x + 2*x - 3) <= 0) {
				System.out.println("(" + x + "," + y + ") Pertence a H1");
				count++;
			}
			else if(x >= 0 && (y + x*x - 2*x - 3) <= 0) {
				System.out.println("(" + x + "," + y + ") Pertence a H2");
				count++;
			}
			else {
				System.out.println("(" + x + "," + y + ") Nao pertence a H");
			}
		}
		
		System.out.println(count + " pares de numeros pertencem ao conjunto H.");
		input.close();
	}

}
