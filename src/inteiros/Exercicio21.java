package inteiros;

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, num, prev;
		int segmentos;
		
		System.out.print("N = ");
		n = input.nextInt();
		System.out.print("Num = ");
		prev = input.nextInt();
		
		segmentos = 1;
		
		for(int i = 1; i < n; i++) {
			System.out.print("Num = ");
			num = input.nextInt();
			
			if(num != prev) 
				segmentos++;
				
			prev = num;
		}
		
		System.out.println("A sequencia e composta por " + segmentos + " segmento(s).");
		input.close();
	}

}
