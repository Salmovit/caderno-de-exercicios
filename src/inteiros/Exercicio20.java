package inteiros;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2;
		int soma;
		
		for(int i = 1000; i < 10000; i++) {
			n1 = i/100;
			n2 = i%100;
			soma = n1 + n2;
			
			if(soma*soma == i)
				System.out.println(i);
		}
		input.close();
	}

}
