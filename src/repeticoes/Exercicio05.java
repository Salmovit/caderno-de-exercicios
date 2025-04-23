package repeticoes;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m, j;
		int count = 0;
		
		System.out.print("M = ");
		m = input.nextInt();
		
		j = 1;
		for(int i = 1; i <= m; i++) {
			System.out.print(i + "^3 = ");
			while(count < i) {
				if(j % 2 != 0) {
					count++;
					if(count == i) {
						System.out.print(j + " ");
					}
					else
						System.out.print(j + " + ");
				}
				j++;
			}
			System.out.println();
			count = 0;
		}
		
		input.close();
	}

}
