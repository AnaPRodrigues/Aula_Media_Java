package principal;

import java.util.Scanner;

public class ArrayNotasProfessor {

	public static void main(String[] args) {
		String[] nomes = new String[5];
		double[] notas = new double[5];
		double media = 0;
		double soma = 0;

		for (int i = 0; i <= 4; i++) {

			System.out.println("Entre com o nome do aluno n° " + (i + 1));
			nomes[i] = new Scanner(System.in).nextLine();

			System.out.println("Entre com a nota do aluno n° " + (i + 1));
			notas[i] = new Scanner(System.in).nextDouble();

			soma = soma + notas[i];

		}

		media = soma / 5;

		System.out.println("A média dos alunos é " + media);
		System.out.println("Lista dos alunos cuja a nota é superir a media da turma é");

		for (int i = 0; i <= 4; i++) {
			if (notas[i] > media) {
				System.out.println(nomes[i]);
			}
		}

	}

}
