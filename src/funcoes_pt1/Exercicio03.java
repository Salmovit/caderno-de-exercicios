package funcoes_pt1;

import java.util.Scanner;

public class Exercicio03 {
	
	public static int bloco(int n) {
		Scanner input = new Scanner(System.in);
		int num, paridade;
		boolean diferente = false;
		
		System.out.print("num = ");
		num = input.nextInt();
		
		paridade = num % 2;
		
		for(int i = 1; i < n; i++) {
			System.out.print("num = ");
			num = input.nextInt();
			
			if(paridade != num % 2) {
				diferente = true;
			}
		}
		input.close();
		
		if(diferente) 
			return -1;
		else return paridade;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, i, m;
		int paridade, paridadePrev;
		boolean piramidal;
		
		System.out.print("N = ");
		n = input.nextInt();
		
		i = 1;
		m = 1;
		
		// Checa se n pode encaixar em m blocos de numeros
		while(i < n) {
			m++;
			i += m;
		}
		
		if(i > n) {
			System.out.println("Nao eh piramidal alternante");
		}
		else {
			piramidal = true;
			paridade = bloco(1);
			i = 1;
			m = 2;
			
			while(i < n) {
				paridadePrev = paridade;
				paridade = bloco(m);
				if(paridade == -1 || paridade == paridadePrev) {
					piramidal = false;
				}
				m++;
				i = i + m;
			}

			if(piramidal) {
				System.out.println("Eh piramidal %d-alternante" .formatted(m-1));
			}
			else {
				System.out.println("Nao eh piramidal alternante");
			}
		}
		input.close();

	}
}

