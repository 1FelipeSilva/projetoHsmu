import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aluno;
		System.out.println("Bem vindo ao sistema de lan�amento de notas! Por favor, digite em seguida, o nome e a nota dos alunos de acordo com o enunciado.");
		System.out.println("Digite o nome completo do aluno");
		aluno = sc.nextLine();
		//Lan�amento de notas e m�dia ponderada do 1� bimestre//
		System.out.println("Digite a nota da prova do 1� Bimestre");
		float prova1 = sc.nextFloat();
		System.out.println("Digite a nota do projeto do 1� Bimestre");
		float projeto1 = sc.nextFloat();
		System.out.println("Digite a nota da lista de exerc�cio do 1� Bimestre");
		float lista1 = sc.nextFloat();
		System.out.println("Digite a nota dos projetos de software livre/ conclus�o de MOOCs recomendados pelo docente do 1� Bimestre");
		float projetoSoftware1 = sc.nextFloat();
		float resultadoMedia1B = ((prova1*3+projeto1*3+lista1*2+projetoSoftware1*3)/(3+3+2+3));
		
		//Lan�amento de notas e m�dia ponderada do 2� bimestre//
		System.out.println("Digite a nota da prova do 2� Bimestre");
		float prova2 = sc.nextFloat();
		System.out.println("Digite a nota do projeto do 2� Bimestre");
		float projeto2 = sc.nextFloat();
		System.out.println("Digite a nota da lista de exerc�cio do 2� Bimestre");
		float lista2 = sc.nextFloat();
		System.out.println("Digite a nota dos projetos de software livre/ conclus�o de MOOCs recomendados pelo docente do 2� Bimestre");
		float projetoSoftware2 = sc.nextFloat();
		float resultadoMedia2B = ((prova2*3+projeto2*3+lista2*2+projetoSoftware2*3)/(3+3+2+3));
		
		float mediaSemestre1 = ((resultadoMedia1B + resultadoMedia2B)/2);
		float notaMinima = 10-mediaSemestre1;
		
		if(mediaSemestre1 >= 8.00){
			System.out.println("A m�dia do 1� Semestre do Aluno(a) " + aluno + " � : " + mediaSemestre1);
			System.out.println("Aluno(a) aprovado(a)! Parab�ns!");
		}
		else {
			System.out.println("A m�dia do 1� Semestre do Aluno(a) " + aluno + " � : " + mediaSemestre1);
			System.out.println("Aluno(a) Reprovado(a)!");
			System.out.println("A nota m�nima necess�ria para a pontua��o na prova final �: "+ notaMinima);
		}
	
	}
	
}
