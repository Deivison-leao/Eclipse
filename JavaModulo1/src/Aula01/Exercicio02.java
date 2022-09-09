package Aula01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	
		Scanner imput = new Scanner(System.in);

		System.out.println("Por favor, digite o valor do salário base ");
			float salbase = imput.nextFloat();
				System.out.println("Por favor, digite o valor da gratificação ");
					float gratif = imput.nextFloat();
						float salbruto = salbase + gratif;
									

							System.out.println("Salário Bruto "+ salbruto);
							
							if (salbruto <= 1000) {System.out.println(20/100*salbruto);
								}
		

	}

}
