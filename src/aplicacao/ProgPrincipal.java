package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class ProgPrincipal {

	public static void main(String[] args) {
	/*
	A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos números 0 a 9.
	Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de estudantes que vão
	alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e email do
	estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
	um relatório de todas ocupações do pensionato, por ordem de quarto,conforme exemplo.
	*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o numero de reservas: ");
		int n = sc.nextInt();
		
		Aluno[] vetor = new Aluno[10];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("Reserva #%d%n",i+1);
			System.out.print("Nome do Aluno: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			vetor[quarto] = new Aluno(nome, email);
			
		}
		
		System.out.println("Reservas!!!");
		System.out.println();
		
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println("Quarto #" + i + ", Nome: " + vetor[i].getNome() + ", Email: " + vetor[i].getEmail());
			}
		}
		
		sc.close();
	}

}
