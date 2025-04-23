package inteiros;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nVendas, maiorVenda, diaMaiorVenda;
		
		System.out.println("Numero de vendas diarias no mes de marco:");
		
		// Computa o primeiro dia do mes
		System.out.print("Vendas no dia 1 = ");
		nVendas = input.nextInt();
		
		// Assume que a maior venda ocorreu no primeiro dia
		maiorVenda = nVendas;
		diaMaiorVenda = 1;
		
		for(int dia = 2; dia <= 31; dia++) {
			System.out.print("Vendas no dia " + dia + " = ");
			nVendas = input.nextInt();
			if(nVendas > maiorVenda) {
				maiorVenda = nVendas;
				diaMaiorVenda = dia;
			}
		}
		System.out.println("A maior venda ocorreu no dia " + diaMaiorVenda + " = " + maiorVenda + " discos vendidos.");
		input.close();
	}

}
