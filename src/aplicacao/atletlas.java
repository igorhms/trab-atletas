package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class atletlas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		char sexo, resposta;
		double altura, peso;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);
		while (sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo!= 'f'){
			System.out.println("Valor digitado está incorreto. Tente novamente.");
			System.out.print("Sexo: ");
			sexo = sc.next().charAt(0);
		}
		System.out.print("Altura: ");
		altura = sc.nextDouble();
		while (altura < 0){
			System.out.println("O valor deve ser positivo. Tente novamente.");
			System.out.print("Altura: ");
			altura = sc.nextDouble();
		}
		System.out.print("Peso: ");
		peso = sc.nextDouble();
		while (peso < 0){
			System.out.println("O valor deve ser positivo. Tente novamente.");
			System.out.print("Peso: ");
			peso = sc.nextDouble();
		}
		System.out.print("Digitar outro atleta (S/N)? ");
		resposta = sc.next().charAt(0);

		
		
		
		sc.close();
	}

}
