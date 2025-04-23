package repeticoes;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, h, a, b;
		boolean flag;
		
		System.out.print("N = ");
		n = input.nextInt();
		
		for(h = 1; h <= n; h++) {
			flag = false;
			for(a = 1; a < h && !flag; a++) {
				b = a;
				while(a*a + b*b < h*h)
					b++;
				if(a*a + b*b == h*h) {
					System.out.println("Hipotenusa = " + h + " A = " + a + " B = " + b);
					flag = true;
				}
			}
		}
		input.close();
	}

}
