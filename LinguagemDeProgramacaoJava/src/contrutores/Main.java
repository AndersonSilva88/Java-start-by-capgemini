package contrutores;

import contrutores.Aluno.STATUS;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(9,9,8);
		
		double mediaAlunoFinal = aluno.calcularMediaAluno();
		
		if (mediaAlunoFinal >= 7) {
			aluno.situacaoAluno = STATUS.APROVADO;
		} else {
			aluno.situacaoAluno = STATUS.REPROVADO;
		}
		
		System.out.println("A M�dia do Aluno � : " + aluno.calcularMediaAluno() + " e o aluno est�: " + aluno.situacaoAluno);

	}

}
