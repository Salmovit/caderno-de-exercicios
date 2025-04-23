package reais;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double angulo, radiano, erro, resultado;
		double termo;
		int k;
		
		System.out.print("x = ");
		angulo = input.nextDouble();
		
		System.out.print("epsilon = ");
		erro = input.nextDouble();
		
		radiano = angulo * 3.1415/180;
		
		resultado = termo = radiano;
		k = 1;
		
		while(termo >= erro || termo <= -erro) {
			termo = -(termo*radiano*radiano)/ ((2*k + 1)*2*k);
			resultado += termo;
			k += 1;
		}
		
		System.out.println("Sen(%.0f) =  %.5f" .formatted(angulo,resultado));
		
		input.close();
	}

}