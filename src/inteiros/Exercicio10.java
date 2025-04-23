package inteiros;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		boolean triangular = false;
		
		System.out.print("N = ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i*(i+1)*(i+2) == n) {
				System.out.println(n + " = " + i + " * " + (i+1) + " * " + (i+2));
				triangular = true;
				break;
			}
		}
		
		if(!triangular) {
			System.out.println("Nao e triangular.");
		}
		
		input.close();
	}

}
