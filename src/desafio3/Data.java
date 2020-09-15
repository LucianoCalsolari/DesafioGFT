package desafio3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Data {

	public static void main(String[] args) {
		Date data;
		
		data = new Date();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva uma data : ");
		
		sc.next();
		data  = sc.hasNextLong();
		System.out.println("Data Escolhida : " + data);
		
		sc.close();
	}

}
