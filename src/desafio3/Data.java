package desafio3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Data {

	public static void main(String[] args) {
		Date data;
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");

		System.out.println("Escreva uma data separado com '-' : ");
		
		try {
			data = formatador.parse(sc.nextLine());
			System.out.println("Data valida ");
		} catch (ParseException e) {
			
			System.out.println("Isso não é uma data correta"); ;
		}	

		sc.close();
	}

}
