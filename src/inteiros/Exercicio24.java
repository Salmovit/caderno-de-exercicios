package inteiros;

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String p, q;
		boolean flag = false;
		
		System.out.print("p = ");
		p = input.nextLine();
		System.out.print("q = ");
		q = input.nextLine();
		
		for(int i = 0; i < q.length(); i++)
			for(int j = i + 1; j <= q.length(); j++) 
				if(p.equals(q.substring(i,j))) {
					flag = true;
					break;
				}
		
		if(flag)
			System.out.println("p e subnumero de q.");
		else
			System.out.println("p nao e subnumero de q.");

		input.close();
	}

}
