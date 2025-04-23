package reais;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, aprovados, reprovados;
		double nota1, nota2, nota3;
		double mediaAluno, mediaClasse;
		
		System.out.print("n (numero de alunos) = ");
		n = input.nextInt();
		
		aprovados = reprovados = 0;
		mediaClasse = 0;
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Nota da primeira prova = ");
			nota1 = input.nextDouble();
			System.out.print("Nota da segunda prova = ");
			nota2 = input.nextDouble();
			System.out.print("Nota da terceira prova = ");
			nota3 = input.nextDouble();
			
			mediaAluno = (nota1 + nota2 + nota3)/3;
			
			if(mediaAluno >= 5.0) {
				aprovados++;
			}
			else {
				reprovados++;
			}
			
			System.out.println("Media do aluno %d = %.2f" .formatted(i, mediaAluno));
			System.out.println();
			mediaClasse += mediaAluno;
		}
		
		mediaClasse = mediaClasse/n;
		System.out.println("Media da classe = %.2f" .formatted(mediaClasse));
		System.out.println("Aprovados = %d || Reprovados = %d" .formatted(aprovados, reprovados));
		
		input.close();
	}

}
