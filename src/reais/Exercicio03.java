package reais;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		float x, y;
		
		System.out.println("(x,y) pertence a H se x >= 0 e y >= 0 | x*x + y*y <= 1");
		System.out.println();
		
		System.out.print("N = ");
		n = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("(x,y) = ");
			x = input.nextFloat();
			y = input.nextFloat();
			
			if(x >= 0 && y >= 0 && (x*x + y*y) <= 1) {
				System.out.println("(" + x + "," + y + ") Pertence a H");
			}
			else {
				System.out.println("(" + x + "," + y + ") Nao pertence a H");
			}
		}
		
		input.close();
	}

}
