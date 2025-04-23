package inteiros;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, i, j;
		int cont, num;
		
		System.out.print("N = ");
		n = input.nextInt();
		System.out.print("I = ");
		i = input.nextInt();
		System.out.print("J = ");
		j = input.nextInt();
		
		num = 0;
		cont = 0;
		
		while(cont != n) {
			if(num % i == 0 || num % j == 0) {
				cont++;
				System.out.print(num + " ");
			}
			num++;
		}
		input.close();
	}

}
