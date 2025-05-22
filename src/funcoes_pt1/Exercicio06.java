package funcoes_pt1;

import java.util.Scanner;

public class Exercicio06 {
	
	 static final double PI = 3.14;
	
	static double arctan(double x) {
		double erro, termo, resultado;
		int k;
		
		erro = 0.0001;
		resultado = k = 0;
		termo = x;

		while(Math.abs(termo) >= erro) {
			resultado += termo;
			k++;
			termo = Math.pow(-1, k) * Math.pow(x, 2*k+1) / (2*k+1);
		}	
		return resultado;
	}
	
	static double graus(double radiano) {
		return radiano * 180/PI;
	}
	
	static double angulo(double x, double y){
		if(x >= 0 && y >= 0) {
			if(y < x) {
				return graus(arctan(y/x));
			}
			else {
				return graus((PI/2) - arctan(x/y));
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x, y, menor, menorX, menorY, resultado;
		int n;
		
		System.out.print("N = ");
		n = input.nextInt();

		menor = 90;
		menorX = 0; menorY = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("(x,y) = ");
			x = input.nextDouble();
			y = input.nextDouble();
			
			resultado = angulo(x,y);
			if(x < 0 || y < 0) {
				System.out.println("Valores invalidos.");
			}
			else {
				if(resultado < menor) {
					menor = resultado;
					menorX = x;
					menorY = y;
				}
				System.out.println("(%.0f,%.0f) = %.2f" .formatted(x,y,resultado));
			}
		}
		
		System.out.println("O ponto que forma o menor angulo com o eixo horizontal eh (%.0f,%.0f)" .formatted(menorX,menorY));
		
		input.close();
	}

}
