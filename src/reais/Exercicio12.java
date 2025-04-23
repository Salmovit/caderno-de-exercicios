package reais;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double populacao_Uaua = 24665;
		double populacao_Ny = 4320;
		double x, y;
		int anos;
		
		System.out.println("Populacao de Uaua = " + populacao_Uaua + " habitantes.");
		System.out.println("Populacao de New York = " + populacao_Ny + " habitantes.");
		System.out.println();
		
		System.out.print("Taxa de rescimento anual da populacao de Uaua (em %) = ");
		x = input.nextDouble();
		x = x / 100;
		
		System.out.print("Taxa de crescimento anual da populacao de Nova York (em %) = ");
		y = input.nextDouble();
		y = y / 100;
		
		anos = 0;
		
		if(y <= x) {
			System.out.println("A população de Nova York nao superara a de Uaua.");
		}
		else {
			while(populacao_Ny <= populacao_Uaua) {
				populacao_Ny += populacao_Ny*y;
				populacao_Uaua += populacao_Uaua*x;
				anos++;
			}
			System.out.println("A populacao de Nova York ultrapassara a de Uaua em " + anos + " anos");

		}
		
		input.close();
	}

}
