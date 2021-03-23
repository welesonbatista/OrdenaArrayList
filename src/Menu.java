package src;

import java.util.Scanner;

public class Menu {
	
	LojaComputadores pichau = new LojaComputadores();

	void escolha () {
		
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		
		switch (op) {
		
		case 1: {
			System.out.println("Esse são nossos computadores na ordem Crescente");
			pichau.Crescente();
			break;
			}
		case 2: {
			System.out.println("Esse são nossos computadores na ordem Decrescente");
			pichau.Decrescente();
			break;
		}
		case 3: {
			System.out.println("Esse são nossos computadores na ordem Normal");
			pichau.Normal();
			break;
		}
		default:
		}
	}
	
}