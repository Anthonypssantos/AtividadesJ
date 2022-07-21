package Atividade;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa{

	//add aluno
	
	Pessoa pes = new Pessoa();
	
	mostraDados mod = new mostraDados();
	
	String nome, curso;
	int idade;
	
	public void alun() {
		
		nome = JOptionPane.showInputDialog("Coloque seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Coloque sua idade"));
		curso = JOptionPane.showInputDialog("Coloque o curso atual que está cursando");
		
		pes.setNome(nome);
		pes.setIdade(idade);
		pes.setCurso(curso);
		
	}
	
	public void pesso() {
		
		nome = JOptionPane.showInputDialog("Coloque seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Coloque sua idade"));
		
		pes.setNome(nome);
		pes.setIdade(idade);
			
	}
	
	public void mostraDados1() {
		
		JOptionPane.showMessageDialog(null, "Nome: "+pes.getNome()+ "\nIdade: "+pes.getIdade());	
	
	}
	
	public void mostraDados2() {
		
		JOptionPane.showMessageDialog(null, "Nome: "+pes.getNome()+ "\nIdade: "+pes.getIdade()+"\nCurso: "+pes.getCurso());	
	
	}
	

	
}
