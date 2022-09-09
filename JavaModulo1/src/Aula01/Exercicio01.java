package Aula01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
	
		String reprovado;
		String recuperação; 
		String aprovado;
		String destaque; 
	

		Scanner imput = new Scanner(System.in);

		System.out.println("Digite o nome do Aluno: ");
		String nome = imput.nextLine();

		System.out.println("Digite a nota 1: ");
		float nota1 = imput.nextFloat();

		System.out.println("Digite a nota 2: ");
		float nota2 = imput.nextFloat();

		System.out.println("Digite a nota 3: ");
		float nota3 = imput.nextFloat();

		float media = (nota1+nota2+nota3)/3f; 
		
		System.out.printf("Média do Aluno: " + media+ "\n");
		
		if (media > 8.0 && media <=10)  {
			
			System.out.println("Você é um aluno Destaque");
		}
		else if (media > 6.0 && media <= 8){
			System.out.println("Você está aprovado.");
		}
		else if (media >4.0 && media <= 6.0) {
			System.out.println("Você está em recuperação");
		}
		else {
			System.out.println("Você está reprovado");
		}

	}

}
