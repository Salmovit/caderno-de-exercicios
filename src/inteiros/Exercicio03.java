package inteiros;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, i, cont;
		
		System.out.print("N: ");
		n = input.nextInt();
		
		i = 1;
		cont = 0;
		
		while(cont != n) {
			if(i % 2 != 0) { 	// i eh impar
				System.out.print(i + " ");
				cont++;
			}
			i++;
		}
		input.close();
	}

}
