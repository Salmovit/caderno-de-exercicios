package funcoes_pt2;

import java.util.Scanner;

public class Exercicio02 {
	
	public static boolean bissexto(int ano) {
		if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
			return true;
		}
		else return false;
	}
	
	public static void diaSeguinte(int dia, int mes, int ano) {
		if(dia > 31 || mes > 12) {
			System.out.println("Data invalida.");
		}
		else if(dia == 31) {
			if(mes == 12) {
				dia = 1;
				mes = 1;
				ano = ano + 1;
				System.out.println("Dia seguinte: %d/%d/%d" .formatted(dia,mes,ano));
		}	else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) {
			dia = 1;
			mes = mes + 1;
			System.out.println("Dia seguinte: %d/%d/%d" .formatted(dia,mes,ano));
		}	else {
			System.out.println("Data invalida.");
		}
		}
		else if(dia == 30) {
			if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				dia = 1;
				mes = mes + 1;
				System.out.println("Dia seguinte: %d/%d/%d" .formatted(dia,mes,ano));
			} else {
				System.out.println("Data invalida.");
			}
		}
		else if(dia == 29 && mes == 2) {
			if(bissexto(ano)) {
				dia = 1;
				mes = mes + 1;
				System.out.println("Dia seguinte: %d/%d/%d" .formatted(dia,mes,ano));
			} else
				System.out.println("Data invalida.");
		}
		else if(dia == 28 && mes == 2 && !bissexto(ano)) {
			dia = 1;
			mes = mes + 1;
			System.out.println("Dia seguinte: %d/%d/%d" .formatted(dia,mes,ano));
		}
		else {
			dia = dia + 1;
			System.out.println("Dia seguinte: %d/%d/%d" .formatted(dia,mes,ano));
		}
	}
	
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		int n;
		int ano, mes, dia;
		
		System.out.print("N = ");
		n = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("dia = ");
			dia = input.nextInt();
			System.out.print("mes = ");
			mes = input.nextInt();
			System.out.print("ano = ");
			ano = input.nextInt();
			
			diaSeguinte(dia,mes,ano);
		}
		
		input.close();		
	}

}
