package desafio4;

import java.util.Scanner;

public class Elefante {

	public static void main(String[] args) {
		int numero = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de elefantes :");			
		numero = Integer.parseInt(sc.nextLine());
		
		for (int i = 0 ; i < numero; i++ ) {
			System.out.print(" Incomoda ");
		}
		
		System.out.print(" muito mais. ");
		sc.close();
		

	}

	
}
