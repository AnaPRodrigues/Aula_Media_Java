package principal;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.printf("Sua média é : %.1f \n", media);
		
		if (media >= 7) {
			System.out.println("Você foi aprovado! :D ");
		} else if (media >= 5) {
			System.out.println("Você ficou de recuperação! :| ");
		} else {
			System.out.println("Você foi reprovado! :( ");
		}
		
		leia.close();
	}

}
