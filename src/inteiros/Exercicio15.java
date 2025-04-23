package inteiros;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, j, m;
		int count, i;
		
		System.out.print("N = ");
		n = input.nextInt();
		
		System.out.print("J = ");
		j = input.nextInt();
		
		System.out.print("M = ");
		m = input.nextInt();
		
		count = 0;
		i = 1;
		
		System.out.println("Sao congruentes modulo " + m + " a " + j + ":");
		while(count < n) {
			if(i % m == j % m) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}
		
		input.close();
	}

}
