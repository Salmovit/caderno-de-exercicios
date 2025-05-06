package funcoes_pt1;

import java.util.Scanner;

public class Exercicio05 {
	
	public static int mdc(int a, int b) {
		int resto;
		
		resto = a % b;
		a = b;
		b = resto;
		
		while(resto > 0) {
			resto = a % b;
			a = b;
			b = resto;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, a, b, mdc;
		
		System.out.print("N = ");
		n = input.nextInt();
		
		System.out.print("num = ");
		a = input.nextInt();
		System.out.print("num = ");
		b = input.nextInt();
		
		mdc = mdc(a,b);
		
		for(int i = 2; i < n; i++) {
			System.out.print("num = ");
			a = input.nextInt();
			mdc = mdc(mdc,a);
		}
		System.out.println("MDC = %d" .formatted(mdc));
		input.close();		
	}

}
