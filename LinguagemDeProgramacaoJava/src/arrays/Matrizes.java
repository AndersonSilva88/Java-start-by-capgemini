package arrays;

import javax.swing.JOptionPane;

public class Matrizes {
	
	public static void main(String[] args) {
		String [] alunos = {"ANDERSON", "JOSE", "MARIA"};
		
		float [][] notas = new float[3][4];
		
		float somaNotas, mediaAluno;
		
		String statusAluno;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Aluno :"+ alunos[i]);
			somaNotas = 0;
			mediaAluno = 0;
			for(int j = 0; j < 4; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Digite as notas : " + (j+1) + " do aluno " + alunos[i] ));
				somaNotas = somaNotas + notas[i][j];
			}
			
			mediaAluno = somaNotas / 4;
			if(mediaAluno < 6) {
				statusAluno = "REPROVADO";
			} else if (mediaAluno >= 6 && mediaAluno < 7 ) {
				statusAluno = "EM RECUPERACAO";
			} else {
				statusAluno = "APROVADO";
			}
			
			System.out.println("\n------ BOLETIM --------");
			System.out.println("Aluno.: " + alunos[i]);
			System.out.println("Notas");
			for(int j1 = 0; j1 < 4; j1++) {
				System.out.println((j1+1) + " - " + notas[i][j1]);
			}
			System.out.println("Media ..: " + mediaAluno + " - " + statusAluno);
		}
	}

}
