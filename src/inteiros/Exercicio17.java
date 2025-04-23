package inteiros;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decimal, binario;
		int pot;
		
		System.out.print("Decimal = ");
		decimal = input.nextInt();
		
		pot = 1;
		binario = 0;
		for(; decimal > 0; decimal /= 2) {	// Enquanto o quociente nao for zero, divide o decimal por 2
			binario += decimal%2 * pot;		// soma da multiplicacao do resto da divisao pela potencia de 10 da casa decimal
			pot *=10;
		}
		
		System.out.println("Binario = " + binario);
		input.close();
	}

}
