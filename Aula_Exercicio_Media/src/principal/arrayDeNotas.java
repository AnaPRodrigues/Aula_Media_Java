package principal;

import java.util.Scanner;

/*1 - A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, 
ficou de recuperação ou foi reprovado. 
A média de aprovação é >= 7.0; 
a média de recuperação é >= 5.0 e < 7.0; e 
a média do reprovado é < 5.0*/

public class arrayDeNotas {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	String[] nomesAlunos = new String [5];
	Double[] notasAlunos = new Double [5];
	double media = 0;
	
	for (int i = 0; i < 5; i++) {
	
		System.out.printf("Digite o nome do aluno n°: %d \n", i+1);
		nomesAlunos[i] = leia.nextLine();
		
		System.out.printf("Digite a nota do aluno n°: %d \n", i+1);
		notasAlunos[i] = leia.nextDouble();
		leia.nextLine();
		media += notasAlunos[i];
	}
	
	media = media/5;
	
	System.out.println("A média dos alunos é "+ media);
	
	leia.close();
	}
	
}
