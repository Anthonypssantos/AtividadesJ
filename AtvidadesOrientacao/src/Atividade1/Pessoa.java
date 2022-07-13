package Atividade1;

import javax.swing.JOptionPane;

public class Pessoa {
	
	Universidade univ = new Universidade();
	String unive;
	private String Pessoa;
	
	public String getPessoa() {
		
		JOptionPane.showMessageDialog(null, "Nome: "+Pessoa);
		
		return Pessoa;
	}

	public void setPessoa(String pessoa) {
		Pessoa = pessoa;
	}
	
	public void genios() {
		
		JOptionPane.showMessageDialog(null, "Nome: Albert Einsten\nNascido em 14/03/1879\nProfessor em Princeton em Nova Jersey\n=======================\nNome: isaac Newton\nNascido em 04/01/1643\nProfessor em Cambrige na inglaterra");
		
	}

	
	
}
