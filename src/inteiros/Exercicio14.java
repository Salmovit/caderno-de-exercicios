package inteiros;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		double fat;
		
		System.out.print("N = ");
		n = input.nextInt();
		
		if(n >= 0) {
			fat = 1;
			
			for(int i = 1; i <= n; i++)
				fat *= i;
			
			System.out.println("N! = " + fat);
		}
		else {
			System.out.println("N negativo.");
		}
		
		input.close();
	}

}
