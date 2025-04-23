package repeticoes;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int num, seqPrev, seq;
		int count, paridade;
		int flag = 1;		// Assume que a sequencia eh alternante no inicio
		
		System.out.print("N = ");
		n = input.nextInt();
		
		// Le o primeiro numero inicia os contadores e descobre a paridade
		System.out.print("num = ");
		num = input.nextInt();
		count = 1;
		seq = 1;
		seqPrev = 0;
		
		paridade = num % 2;
		
		
		while(count < n) {
			System.out.print("num = ");
			num = input.nextInt();
			count++;
			
			if((num % 2) != paridade) {
				seqPrev = seq;
				seq = 1;
				paridade = num % 2;
				while((num % 2) == paridade && count < n) {
					System.out.print("num = ");
					num = input.nextInt();
					count++;
					
					if((num % 2) == paridade)	// se a paridade for a mesma incrementa o contador da sequencia
						seq++;
					else {						// se nao reseta os contadores e atribui a nova paridade
						seqPrev = seq;
						seq = 1;
						paridade = num % 2;
					}
				}
				
				if(seq != seqPrev)				// Se as sequencias nao tem o mesmo tamanho entao nao eh alternatne
					flag = 0;	
			}
			else 
				seq++;
		}
		
		if(flag == 1 ) {
			System.out.println("A sequencia eh " + seq + "-alternante.");
		}
		else {
			System.out.println("A sequencia nao eh alternante.");
		}
		input.close();
		
	}

}
