package br.com.generation.ProjetoSaudeJA;

public class QuestionaPaciente extends Paciente  {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		int soma = 0;int cont;
	
	int pgt1 = p1.pergunta1();
	int pgt2 = p1.pergunta2();
	int pgt3 = p1.pergunta3();
	int pgt4 = p1.pergunta4();
	int pgt5 = p1.pergunta5();
	String pgt6 = p1.pergunta6();
	int pgt7 = p1.pergunta7();
	
	soma = pgt1+pgt2+pgt3+pgt4+pgt5;
	
	
	System.out.println("você tem os sintomas principais do COVID");
	}
    
	}
	

	
		
	


