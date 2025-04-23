package reais;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		double h;
		
		System.out.print("N = ");
		n = input.nextInt();
		
		h = 0;
		
		for(int i = 1; i <= n; i++) {
			h += (double)1/i;
		}
		
		System.out.println("H(" + n + ") = " + h);
		input.close();
	}

}
