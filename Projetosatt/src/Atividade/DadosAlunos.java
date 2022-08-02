package Atividade;

import javax.swing.JOptionPane;

public class DadosAlunos {
	
	private String nome; 
	
	//2.5
	private Double nota1;
	private Double nota2;
	//2.0
	private Double trabalho;
	
	double r=0;
	
	public void tudo() {
		
		
		r = this.getNota1() + this.getNota2() + this.getTrabalho();
		
		if (r < 3.5) {
			double h;
			h = r - 7.0;
			JOptionPane.showMessageDialog(null, "Reprovado: "+ 0 + "Faltam "+ h);
			
			
		}
		if (r >= 3.5) {
			double h;
			 h = r - 7.0;
			
			JOptionPane.showMessageDialog(null, "Aprovado: "+ r +"\nFaltam "+ h);
			
		}
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getTrabalho() {
		return trabalho;
	}
	public void setTrabalho(Double trabalho) {
		this.trabalho = trabalho;
	}
	
	
	
}
