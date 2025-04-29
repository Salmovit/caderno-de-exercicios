package funcoes_pt1;

import java.util.Scanner;

public class Exercicio01 {
	
	public static int contaDigitos(int n, int d) {
		int count = 0;
		
		if(d > 0 && d <= 9) {
			while(n > 0) {
				if(n % 10 == d) {
					count++;
				}
				n = n / 10;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		boolean permutacao;
		
		System.out.print("a = ");
		a = input.nextInt();
		
		System.out.print("b = ");
		b = input.nextInt();
		
		permutacao = true;
		
		for(int i = 1; i <= 9; i++) {
			if(contaDigitos(a,i) != contaDigitos(b,i)) {
				permutacao = false;;
			}
		}
		
		if(permutacao) {
			System.out.println("%d eh permutacao de %d" .formatted(a,b));
		}
		else {
			System.out.println("%d nao eh permutacao de %d" .formatted(a,b));
		}
		
		input.close();
	}

}
