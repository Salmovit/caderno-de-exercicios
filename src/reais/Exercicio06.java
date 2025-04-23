package reais;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double angulo, radiano, resultado, termo;
		int n;
		
		System.out.print("x (angulos) = ");
		angulo = input.nextDouble();
		
		System.out.print("n = ");
		n = input.nextInt();
		
		radiano = angulo * 3.1415/180;
		
		resultado = termo = 1;
		
		for(int i = 1; i < 2*n; i+=2) {
			termo = termo * (-1) * radiano * radiano / (i*(i+1));
			resultado += termo;
		}
		
		System.out.println("Cos(%.0f) =  %.5f" .formatted(angulo,resultado));
		input.close();
	}

}