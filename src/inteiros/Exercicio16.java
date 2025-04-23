package inteiros;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int binario, decimal;
		int exp;
		
		System.out.print("Binario = ");
		binario = input.nextInt();
		
		decimal = 0;
		exp = 0;
		for(; binario > 0; binario /= 10)			// Enquanto o quociente nao for zero, divide o binario por 10
			decimal += (binario%10) * (1 << exp++);	// soma da multiplicacao do resto da divisao pela potencia de 2 da casa decimal
		
		System.out.println("Decimal = " + decimal);
		input.close();
	}

}
